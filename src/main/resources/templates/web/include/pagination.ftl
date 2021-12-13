<#include "./config.ftl">

<div class="paging" id="js-paginator">
    <a href="#"  rel="${result.data.params.firstPageNo}" >First</a>
    <a href="#" rel ="${result.data.params.prevPageNo}" >Prev</a>
    <ul>
        <#list result.data.params.startPageNo .. result.data.params.endPageNo as i>
            <li><a href="${i}"  <#if i == result.data.params.currentPageNo>class="selected" style="color: #ff8400;"</#if>>${i}</a></li>
        </#list>
    </ul>
    <a href="#" rel="${result.data.params.nextPageNo}">Next</a>
    <a href="#" rel="${result.data.params.lastPageNo}">Last</a>
</div>