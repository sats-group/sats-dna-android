const fs = require("fs");

const cachedResponse = require("./figma-response.json")

const TOKEN = 'paste-secret-token-here'
const FIGMA_FILE_ID = 'HB05VqMHVOr8yLlLZLG1WuYg'

function fetchFigmaFileFromCache() {
    console.log(`Loading cached file info for file with ID ${FIGMA_FILE_ID} ...`)

    return Promise.resolve(cachedResponse);
}

function fetchFigmaFileFromApi() {
    console.log(`Downloading file info for file with ID ${FIGMA_FILE_ID} ...`)

    return fetch(
        `https://api.figma.com/v1/files/${FIGMA_FILE_ID}`,
        { headers: { 'X-Figma-Token': TOKEN } }
        )
    .then(response => response.json());
}

async function fetchComponents() {
    return fetchFigmaFileFromApi()
        .then((response) => {
            return Object.entries(response.components)
                .filter(([key, value]) => value.name.startsWith("ico/24px/"))
                .map(([key, value]) => {
                    const name = value.name
                            .replaceAll("ico/24px/", "")
                            .replaceAll("/", "_")
                            .replaceAll(" ", "_")
                            .replaceAll("-", "_")
                            .toLowerCase();

                    return { key, name };
                });
        });
}

function fetchLinksToSvgIcons(components) {
    const ids = components.map((component) => component.key);

    console.log(`Downloading image URLs for ${ids.length} components ...`)

    return fetch(
        `https://api.figma.com/v1/images/${FIGMA_FILE_ID}?ids=${ids.join()}&format=svg`,
        { headers: { 'X-Figma-Token': TOKEN } }
    )
    .then(response => response.json())
    .then((json) => {
        const keys = Object.keys(json.images);

        return components.map((component) => {
            const key = component.key;

            component['url'] = json.images[key];

            return component;
        });
    });
}

function downloadIcons(links) {
    const outputDir = "tmp/dl";

    fs.mkdir(outputDir, { recursive: true }, () => {
        let count = 0;

        links.forEach((link) => {
            const url = link.url;
            const filename = `${outputDir}/ic_${link.name}.svg`;

            console.log(`${count++}. Downloading ${url} to ${filename}`)

            fetch(url)
                .then(res => res.text())
                .then(bytes => fs.writeFileSync(filename, bytes))
                .catch(e => console.error(e));
        });
    });
}

fetchComponents()
    .then(fetchLinksToSvgIcons)
    .then(downloadIcons);
