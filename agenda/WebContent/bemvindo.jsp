<html>
<body>
	<%-- coment�rio em JSP aqui: nossa primeira p�gina JSP --%>
	<%
		String mensagem = "Bem vindo ao sistema de agenda!";
	%>
	<%
		out.println(mensagem);
	%>
	<br />
	<%
		String desenvolvido = "Desenvolvido por Paulo Henrique";
	%>
	<%=desenvolvido%>
	<br />
	<%
		System.out.println("Tudo foi executado!");
	%>
</body>
</html>