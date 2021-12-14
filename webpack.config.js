const path = require('path');
const glob = require('glob');
const ESLintPlugin = require('eslint-webpack-plugin');
const target = process.env.npm_lifecycle_event;

const filePath = {
  src: path.join(__dirname, '/src/main/resources/static/scripts'),
  build: path.join(__dirname, '/src/main/resources/static/public'),
};

const entries = {};
const strPath = filePath.src.split('\\').join('/');

glob.sync(filePath.src + '/**/*.js')
    .filter((val) => !val.includes('/modules/'))
    .map((val) => {
      const name = val.replace(strPath, '');
      entries[name.replace(/\.js$/, '')] = strPath + name;
    });

module.exports = {
  entry: entries,
  output: {
    path: path.join(filePath.build, 'modules'),
    filename: '[name].bundle.js',
  },
  plugins: [
      new ESLintPlugin({
        fix: true,
        extensions: ['js']
      })
  ],
};
