<jsp:useBean id="obj" class="equation.EquationBean" scope="application"/>
<jsp:setProperty name="obj" property="*"/>
<html>
<body>
   Result
   <p>
   <%=obj.getn()%>
   is <%=obj.getEcuation() %>
</body>
</html>
