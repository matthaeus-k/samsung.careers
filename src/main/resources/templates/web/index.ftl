<#include "./base/base.ftl">
     <#macro headCopy> <strong>head title..............</strong><br></#macro>
<#macro contents>

     contents....
     .
     .
     .
     <form method="POST" enctype="multipart/form-data" action="fup.cgi">
          File to upload: <input type="file" name="upfile"><br/>
          Notes about the file: <input type="text" name="note"><br/>
          <br/>
          <input type="submit" value="Press"> to upload the file!
     </form>
</#macro>
<#macro scripts></#macro>
<@render/>