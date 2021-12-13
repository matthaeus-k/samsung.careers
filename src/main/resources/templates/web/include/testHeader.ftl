<header>
    <nav>
        <ul>
            <#if springMacroRequestContext.requestUri?contains("/testBoardList")>
                <li ><a href="/testBoardList" style="font-weight: bold">TestBoardList</a></li>
            <#else>
                <li ><a href="/testBoardList">TestBoardList</a></li>
            </#if>

            <#if springMacroRequestContext.requestUri?contains("/testBoardWrite")>
                <li ><a href="/testBoardWrite" style="font-weight: bold">TestBoardWrite</a></li>
            <#else>
                <li ><a href="/testBoardWrite">TestBoardWrite</a></li>
            </#if>
        </ul>
    </nav>
</header>

<#--ST publishing css , javascript-->
<#-- //END -->