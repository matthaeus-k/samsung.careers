const path = require('path');
const glob = require('glob');
const target = process.env.npm_lifecycle_event;

const filePath = {
  src: path.join(__dirname, '/src/main/resources/static/scripts'),
};

const entries = {};
const strPath = filePath.src.split('\\').join('/');

glob(
    filePath.src + '/**/*.js',
    {
      dot: true,
      ignore: [filePath.src +'/modules/**/*.js', filePath.src +'/lib/**/*.js'],
    }, (er, files) => {
      for (const v of files) {
        const dir = v.replace(strPath, '').replace(/\.js$/, '');
        entries[dir] = v;
      }
      console.log(entries);
    },
);
