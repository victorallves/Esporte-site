<%@page import="br.com.magna.esporte.model.HorarioDao"%>
<%@ page import="java.util.List" %>
<%@ page import="br.com.magna.esporte.model.Horario" %>

 <%   List<Horario> horarios =  new HorarioDao().listar(); %> 

<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Cadastros | Rede</title>
<link rel="icon" href="./img/badminton-svg.svg">
<link rel="stylesheet" type="text/css" href="./css/cadastro.css">
</head>

<body>
	<section class="principal">
		<header>
			<div class="center menu-container">
				<div class="logo">
					<h3>
						<i class="fa-solid fa-volleyball"></i>Rede
					</h3>
					<i class=""></i>
				</div>
				<div class="menu">
					 <a class="menu-ativo" href="index.html">Home</a>
					 <a href="form.jsp">Agende seu Horario</a> 
					 <a href="contato.html">Contato</a> 
					 <a href="cadastro.jsp">Cadastros</a>
				</div>
			</div>
		</header>
		<div>
			<table>
				<thead>
					<tr>
						<th>Nome</th>
						<th>Esporte</th>
						<th>Número de Sets</th>
					</tr>
				</thead>
				   <tbody id="horarios-table">
					<%
					for (Horario horario  : horarios) {
					%>
					<tr>
						<td><%=horario.getNome()%></td>
						<td><%=horario.getEsporte()%></td>
						<td><%=horario.getNumeroDeSets()%></td>
					</tr>
					<%
					}
					%>
				</tbody>
				
			</table>
		</div>
	</section>

	<footer>
		<p>Todos os direitos reservados!</p>
	</footer>
	<script src="https://kit.fontawesome.com/92e057dee7.js"
		type="text/javascript" crossorigin="anonymous"></script>
</body>