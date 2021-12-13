const path = require('path');
const glob = require("glob");
const target = process.env.npm_lifecycle_event;

const filePath = {
    src: path.join(__dirname, '/src/main/resources/static/scripts'),
    build: path.join(__dirname, '/src/main/resources/static/public')
};

let entries = {} ;
let strPath = filePath.src.split('\\').join('/')  ;

glob.sync(filePath.src + '/**/*.js')
    .filter(val => !val.includes('/modules/'))
    .map(val => {
        const name = val.replace(strPath, '');
        entries[name.replace(/\.js$/, '')] = strPath + name;
    });

module.exports = {
    entry: entries,
    output: {
        path: path.join(filePath.build,"modules") ,
        filename: "[name].bundle.js"
    },
    module: {
        rules: [
            {
                enforce: 'pre',
                test: /\.js$/,
                exclude: /node_modules/,
                loader: 'eslint-loader',
            }
        ]
    }
}