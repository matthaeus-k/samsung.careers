<#include "./base/testBase.ftl">

<#macro header>
     <#include "./include/testHeader.ftl">
</#macro>

<#macro content>
     <section class="comSec" id="write">
          <h2>TEST_BOARD_WRITE</h2>
          <table>
               <tr>
                    <th>Writer</th>
                    <td><input type="text" name="name" id="name"></td>
               </tr>
               <tr>
                    <th>Title</th>
                    <td><input type="text" name="name" id="title"></td>
               </tr>
               <tr>
                    <th colspan="2">Content</th>
               </tr>
               <tr>
                    <td colspan="2"><textarea name="content" id="content"></textarea></td>
               </tr>
          </table>
          <span onclick="testBoardInsert()">글쓰기</span>
     </section>
</#macro>

<#macro footer>
     <#include "./include/testFooter.ftl">
</#macro>

<#macro scripts>
     <script src="/scripts/dev/board/testBoard.js"></script>
</#macro>

<@wrap />
