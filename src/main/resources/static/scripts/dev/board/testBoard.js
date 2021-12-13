'use strict';
function testBoardInsert(){
    const formData = new FormData();
    formData.append("name",document.getElementById("name").value);
    formData.append("title",document.getElementById("title").value);
    formData.append("content",document.getElementById("content").value);

    $.ajax({
        url:"/testBoardInsert",
        method:'POST',
        data: formData,
        dataType: 'json',
        processData: false,
        contentType: false,
    }).then((response)=> {
        console.log(response)
        if(response.success && response.code == "202" && response.data.items == 1){
            alert("등록 성공!!")
            window.location.href="/testBoardList"
        }else{
            alert("등록 실패!!")
        }
    }).catch((request, status, error) => {
        console.log("code:"+request.status+"\n"+"message:"+request.responseText+"\n"+"error:"+error);

    })
}

function testBoardUpdate(){
    const formData = new FormData();
    formData.append("idx",parseInt(document.getElementById("idx").value));
    formData.append("title",document.getElementById("title").value);
    formData.append("content",document.getElementById("content").value);
    $.ajax({
        url:"/testBoardUpdate",
        method:'POST',
        data: formData,
        dataType: 'json',
        processData: false,
        contentType: false,
    }).then((response)=> {
        console.log(response)
        if(response.success && response.code == "202" && response.data.items == 1){
            alert("수정 성공!!")
            window.location.reload()
        }else{
            alert("수정 실패!!")
        }
    }).catch((request, status, error) => {
        console.log("code:"+request.status+"\n"+"message:"+request.responseText+"\n"+"error:"+error);

    })
}

function testBoardDelete(idx){
    if(confirm("정말로 삭제하시겠습니까? 삭제 후에는 복구 불가합니다.")){
        const formData = new FormData();
        formData.append("idx",parseInt(idx));
        $.ajax({
            url:"/testBoardDelete",
            method:'POST',
            data: formData,
            dataType: 'json',
            processData: false,
            contentType: false,
        }).then((response)=> {
            console.log(response)
            if(response.success && response.code == "202" && response.data.items == 1){
                alert("삭제 성공!!")
                window.location.reload()
            }else{
                alert("삭제 실패!!")
            }
        }).catch((request, status, error) => {
            console.log("code:"+request.status+"\n"+"message:"+request.responseText+"\n"+"error:"+error);

        })
    }
}