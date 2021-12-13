module.exports = {
    "env": {
        "node": true,
        "jquery": true,
        "prototypejs": true,
        "es6": true
    },
    "parserOptions": {
        "ecmaVersion": "latest",
        "sourceType": "script",
    },
    extends: ["eslint:recommended", "google"],
    rules: {
        "no-unexpected-multiline": "error",
        "no-extra-semi": "error",
        "no-console": 0,
        "no-extend-native": 0,
        "no-undef": 0,
        "require-jsdoc": 0,
        "no-unused-vars": 0,
        "no-unreachable": 0,
        "guard-for-in": 0,
        "prefer-rest-params": 0
    }
}