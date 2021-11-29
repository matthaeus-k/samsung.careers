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
    document.querySelector('#loading').innerText = 'loading...';
    const response = await fetch(API_URL,options);
    if (response.status == 200) {
        if(body.type === 'html'){
            data = await response.text();
        } else {
            data = await response.json();
        }
        setTimeout(() => {
            document.querySelector('#loading').innerText = 'ok';
        }, 2000);
    }else{
        throw new Error(response.statusText);
        console.log('error')
    }
    return data;
}

