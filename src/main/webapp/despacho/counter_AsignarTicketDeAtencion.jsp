<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="css/reset.css" type="text/css" media="all">
<link rel="stylesheet" href="css/layout.css" type="text/css" media="all">
<link rel="stylesheet" href="css/style.css" type="text/css" media="all">
<script type="text/javascript" src="js/jquery-1.4.2.js" ></script>
<script type="text/javascript" src="js/cufon-yui.js"></script>
<script type="text/javascript" src="js/cufon-replace.js"></script>  
<script type="text/javascript" src="js/Myriad_Pro_600.font.js"></script>
<title>Untitled Document</title>
</head>

<body>
<article class="col11"><p style="font-family:Verdana, Geneva, sans-serif; font-size:18px; margin:auto; padding:15px;">"##/##/####"<br /><br />##:##:##<br /><br />COUNTER:<br /><br />"Veronica Casas Azañedo"</p><img src="images/fuckencia.jpeg" width="200px" /><br /><br /><br /><img src="images/counter.png" width="200px" /><br /><br /><br /><img src="images/peru.png" width="200px"/><br /><br /><br /><img src="images/cargo.png" width="200px" /></article>
<div align="center">
<article class="col18">
				<ul class="tabs">
					<li><a href="counter_RegistrarEncomienda.jsp">Registrar Encomienda</a></li>
                    <li><a href="counter_BuscarEncomienda.jsp">Buscar Encomienda</a></li>
					<li><a href="counter_BuscarCliente.jsp">Buscar<br />Cliente</a></li>
					<li><a href="counter_RegistrarRemitente.jsp">Registrar Remitente</a></li>
                    <li><a href="counter_RegistrarEntregaDeEncomienda.jsp">Registrar Entrega</a></li>
                     <li><a href="#" class="active">Asignar Ticket</a></li>
                      <li><a href="counter_ActualizarEstado.jsp">Actualizar estado</a></li>
				</ul>
				<div  class="tabs_cont">
					<form id="form_1" action="" method="post">
                          <div style="margin-left:-250px" class="wrapper"><input type="text" class="input" style="margin-left:-150px">Nro de Atención siguiente:</div><br />
                            
                    <div style="margin-left:120px; width:650px;">  
                        <div style="float:left;margin-left:50px;"><a href="#" class="button" onclick="document.getElementById('form_1').submit()">MOSTRAR</a></div>
                       
                    </div> <br /> <br />
							<div style="margin-left:-20px" class="wrapper">** Nro de Atención ya fue asignado</div>	
					</form>
				</div>
			</article>
</div>            
</body>
</html>