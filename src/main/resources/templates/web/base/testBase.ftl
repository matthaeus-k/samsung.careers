<#macro head>
    <#include "../include/testHead.ftl">
    <#include "../include/testScripts.ftl">
</#macro>

<#macro header></#macro>
<#macro content></#macro>
<#macro footer></#macro>
<#macro scripts></#macro>

<!doctype html>
<html lang="en">
    <@head/>
<body>
<#macro wrap>
    <article class="wrap">
        <@header/>
        <@content/>
        <@footer/>
        <@scripts/>
    </article>
</#macro>

</body>
</html>
