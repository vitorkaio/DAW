<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Erro</title>
<link href="./resource/css/bootstrap.min.css" rel="stylesheet"
	media="screen" />
</head>
<body>

	<br><br>
    <center>
		<h1 class="text-primary">Erro De Persistência</h1>
	</center>
	
	<br><br>
	
	<center><a href="index.jsp" class="btn btn-info" > Voltar </a></center>
	
	<br><br><br><br>
	
	<center><h3 class="text-danger">Motivos:</h3></center>
	
	<center><p class="text-muted">
	  
	  1° - Data do agendamento já está ocupada.<br>
	  2° - Data inválida(NumberFormatException).<br>
	  3° - Integridade dos dados comprometida, isto é, campos vazios.
	
	</p></center>

</body>
</html>