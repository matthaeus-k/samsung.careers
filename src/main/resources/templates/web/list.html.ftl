<h2>list </h2><br>
<div>
    <#list result.data.items as item>
        <li><span>${item.idx}</span><strong>${item.title}</strong>||  ${(item.dtReg?string('yyyy.MM.dd HH:mm:ss'))!} </li>
    </#list>
</div>

<#include "./include/pagination.ftl">

