const listBody = {
  type: 'html',
  params: null,
};

fnPost('list.data', listBody).then((data) => {
  console.log(data);
  document.querySelector('#list').innerHTML = data;
});
