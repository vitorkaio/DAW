<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Relatório</title>
<link href="./resource/css/bootstrap.min.css" rel="stylesheet"
	media="screen" />

<link href="./resource/css/telaPreco.css" rel="stylesheet"
	media="screen" />
</head>
<body>

	<core:import url="header.jsp"></core:import>
	
	<div class="headerr"> <p class="text-primary">Relatório</p></div>

	<form action="relatorio" role="form" method="post">

			<div class="data1">
				<h4>
					<span class="label label-primary">Data 1:</span>
				</h4>
				<input type="text" class="form-control" name="data1"
					placeholder="dd/MM/yyyy"> <br>

			
			
				<h4>
					<span class="label label-primary">Data 2:</span>
				</h4>
				<input type="text" class="form-control" name="data2"
					placeholder="dd/MM/yyyy"> <br>
					
			<center>
				<div class="btn" ><input type="submit" class="btn btn-info" value="Pesquisar"></div>
			</center>

			</div>


	</form>

</body>
</html>