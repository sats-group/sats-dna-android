const downloadFigmaIcons = require('./01_download-figma-icons')
const convertSvgFilesToVectorDrawables = require('./02_convert-svg-files-to-vector-drawables')
const generateSatsIconsFromVectorDrawables = require('./03_generate-sats-icons-from-vector-drawables')
const moveIconsToDna = require('./04_move-icons-to-dna')

downloadFigmaIcons()
    .then(convertSvgFilesToVectorDrawables)
    .then(generateSatsIconsFromVectorDrawables)
    .then(moveIconsToDna);
