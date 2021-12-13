<#include "./base/testBase.ftl">

<#macro header>
     <#include "./include/testHeader.ftl">
</#macro>

<#macro content>
     <section class="comSec" id="edit">
          <h2>TEST_BOARD_EDIT</h2>
          <table>
               <tr>
                    <th>No.</th>
                    <td>
                         <input type="hidden" name="idx" id="idx" value="${result.data.items.idx}"/>
                         ${result.data.items.idx}
                    </td>
               </tr>
               <tr>
                    <th>Writer</th>
                    <td>${result.data.items.name}</td>
               </tr>
               <tr>
                    <th>Title</th>
                    <td><input type="text" name="title" id="title" value="${result.data.items.title}"></td>
               </tr>
               <tr>
                    <th colspan="2">Content</th>
               </tr>
               <tr>
                    <td colspan="2"><textarea name="content" id="content" >${result.data.items.content}</textarea></td>
               </tr>
          </table>
          <span onclick="testBoardUpdate()">수 정</span>
     </section>
</#macro>

<#macro footer>
     <#include "./include/testFooter.ftl">
</#macro>

<#macro scripts>
     <script src="/scripts/dev/board/testBoard.js"></script>
</#macro>

<@wrap />
