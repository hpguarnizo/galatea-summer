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
<article class="col11"><p style="font-family:Verdana, Geneva, sans-serif; font-size:18px; margin:auto; padding:15px;">"##/##/####"<br /><br />##:##:##</p><img src="images/counter.png" width="200px" /><br /><br /><br /><img src="images/peru.png" width="200px"/><br /><br /><br /><img src="images/cargo.png" width="200px" /></article>
<article class="col18">
				
                <ul class="tabs1">
					<li style="width:255px;"><a href="almacenero_RegistrarIngresoAlmacen.html">Registrar Ingreso a Almacen</a></li>
                    <li style="width:255px;"><a href="almacenero_RegistrarSalidaAlmacen.html">Registrar Salida de Almacen</a></li>
				     <li style="width:155px;"><a href="usuario_ActualizarEstado.html">Actualizar estado</a></li>             
                    
                </ul>
				<div  class="tabs_cont">
					<form id="form_1" action="" method="post">

                    <!----------------BUSCAR CLIENTE--------------------->
                    	<div style="float:left;font-size:15px;font-weight:800;color:#439DEB;text-decoration:underline;">Actualizar Estado de Encomienda</div>
                        <div style="margin-left:90px; padding-top:35px;">
                            <div style="margin-left:-105px;float:left;" class="wrapper">Estado:   
                            		<select style="margin-left:60px;">
                                    	<option>-------</option>
                                        <option>Recepcionado</option>
                                        <option>En Almac&eacute;n</option>
                                        <option>En transporte</option>
                                        <option>En despacho</option>
                                        <option>Entregado</option>
                                     </select> 
                            </div></br>
                           
                         </div></br>               
                        <!--------------------------------------------------------->
                    <div style="margin-left:170px;">  
                        <div style="float:left;margin-left:15px;"><a href="#" class="button" onclick="document.getElementById('form_1').submit()">Actualizar</a></div>
                        <div style="float:left;margin-left:15px;"><a href="#" class="button" onclick="document.getElementById('form_1').submit()">Cancelar</a></div>
                    </div>
								
					</form>
				</div>
			</article>
</div>            
</body>
</html>