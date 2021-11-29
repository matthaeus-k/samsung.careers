let listBody = {
    type : 'html',
    params: null
}

Post('list.data',listBody).then(data => {
   console.log(data);
   document.querySelector('#list').innerHTML = data;
});