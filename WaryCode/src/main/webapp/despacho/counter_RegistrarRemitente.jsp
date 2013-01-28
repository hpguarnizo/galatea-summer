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
<!-- <article class="col11"><p style="font-family:Verdana, Geneva, sans-serif; font-size:18px; margin:auto; padding:15px;">"##/##/####"<br /><br />##:##:##<br /><br />COUNTER:<br /><br />"Veronica Casas Azañedo"</p><img src="images/fuckencia.jpeg" width="200px" /><br /><br /><br /><img src="images/counter.png" width="200px" /><br /><br /><br /><img src="images/peru.png" width="200px"/><br /><br /><br /><img src="images/cargo.png" width="200px" /></article> -->
<div align="center">
<article class="col18">
				<ul class="tabs">
					
                  	<li><a href="#" class="active"/>Registrar Remitente</a></li>
                    
                    <li><a href="<s:url action='buscarCliente' namespace="/despacho"/>">Buscar Cliente</a></li> 
                </ul>
				
				<div  class="tabs_cont" style="margin-top: 200px;margin-left: 225px;">
					<s:form id="form_2" action="regremi" theme="simple">
                    
                         <!-------------------DATOS DE REMITENTE---------------->
                     <div style="float:left;font-size:15px;font-weight:800;margin-top:30px;margin-bottom:10px;color:#439DEB;text-decoration:underline;">Datos de Remitente Jur&iacute;dico</div>
                     <div style="margin-left:105px; margin-top:45px;">
                        	<div style="margin-left:-250px" class="wrapper"><s:label value="%{getText('counter_RegistrarRemitente.remitente.nombre')}"/><s:textfield name="remitente.nombre"/></div>
							<div style="margin-left:-250px" class="wrapper"><s:label value="%{getText('counter_RegistrarRemitente.remitente.apellido')}"/><s:textfield name="remitente.apellido"/></div>	
                            <div style="margin-left:-220px" class="wrapper"><s:label value="%{getText('counter_RegistrarRemitente.remitente.dni')}"/><s:textfield name="remitente.dni"/></div>
                            <div style="margin-left:-250px" class="wrapper"><s:label value="%{getText('counter_RegistrarRemitente.remitente.direccion')}"/><s:textfield name="remitente.direccion"/></div>
                            <div style="margin-left: -220px;"><s:label value="%{getText('counter_RegistrarRemitente.remitente.sexo')}"/><s:radio name="remitente.sexo" 
									list="#{'M':'Masculino','F':'Femenino'}"/></div>
                            <div style="margin-left:-250px" class="wrapper"><s:label value="%{getText('counter_RegistrarRemitente.remitente.telefono')}"/><s:textfield name="remitente.telefono"/></div>
                        	<div><s:property value="mensaje"/></div>
                      </div>
                      
                        <!--------------------------------------------------------->
                	 <div style="margin-left:200px;margin-top: 20px;">  
                        <div style="float:left;margin-left:3px;"><s:submit value="%{getText('counter_RegistrarRemitente.btnRegistrar')}"/></div>
                 	</div>						
					</s:form>
				</div>
</article>
</div>            
</body>
</html>
