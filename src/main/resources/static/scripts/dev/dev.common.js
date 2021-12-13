'use strict';

String.prototype.format = function() {
  let a = this;
  for (const k in arguments) {
    a = a.replace('{' + k + '}', arguments[k]);
  }
  return a;
};

async function fnPost(API_URL, body) {
  let data = '';
  const options = {
    method: 'POST',
    headers: {
      'Content-Type': 'application/json;charset=utf-8',
    },
    body: JSON.stringify(body),
  };
  document.querySelector('#loading').innerText = 'loading...';
  const response = await fetch(API_URL, options);
  if (response.status == 200) {
    if (body.type === 'html') {
      data = await response.text();
    } else {
      data = await response.json();
    }
    setTimeout(() => {
      document.querySelector('#loading').innerText = 'ok';
    }, 2000);
  } else {
    throw new Error(response.statusText);
    console.log('test');
  }
  return data;
}

