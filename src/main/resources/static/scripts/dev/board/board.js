const listBody = {
  type: 'html',
  params: null,
};

fnPost('list.data', listBody).then((data) => {
  document.querySelector('#list').innerHTML = data;
});
