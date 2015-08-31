<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="./resource/css/bootstrap.min.css" rel="stylesheet"
	media="screen" />

<link href="./resource/css/telaIndex.css" rel="stylesheet"
	media="screen" />
<title>Home</title>
</head>
<body>

	<core:import url="header.jsp"></core:import>
	
	<div class="headerr"> <p class="text-primary">Home</p></div>

	<form action="tt" role="form" method="post">
		

		<div class="msg">
			<br>
			<input type="submit" class="btn btn-info" value="Verificar"></div>
	</form>

	<core:choose>

		<core:when test="${not empty requestScope.prestacao.nome}">
			<div class="tabela">
				<table class="table table-bordered">
					<tr>
						<th>Proprietário</th>
						<th>Nome do Cão</th>
						<th>Serviço</th>
						<th>Data</th>
					</tr>

					<tr>

						<td>${requestScope.prestacao.nome}</td>
						<td>${requestScope.prestacao.nomeCao}</td>
						<td>${requestScope.prestacao.servico}</td>
						<td>${requestScope.prestacao.data}</td>

					</tr>

				</table>
			</div>
		</core:when>
		<core:otherwise>
		</core:otherwise>

	</core:choose>

</body>
</html>