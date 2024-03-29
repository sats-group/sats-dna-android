const fs = require('fs').promises;
const path = require('path');

const generatedResourcesDir = path.resolve('gen/android-vector-drawables/');
const generatedSatsIconsKtPath = path.resolve('gen/SatsIcons.kt');

const dnaPath = path.resolve('../../sats-dna/src/main/');
const outputResourcesDir = `${dnaPath}/res/drawable/`;
const outputSatsIconsKtPath = `${dnaPath}/kotlin/com/sats/dna/icons/SatsIcons.kt`;

function moveResourcesToDna() {
    return fs.readdir(generatedResourcesDir)
        .then(filenames => {
            return filenames.map(filename => {
                const oldPath = path.resolve(generatedResourcesDir, filename);
                const newPath = path.resolve(outputResourcesDir, filename);

                return fs.copyFile(oldPath, newPath);
            });
        })
        .then(promises => Promise.all(promises));
}

function moveSatsIconsKtToDna() {
    return fs.copyFile(generatedSatsIconsKtPath, outputSatsIconsKtPath);
}

module.exports = () => {
    return moveResourcesToDna()
        .then(moveSatsIconsKtToDna);
}
