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
<article class="col11"><p style="font-family:Verdana, Geneva, sans-serif; font-size:18px; margin:auto; padding:15px;">"##/##/####"<br /><br />##:##:##<br /><br />SUPERVISOR:<br /><br />"Miguel Galarza Godines"</p><img src="images/yaoming.jpg" width="200px" /><br /><br /><br /><img src="images/counter.png" width="200px" /><br /><br /><br /><img src="images/peru.png" width="200px"/><br /><br /><br /><img src="images/cargo.png" width="200px" /></article>
<div align="center">
<article class="col18">
				<ul class="tabs3">
					<li style="width:155px;"><a href="supervisor_GenerarGRT.html">Generar GRT</a></li>
					<li style="width:325px;"><a href="supervisorT_GestionarVehiculo.html">Gestionar Vehiculo de Transporte</a></li>
					<li style="width:185px;"><a href="supervisor_ActualizarEstado.html">Actualizar Estado</a></li>
					
				</ul>
				<div  class="tabs_cont">
					<form id="form_1" action="" method="post">

                    <!----------------DATOS DE DESTINATARIO--------------------->
                    	<div style="float:left;font-size:15px;font-weight:800;color:#439DEB;text-decoration:underline;">Lista de Destinos</div>
                        <div style="padding-top:35px;">
                        	<table width="500" border="1" cellspacing="0" bordercolor="#EEEEEE">
                            	<tr style="font-weight:700;">
                                	<td>Destino</td>
                                    <td>Fecha Lim. de Prioridad</td>
                                    <td>Nro. de Encomiendas</td>
                                    <td>Peso Total</td>
                                    <td>&nbsp;&nbsp;</td>
                                </tr>
                                <tr>
                                    <td>Piura</td>
                                    <td>20/10/12</td>
                                    <td>50</td>
                                    <td>205</td>   
                                	<td><div><input type="checkbox" checked=""></div></td>
                                </tr>
                            </table></br>
                             <div style="float:right;margin-right:80px;"><a href="supervisor_SeleccionarVehiculo.html" class="button2" onclick="document.getElementById('form_1').submit()">Seleccionar Veh&iacute;culo</a></div></br></br></br>
                        </div>     
                        	
                     <!-------------------DATOS DE ENCOMIENDA (GRILLA)----------------> 
                     	<div style="float:left;font-size:15px;font-weight:800;color:#439DEB;text-decoration:underline;">Lista de Encomiendas por Prioridad</div></br></br>
                        <div style="margin-left:-250px" class="wrapper">C&oacute;digo de Lista: Xxxxx</div></br>
                     	<div style="margin-left:25px;padding-top:0px;">
                        	<table width="500" border="1" cellspacing="0" bordercolor="#EEEEEE">
                            	<tr style="font-weight:700;">
                                	<td>Destino</td>
                                    <td>Fecha Lim. de Prioridad</td>
                                    <td>Nro. de Encomiendas</td>
                                    <td>Peso Total</td>
                                    <td>&nbsp;&nbsp;</td>
                                </tr>
                                <tr>
                                    <td>Piura</td>
                                    <td>20/10/12</td>
                                    <td>50</td>
                                    <td>205</td>   
                                	<td><div><input type="checkbox" checked=""></div></td>
                                </tr>
                            </table></br>
                            <div style="margin-left:-250px" class="wrapper"><input type="text" class="input">Capacidad M&aacute;xima:</div>
                            <div style="margin-left:-250px" class="wrapper"><input type="text" class="input">Peso Acumulado:</div></br>
                           	<div style="float:right;margin-right:80px;"><a href="#" class="button2" onclick="document.getElementById('form_1').submit()">Generar Lista de Veh�culo</a></div></br></br></br>
                        </div>                       
                        <!--------------------------------------------------------->
                        		
					</form>
				</div>
			</article>
</div>            
</body>
</html>
