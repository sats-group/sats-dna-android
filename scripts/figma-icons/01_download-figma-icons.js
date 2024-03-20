require('dotenv').config();

const fs = require("fs");

const accessToken = process.env.FIGMA_ACCESS_TOKEN

if (!accessToken) {
    console.error("Missing FIGMA_ACCESS_TOKEN env variable");
    process.exit(1);
}

const iconsFileId = 'HB05VqMHVOr8yLlLZLG1WuYg'
const componentsFileUri = `https://api.figma.com/v1/files/${iconsFileId}/components`;

function fetchFigmaComponentsResponseFromApi() {
    console.info(`Fetching ${componentsFileUri} ...`);

    return fetchFigma(componentsFileUri, {headers: {'X-Figma-Token': accessToken}});
}

function extractComponentsFromResponse(response) {
    const allComponents = response.meta.components;
    const iconsPageIc = "2263:998"

    return allComponents
        .filter(component => component.containing_frame.pageId === iconsPageIc)
        .filter(component => component.name.startsWith("ico/24px/"));
}

function normalizeComponentNames(components) {
    return components
        .map(component => {
            const name = component.name
                .replaceAll("ico/24px/", "")
                .replaceAll("/", "_")
                .replaceAll(" ", "_")
                .replaceAll("-", "_")
                .toLowerCase();

            return {nodeId: component.node_id, name};
        });
}

function fetchLinksToSvgIcons(components) {
    const ids = components.map(component => component.nodeId);

    console.info(`Downloading image URLs for ${ids.length} components ...`);

    const url = `https://api.figma.com/v1/images/${iconsFileId}?ids=${ids.join()}&format=svg`;

    return fetchFigma(url)
        .then(json => {
            return components.map(component => {
                return {
                    nodeId: component.nodeId,
                    name: component.name,
                    url: json.images[component.nodeId],
                };
            });
        });
}

function downloadIcons(componentsWithUrls) {
    const outputDir = "gen/downloaded-figma-icons";

    fs.mkdir(outputDir, () => {
        let count = 0;

        componentsWithUrls.forEach((component) => {
            const filename = `${outputDir}/${component.name}.svg`;

            fetch(component.url)
                .then(res => res.text())
                .then(bytes => fs.writeFileSync(filename, bytes));
        });
    });
}

function fetchFigma(url) {
    return fetch(url, {headers: {'X-Figma-Token': accessToken}})
        .then(response => response.json())
        .then(json => {
            if (json.status > 299) {
                console.error(json);
                process.exit(json.status);
            }

            return json;
        });
}

fetchFigmaComponentsResponseFromApi()
    .then(extractComponentsFromResponse)
    .then(normalizeComponentNames)
    .then(fetchLinksToSvgIcons)
    .then(downloadIcons);
