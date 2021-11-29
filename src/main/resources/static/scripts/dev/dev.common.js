'use strict';
async function Post(API_URL,body) {
    let data = '';
    let options = {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json;charset=utf-8'
        },
        body: JSON.stringify(body)
    }
    const response = await fetch(API_URL,options);
    if(body.type === 'html'){
        data = await response.text();
    } else {
        data = await response.json();
    }

    return data;
}
