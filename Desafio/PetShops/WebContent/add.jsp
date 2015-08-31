<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link href="./resource/css/bootstrap.min.css" rel="stylesheet" media="screen" />
<link href="./resource/css/tela.css" rel="stylesheet" media="screen" />

<title>Add</title>

</head>
<body>

   <core:import url="header.jsp"></core:import>

  <div class="headerr" > <p class="text-primary">AGENDAMENTO</p> </div>

  <div class="cabe"> <h3><span class="label label-default">Ficha</span></h3> </div>

 <div class="ficha">
     <form  action="addCliente" role="form" method="post">
      
          <!-- Campos de Informa��o -->
                                    
          <h4><span class="label label-primary">Nome:</span></h4><input type="text" class="form-control" name="nome" placeholder="Nome">
          <h4><span class="label label-primary">E-mail:</span></h4><input type="text" class="form-control" name="email" placeholder="E-mail">
          <h4><span class="label label-primary">Nome do C�o:</span></h4><input type="text" class="form-control" name="nomeCao" placeholder="Nome do C�o">
          <h4><span class="label label-primary">Ra�a:</span></h4><input type="text" class="form-control" name="raca" placeholder="Ra�a">
          <h4><span class="label label-primary">Data:</span></h4><input type="text" class="form-control" name="data" placeholder="dd/mm/aaaa">

          <!-- Campos de radio -->
                                    
          <center><h4><center><span class="label label-primary">Tipo</span></center></h4><br>
          <label class="radio-inline"> <input type="radio" name="porte" value="pequeno">Pequeno </label>
          <label class="radio-inline"> <input type="radio" name="porte" value="medio">M�dio </label>
          <label class="radio-inline"> <input type="radio" name="porte" value="grande">Grande </label>

                                    <!-- Campos de checkbox -->
          <center><h4><center><span class="label label-primary">Servi�os</span></center></h4><br>
          <label class="checkbox-inline"> <input type="checkbox" name="servico" value="Banho" > Banho </label>
          <label class="checkbox-inline"> <input type="checkbox" name="servico" value="Tosa">Tosa </label>

          <br><br><br><input type="submit" class="btn btn-info" value="Salvar">

  
        </form>

</div>

</body>
</html>