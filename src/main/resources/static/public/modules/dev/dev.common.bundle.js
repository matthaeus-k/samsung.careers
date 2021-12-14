/*
 * ATTENTION: The "eval" devtool has been used (maybe by default in mode: "development").
 * This devtool is neither made for production nor for readable output files.
 * It uses "eval()" calls to create a separate source file in the browser devtools.
 * If you are trying to read the output file, select a different devtool (https://webpack.js.org/configuration/devtool/)
 * or disable the default devtool with "devtool: false".
 * If you are looking for production-ready output files, see mode: "production" (https://webpack.js.org/configuration/mode/).
 */
/******/ (() => { // webpackBootstrap
/******/ 	"use strict";
/******/ 	var __webpack_modules__ = ({

/***/ "./src/main/resources/static/scripts/dev/dev.common.js":
/*!*************************************************************!*\
  !*** ./src/main/resources/static/scripts/dev/dev.common.js ***!
  \*************************************************************/
/***/ (() => {

eval("\n\nString.prototype.format = function() {\n  let a = this;\n  for (const k in arguments) {\n    a = a.replace('{' + k + '}', arguments[k]);\n  }\n  return a;\n};\n\nasync function fnPost(API_URL, body) {\n  let data = '';\n  const options = {\n    method: 'POST',\n    headers: {\n      'Content-Type': 'application/json;charset=utf-8',\n    },\n    body: JSON.stringify(body),\n  };\n  document.querySelector('#loading').innerText = 'loading...';\n  const response = await fetch(API_URL, options);\n  if (response.status == 200) {\n    if (body.type === 'html') {\n      data = await response.text();\n    } else {\n      data = await response.json();\n    }\n    setTimeout(() => {\n      document.querySelector('#loading').innerText = 'ok';\n    }, 2000);\n  } else {\n    throw new Error(response.statusText);\n    console.log('test');\n  }\n  return data;\n}\n\n\n\n//# sourceURL=webpack://samsung.careers/./src/main/resources/static/scripts/dev/dev.common.js?");

/***/ })

/******/ 	});
/************************************************************************/
/******/ 	
/******/ 	// startup
/******/ 	// Load entry module and return exports
/******/ 	// This entry module can't be inlined because the eval devtool is used.
/******/ 	var __webpack_exports__ = {};
/******/ 	__webpack_modules__["./src/main/resources/static/scripts/dev/dev.common.js"]();
/******/ 	
/******/ })()
;