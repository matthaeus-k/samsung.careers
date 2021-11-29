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
        console.log('beforsend')
        const response = await fetch(API_URL,options);
        if (response.status == 200) {
            if(body.type === 'html'){
                data = await response.text();
            } else {
                data = await response.json();
            }
            console.log('ok')
        }else{
            throw new Error(response.statusText);
            console.log('error')
        }
        return data;
}


