<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib uri="/struts-tags" prefix="s"%>
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
<!-- <article class="col11"><p style="font-family:Verdana, Geneva, sans-serif; font-size:18px; margin:auto; padding:15px;">"##/##/####"<br /><br />##:##:##<br /><br />ALMACENERO:<br /><br />"William Vargas Tipismana"</p><img src="images/fuckyeah.jpg" width="200px" /><br /><br /><br /><img src="images/counter.png" width="200px" /><br /><br /><br /><img src="images/peru.png" width="200px"/><br /><br /><br /><img src="images/cargo.png" width="200px" /></article> -->
<div align="center">
<article class="col18">
				<ul class="tabs1">
					<li style="width:240px;"><a href="<s:url action='opcionIngALm' namespace="/despacho"/>">Registrar Ingreso a Almacen</a></li>
                    <li style="width:240px;"><a href="#" class="active">Registrar Salida de Almacen</a></li>
				    <li style="width:180px;"><a href="<s:url action='opcionReIncidencia' namespace="/despacho"/>">Registrar Incidencia</a></li>             
				</ul>
				<div  class="tabs1_cont" style="margin-top: 210px;margin-left: 200px;">
					<s:form id="form_1" action="buscarUbicacion"  theme="simple">  
                     <!-------------------DATOS DE ENCOMIENDA----------------> 
                     	<div style="float:left;font-size:15px;font-weight:800;color:#439DEB;text-decoration:underline;">Datos de Encomienda</div>
                     	<div style="margin-left:105px; margin-top:35px;">
                     		<div style="margin-left:-240px" class="wrapper"><s:label value="codigo"/><s:textfield name="almacen.idEnco"/></div>
                            <div style="margin-left:-230px" class="wrapper"><s:label value="%{getText('almacenero_RegistrarSalidaAlmacen.encomienda.area')}"/><s:textfield name="almacen.area" value="%{area}" readonly="true"/></div>
                            <div style="margin-left:-250px" class="wrapper"><s:label value="%{getText('almacenero_RegistrarSalidaAlmacen.encomienda.seccion')}"/><s:textfield name="almacen.seccion" value="%{seccion}" readonly="true"/></div>
                            <div style="margin-left:-240px" class="wrapper"><s:label value="%{getText('almacenero_RegistrarSalidaAlmacen.encomienda.bloque')}"/><s:textfield name="almacen.bloque" value="%{bloque}" readonly="true"/></div>
                            <div style="margin-left:-250px" class="wrapper"><s:property value="mensajeBU"/></div>
                      </div></br>
                    
                        <!--------------------------------------------------------->
                    <div style="margin-left:90px;">  
                        <div style="float:left;"><s:submit value="Buscar ubicacion"/></div>
                      
                    </div>
								
					</s:form>
					<s:form action="actualizarSal">
					<s:textfield name="encomienda.idEnco" value="%{idEnco}" hidden="true"/>
                    <s:textfield name="encomienda.estado" value="En despacho" hidden="true"/>
                    <s:submit value="actualizar"/>
                    <s:property value="mensajeAE"/>
					</s:form>
				</div>
			</article>
</div>            
</body>
</html>