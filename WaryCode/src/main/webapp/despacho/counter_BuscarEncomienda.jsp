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
<!--  <article class="col11"><p style="font-family:Verdana, Geneva, sans-serif; font-size:18px; margin:auto; padding:15px;">"##/##/####"<br /><br />##:##:##<br /><br />COUNTER:<br /><br />"Veronica Casas Azañedo"</p><img src="images/fuckencia.jpeg" width="200px" /><br /><br /><br /><img src="images/counter.png" width="200px" /><br /><br /><br /><img src="images/peru.png" width="200px"/><br /><br /><br /><img src="images/cargo.png" width="200px" /></article>-->
<div align="center">
<article class="col18">
				<ul class="tabs">
					<li><a href="counter_RegistrarEncomienda.jsp">Registrar Encomienda</a></li>
					<!--<li><a href="counter_BuscarCliente.jsp">Buscar<br />Cliente</a></li>-->
					<li><a href="counter_RegistrarRemitente.jsp">Registrar Remitente</a></li>
                    <li><a href="counter_RegistrarEntregaDeEncomienda.jsp">Registrar Entrega</a></li>
                     <li><a href="#" class="active">Buscar Encomienda</a></li>
                   <!--  <li><a href="counter_AsignarTicketDeAtencion.jsp">Asignar Ticket</a></li>
                      <li><a href="counter_ActualizarEstado.jsp">Actualizar estado</a></li> --> 
                      
                      
                      
                      
				</ul>
				
				
        <div  class="tabs_cont" style="margin-top: 200px;margin-left: 225px;">
					<form id="form_1" action="buscarEncomienda" method="simple">
					<!--  <s:form id="form_1" action="" theme="post">-->
        
			 <!---	<div class="tabs_cont" style="margin-top: 200px;margin-left: 225px;>---->
					 <!---<form id="form_1" action="" method="post">-->

                    <!----------------BUSCAR CLIENTE--------------------->
                    	<div style="float:left;font-size:15px;font-weight:800;color:#439DEB;text-decoration:underline;">Buscar Encomienda</div>
                           
                        <div style="margin-left:200px; padding-top:35px;">
                            <div style="margin-left:-450px;" class="wrapper">C&oacute;digo de Env&iacute;o:<input type="text" class="input"></div></br>
                            <div style="float:right;margin-right:280px;"><a href="#" class="button" onclick="document.getElementById('form_1').submit()">Buscar</a></div></br>
                         </div></br>   
                     <!-------------------RESULTADO DE BUSQUEDA (GRILLA)----------------> 
                     	<div style="float:left;font-size:15px;font-weight:800;color:#439DEB;text-decoration:underline;">Resultado de Busqueda</div>
                     	<div style="margin-left:-120px;padding-top:45px;"> 
                        	<table width="300" border="1" cellspacing="0" bordercolor="#EEEEEE">
                            	<tr style="font-weight:700;">
                                	<td>Destino</td>
                                	<td>Peso</td>
                                    <td>Volumen</td>
                                </tr>
                                <tr>
                                	<td>Piura</td>
                                    <td>500Kg</td>
                                    <td>800</td>
                                </tr>
                            </table></br>
                            <div style="margin-left:-38px" class="wrapper">*Encomienda no encontrada</div>                          
                      </div></br>                    
                        <!--------------------------------------------------------->
                    <div style="margin-left:5px;">  
                        <div style="float:left; margin-right:10px"><a href="#" class="button" onclick="document.getElementById('form_1').submit()">Continuar</a></div>
                        <div style="float:left;margin-left:15px;"><a href="#" class="button" onclick="document.getElementById('form_1').submit()">Cancelar</a></div>
                    </div>
								
					</form>
			</article>
</div>            
</body>
</html>