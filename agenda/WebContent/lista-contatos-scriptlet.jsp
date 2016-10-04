<%@page import="java.text.SimpleDateFormat"%>
<%@ page
	import="java.util.*,
				br.com.agenda.jdbc.dao.*,
				br.com.agenda.jdbc.model.*"%>

<html>
<body>
	<table>
	
		<tr>
			<td>NOME</td>
			<td>E-MAIL</td>
			<td>ENDEREÇO</td>
			<td>DATA DE NASCIMENTO</td>
		</tr>
		
		<%
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			sdf.setCalendar(new GregorianCalendar());
			ContatoDao dao = new ContatoDao();
			List<Contato> contatos = dao.getLista();
			for (Contato contato : contatos) {
				
		%>
		<tr>
			<td><%=contato.getNome()%></td>
			<td><%=contato.getEmail()%></td>
			<td><%=contato.getEndereco()%></td>
			<td><%=sdf.format(contato.getDataNascimento().getTime()).toString()%></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>