const fs = require('fs').promises;

function readAndroidVectorDrawables() {
    return fs.readdir('gen/android-vector-drawables')
        .then(filenames => filenames.filter(filename => filename.match(/ic_.+\.xml/)));
}

function generateSatsIconsObject(filenames) {
    const packageDeclaration = 'package com.sats.dna.icons\n\n';

    const importsDeclaration = [
        'import androidx.compose.runtime.Composable',
        'import androidx.compose.ui.graphics.vector.ImageVector',
        'import androidx.compose.ui.res.vectorResource',
        'import com.sats.dna.R',
    ].sort().join('\n') + '\n\n';

    const propertiesDeclaration = filenames.map(filename => {
        const propertyName = fixNameIfNeeded(camelize(filename));
        const resName = filename.replace(".xml", "");
        const indent = '    '

        return `${indent}val ${propertyName}: ImageVector\n` +
            `${indent}${indent}@Composable get() = ImageVector.vectorResource(R.drawable.${resName})`;
    }).join('\n\n')

    return packageDeclaration +
        importsDeclaration +
        'object SatsIcons {\n' +
        propertiesDeclaration +
        '\n}';
}

function saveToFile(kotlinCode) {
    return fs.writeFile('gen/SatsIcons.kt', kotlinCode)
}

function camelize(str) {
    return str
        .replace("ic_", "")
        .replace(".xml", "")
        .replace(/_([a-z]+)/g, (_, match) => match[0].toUpperCase() + match.substring(1));
}

function fixNameIfNeeded(str) {
    if (str === "class") {
        return "classFilled"
    }

    return str;
}

module.exports = () => {
    return readAndroidVectorDrawables()
        .then(generateSatsIconsObject)
        .then(saveToFile);

}
