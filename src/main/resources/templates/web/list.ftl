<#include "./base/base.ftl">
<#macro headCopy> <strong>head title..............</strong><br></#macro>
<#macro contents>

    contents....
   <div id="list"></div>
    <form id="listFrm" name="listFrm">
        <input type="hidden" id="list-currentPageNo"  name="currentPageNo" value="${ params.currentPageNo }" />
        <input type="hidden" id="list-strKey" name="strKey" value="${ params.strKey! }" />
        <input type="hidden" id="list-strTxt" name="strTxt" value="${ params.strTxt! }" />
    </form>
</#macro>
<#macro scripts>
    <script src="/public/modules/dev/board/board.bundle.js"></script>
</#macro>

<@render/>