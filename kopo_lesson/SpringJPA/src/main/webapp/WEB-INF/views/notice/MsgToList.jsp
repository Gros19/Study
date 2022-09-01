<%--
  Created by IntelliJ IDEA.
  User: data21
  Date: 2022-08-30
  Time: 오후 9:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.example.springjpa.util.CmmUtil" %>

<%--전달받은 메시지--%>
<%
    String msg = CmmUtil.nvl((String)request.getAttribute("msg"));
%>
<html>
<head>
    <title>처리페이지</title>
    <script type="text/javascript">
        alert("<%=msg%>");
        top.location.href="/notice/noticeList";
    </script>
</head>
<body>
<p>index</p>
</body>
</html>
