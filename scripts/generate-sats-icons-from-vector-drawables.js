const fs = require('fs').promises;

function readAndroidVectorDrawables() {
    return fs.readdir('./android-vector-drawables')
        .then(filenames => filenames.filter(filename => filename.match(/ic_.+\.xml/)));
}

function generateSatsIconsObject(filenames) {
    const packageDeclaration = 'package com.sats.dna.icons\n\n';

    const importsDeclaration = [
        'import androidx.compose.ui.graphics.vector.ImageVector',
        'import androidx.compose.ui.res.vectorResource',
        'import com.sats.dna.R',
    ].sort().join('\n') + '\n\n';

    const propertiesDeclaration = filenames.map(filename => {
        const propertyName = camelize(filename);
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
    return fs.writeFile('SatsIcons.kt', kotlinCode)
}

function camelize(str) {
    return str
        .replace("ic_", "")
        .replace(".xml", "")
        .replace(/_([a-z]+)/g, (_, match) => match[0].toUpperCase() + match.substring(1));
}

readAndroidVectorDrawables()
    .then(generateSatsIconsObject)
    .then(saveToFile)
    .then(console.log);
