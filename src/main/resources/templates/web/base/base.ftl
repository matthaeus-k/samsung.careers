<#macro head></#macro>

<#macro headCopy></#macro>

<#macro contents></#macro>

<#macro scripts></#macro>

<#include "../include/config.ftl">
<#macro render>
    <!doctype html>
    <html lang="en">
    <head>
        <@head/>
    </head>
    <body>

    <!-- 콘텐츠 영역 -->
    <div class="main">
        <@headCopy/>
        <@contents/>
        <footer>
            <#include "../include/footer.ftl">
        </footer>
    </div>
    <#include "../include/scripts.ftl">
    <@scripts/>
    </body>
    </html>
</#macro>