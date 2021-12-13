<#include "./base/testBase.ftl">

<#macro header>
     <#include "./include/testHeader.ftl">
</#macro>

<#macro content>
     <section class="comSec" id="edit">
          <h2>TEST_BOARD_VIEW</h2>
          <table>
               <tr>
                    <th>No.</th>
                    <td>
                         <input type="hidden" name="idx" id="idx" value="${result.data.items.idx}"/>
                         ${result.data.items.idx}
                    </td>
               </tr>
               <tr>
                    <th>ViewCnt</th>
                    <td>
                         ${result.data.items.viewCnt}
                    </td>
               </tr>
               <tr>
                    <th>DtReg</th>
                    <td>
                         ${result.data.items.dtReg?string("yy-MM-dd a hh:mm")}
                    </td>
               </tr>
               <tr>
                    <th>DtUpd</th>
                    <td>
                         ${result.data.items.dtUpd?string("yy-MM-dd a hh:mm")}
                    </td>
               </tr>
               <tr>
                    <th>Writer</th>
                    <td>${result.data.items.name}</td>
               </tr>
               <tr>
                    <th>Title</th>
                    <td>${result.data.items.title}</td>
               </tr>
               <tr>
                    <th colspan="2">Content</th>
               </tr>
               <tr>
                    <td colspan="2">${result.data.items.content}</td>
               </tr>
          </table>
          <span><a href="/testBoardEdit/${result.data.items.idx}">수 정</a></span>
     </section>
</#macro>

<#macro footer>
     <#include "./include/testFooter.ftl">
</#macro>

<#macro scripts>
     <script src="/scripts/dev/board/testBoard.js"></script>
</#macro>

<@wrap />
