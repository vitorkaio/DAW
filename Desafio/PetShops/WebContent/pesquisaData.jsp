<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
   
   <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
   
   <link href="./resource/css/bootstrap.min.css" rel="stylesheet" media="screen" />
   <link href="./resource/css/telaPesquisa.css" rel="stylesheet" media="screen" />
   
   <title>Pesquisa</title>
   
</head>
<body>

	<core:import url="header.jsp"></core:import>

	<div class="headerr">
		<p class="text-primary">Pesquisa De Serviços</p>
	</div>

	<div class="formulario">
	
		<form action="pesquisa" role="form" method="post">

			<h4>
				<span class="label label-primary">Data:</span>
			</h4>
			<input type="text" class="form-control" name="data"
				placeholder="dd/MM/yyyy"> <br>
				<center><input type="submit" class="btn btn-info" value="Pesquisar"></center>

		</form>

	</div>


</body>
</html>