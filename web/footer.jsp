<%--
  Created by IntelliJ IDEA.
  User: 19767
  Date: 2018/11/23
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.time.LocalDateTime" %>
<!--footer-->
<div class="footer">
    <div class="container">
        <div class="text-center">
            <p>vili www.vilicode.com © All rights Reseverd</p>
        </div>
        
        <%
           // 打印当前时间，用于日志或调试目的
           System.out.println("footer.jsp == " + LocalDateTime.now());
           System.out.println(" ");
         %>

    </div>
</div>
<!--//footer-->