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

                     <!-------------------DATOS DE VEHICULO (GRILLA)----------------> 
                    	<div style="float:left;font-size:15px;font-weight:800;color:#439DEB;text-decoration:underline;">Veh&iacute;culos Disponibles</div>
                        <div style="padding-top:35px;">
                        	<table width="500" border="1" cellspacing="0" bordercolor="#EEEEEE">
                            	<tr style="font-weight:700;">
                                	<td>&nbsp;&nbsp;</td>
                                    <td>Placa</td>
                                    <td>Capacidad</td>
                                    <td>Conductor</td>
                                    <td>Marca</td>
                                    <td>Cargador</td>
                                </tr>
                                <tr>
                                	<td><div><input type="checkbox" checked=""></div></td>
                                    <td>ABC-016</td>
                                    <td>500</td>
                                    <td>Juan Perez</td>
                                    <td>Toyota</td>
                                    <td>Celendonio</td>
                                </tr>
                            </table></br>
                             <div style="float:right;margin-right:80px;"><a href="supervisorT_GestionarVehiculo.html" class="button2" onclick="document.getElementById('form_1').submit()">Seleccionar</a></div></br></br></br>
                        </div>  
                     	                 
                        <!--------------------------------------------------------->
                        		
					</form>
				</div>
			</article>
</div>            
</body>
</html>
