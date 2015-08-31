<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listagem de Servi�os</title>
<link href="./resource/css/bootstrap.min.css" rel="stylesheet"
	media="screen" />
<link href="./resource/css/telaListagem.css" rel="stylesheet" media="screen" />
</head>
<body>

	<div class="headerr">
		<p class="text-primary">Lista De Servi�os</p>
	</div>
	
	<div class="voltar"><a href="pesquisaData.jsp" class="btn btn-info" > Voltar </a></div>

	<div class="tabela">
		<table class="table table-bordered">
			<tr>
				<th>Propriet�rio</th>
				<th>Nome do C�o</th>
				<th>Servi�o</th>
				<th>Data</th>
			</tr>

			<core:forEach var="p" items="${applicationScope.servicos}"
				varStatus="id">

				<tr>

					<td>${p.nome}</td>
					<td>${p.nomeCao}</td>
					<td>${p.servico}</td>
					<td>${p.data}</td>

				</tr>

			</core:forEach>
		</table>
	</div>

</body>
</html>