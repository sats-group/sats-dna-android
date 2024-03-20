const svg2vd = require('svg2vectordrawable');
const fs = require('fs').promises;
const path = require('path');

function getSvgFiles() {
    let directory = 'gen/downloaded-figma-icons/';

    return fs.readdir(directory)
        .then(filenames => filenames.map(filename => path.resolve(directory, filename)))
        .then(files => {
            return files.map(svgFilePath => {
                return fs.readFile(svgFilePath, {encoding: 'utf8'})
                    .then(svgContent => {
                        let filename = path.basename(svgFilePath);

                        return {svgFilePath: svgFilePath, svgContent};
                    });
            });
        })
        .then(promises => Promise.all(promises));
}

function convertSvgFilesToVectorDrawables(files) {
    let options = {
        xmlTag: true,
        tint: '#FF000000',
    };

    let promises = files.map(file => {
        return svg2vd(file.svgContent, options)
            .then(vdContent => {
                return {...file, vdContent}
            });
    });

    return Promise.all(promises);
}

function saveVectorDrawables(files) {
    let outputDirectory = 'gen/android-vector-drawables/';

    return fs.access(outputDirectory, fs.constants.F_OK)
        .catch(err => fs.mkdir(outputDirectory))
        .then(() => {
            return files.map(file => {
                const vdFilePath = path.resolve(outputDirectory, "ic_" + path.basename(file.svgFilePath))
                    .replace(path.extname(file.svgFilePath), ".xml");

                return {...file, vdFilePath}
            });
        })
        .then(files => files.map(file => fs.writeFile(file.vdFilePath, file.vdContent)));
}

module.exports = () => {
    return getSvgFiles()
        .then(convertSvgFilesToVectorDrawables)
        .then(saveVectorDrawables);
}
