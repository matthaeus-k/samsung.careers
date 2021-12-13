<#include "./base/testBase.ftl">

<#macro header>
    <#include "./include/testHeader.ftl">
</#macro>

<#macro content>
    <section class="comSec" id="list">
        <h2>TEST_BOARD_LIST</h2>
         <table>
              <tr>
                   <th>No.</th>
                   <th>Title</th>
                   <th>View</th>
                   <th>Writer</th>
                   <th>DtReg</th>
                   <th>DtUpd</th>
                   <th>Delete</th>
              </tr>
               <#list result.data.items as item>
                    <tr>
                         <td>
                              ${item.idx}
                         </td>
                         <td>
                              <a href="/testBoardView/${item.idx}">
                                   ${item.title}
                              </a>

                         </td>
                         <td>
                              ${item.viewCnt}
                         </td>
                         <td>
                              ${item.name}
                         </td>
                         <td>
                             ${item.dtReg?string("yy-MM-dd a hh:mm")}
                         </td>
                         <td>
                             ${item.dtUpd?string("yy-MM-dd a hh:mm")}
                         </td>
                         <td>
                              <span onclick="testBoardDelete(${item.idx})">삭제</span>
                         </td>
                    </tr>
               </#list>
         </table>
    </section>
</#macro>

<#macro footer>
    <#include "./include/testFooter.ftl">
</#macro>

<#macro scripts>
    <script src="/scripts/dev/board/testBoard.js"></script>
</#macro>

<@wrap />
