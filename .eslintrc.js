module.exports = {
    "env": {
        "browser": true,
        "es2021": true
    },
    "extends": "eslint:recommended",
    "parserOptions": {
        "ecmaVersion": 13,
        "sourceType": "module"
    },
    "rules": {
        'no-undef': 0,
        'require-jsdoc': 0,
        'no-unused-vars': 0,
        'no-unreachable': 0,
        'no-unexpected-multiline': 'error',
        'no-extra-semi': 'error',
        'no-console': 1,
    }
};
