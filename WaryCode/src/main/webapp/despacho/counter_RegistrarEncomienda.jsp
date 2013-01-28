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
<!-- <article class="col11"><p style="font-family:Verdana, Geneva, sans-serif; font-size:18px; margin:auto; padding:15px;">"##/##/####"<br /><br />##:##:##<br /><br />COUNTER:<br /><br />"Veronica Casas Azañedo"</p><img src="images/fuckencia.jpeg" width="200px" /><br /><br /><br /><img src="images/counter.png" width="200px" /><br /><br /><br /><img src="images/peru.png" width="200px"/><br /><br /><br /><img src="images/cargo.png" width="200px" /></article>-->
<div align="center">
<article class="col18">
				<ul class="tabs">
					<li style="width:300px;margin-left:0px;" ><a href="<s:url action='listarDespacho' namespace="/despacho"/>">Registrar Ingreso a Despacho</a></li>
					<li><a href="#" class="active">Registrar Encomienda</a></li>
					<li><a href="<s:url action='opcionRegistrarEntre' namespace="/despacho"/>">Registrar Entrega</a></li>
					<li><a href="<s:url action='opcionBuscarEncomienda' namespace="/despacho"/>">Buscar Encomienda</a></li>
				</ul>
				<div  class="tabs_cont" style="margin-top: 200px;margin-left: 225px;">
					<s:form id="form_1" action="buscarR">
                                    
                    <div style="float:right;font-size:13px;font-weight:800;"></div>
                    <!----------------DATOS DE REMITENTE--------------------->
                    	<div style="float:left;font-size:15px;font-weight:800;color:#439DEB;text-decoration:underline;">Datos de Remitente</div>
                        <div style="margin-left:90px;">
                       	<div style="float:left;"><s:label value="%{getText('counter_RegistrarEncomienda.remitente.codigo')}"/><s:textfield name="remitente.idRemi"/></div>
                        <div style="float:left;"><s:label value="%{getText('counter_RegistrarEncomienda.remitente.nombre')}"/><s:textfield name="remitente.nombre" readonly="true" value="%{nombre}"/></div>
                            <div style="float:right;margin-right:80px;"><s:submit value="%{getText('counter_RegistrarEncomienda.remitente.btnBuscar')}"/></div>
							<s:property value="mensajeR"/>
                         </div></br>   
                         </s:form>
                     <!-------------------DATOS DE ENCOMIENDA----------------> 
                     <s:form id="form_1" action="regenco" theme="simple">                           		
			<div style="float:left;font-size:15px;font-weight:800;color:#439DEB;text-decoration:underline;">Datos de Encomienda</div>
                     	<div style="margin-left:105px; margin-top:35px;"> 
                        	<div style="margin-left:-105px;float:left;" class="wrapper">
                        	<s:textfield name="encomienda.codRemi" hidden="true" value="%{codRemi}"/>
                        	<s:label value="%{getText('counter_RegistrarEncomienda.encomienda.destino')}"/>   
                            		<s:select name="encomienda.destino" style="margin-left:90px;"
                                    	headerKey="1" headerValue="(Seleccione)" 
										list="#{'Lima':'Lima','Piura':'Piura'}"/>
                            </div>
                            <div style="margin-left:-200px" class="wrapper">
                            <s:label value="%{getText('counter_RegistrarEncomienda.encomienda.tiempoAprox')}"/>
                            <s:textfield name="encomienda.tiempoAprox"/></div>
                            <div style="margin-left:-150px" class="wrapper">
                            <s:label value="%{getText('counter_RegistrarEncomienda.encomienda.peso')}"/>
                            <s:textfield name="encomienda.peso"/></div>
                            <div style="margin-left:-220px" class="wrapper">
                            <s:label value="%{getText('counter_RegistrarEncomienda.encomienda.tarifaXdest')}"/>
                            <s:textfield name="encomienda.tarifaXdest" label="%{getText('counter_RegistrarEncomienda.encomienda.tarifaXdest')}"/></div>
                            <div style="margin-left:15px;" class="wrapper">
                            <s:label value="%{getText('counter_RegistrarEncomienda.encomienda.ancho')}"/>
                            <s:textfield name="encomienda.ancho"/>
                            <s:label value="%{getText('counter_RegistrarEncomienda.encomienda.alto')}"/>
                            <s:textfield name="encomienda.alto"/>
                            <s:label value="%{getText('counter_RegistrarEncomienda.encomienda.largo')}"/>
                            <s:textfield name="encomienda.largo"/></div>
                            <div style="margin-left:-170px" class="wrapper">
                            <s:label value="%{getText('counter_RegistrarEncomienda.encomienda.volumen')}"/>
                            <s:textfield name="encomienda.volumen"/></div>
                            <div style="margin-left:-230px" class="wrapper">
                            <s:label value="%{getText('counter_RegistrarEncomienda.encomienda.tarifaXemb')}"/>
                            <s:textfield name="encomienda.tarifaXemb"/></div>
                            <div style="margin-left:-105px;float:left;" class="wrapper">   
                            		<s:label value="%{getText('counter_RegistrarEncomienda.encomienda.tipo')}"/>
                            		<s:select name="encomienda.tipo" style="margin-left:105px;"
                                    	headerKey="1" headerValue="(Seleccione)" 
										list="#{'Fragil':'Fragil','No Fragil':'No Fragil'}"/>
                            </div> 
                            <div style="margin-left:-200px" class="wrapper">
                            <s:label value="%{getText('counter_RegistrarEncomienda.encomienda.tarifaXtipo')}"/>
                            <s:textfield name="encomienda.tarifaXtipo"/></div>   
                            <div style="margin-left:-155px" class="wrapper">
                            <s:label value="%{getText('counter_RegistrarEncomienda.encomienda.costo')}"/>
                            <s:textfield name="encomienda.costo"/></div>
                            <div style="margin-left:-255px" class="wrapper">
                            <s:label value="%{getText('counter_RegistrarEncomienda.encomienda.estado')}"/>
                            <s:textfield name="encomienda.estado" value="Recepcionada" readonly="true"/></div>
                            <div style="margin-left:-205px" class="wrapper">
                            <s:label value="%{getText('counter_RegistrarEncomienda.encomienda.claveEnvio')}"/>
                            <s:textfield name="encomienda.claveEnvio" type="password"/></div>
                            <div style="margin-left:-200px" class="wrapper">
                            <s:label value="%{getText('counter_RegistrarEncomienda.encomienda.detalle')}"/>
                            <s:textarea style="margin-left:60px; width:300px; height:50px" name="encomienda.detalle" cols="1" rows="1"/><br></div>              

                  
                      </div></br>
                     <!-------------------DATOS DE REMITENTE NATURAL---------------->
                     <div style="float:left;font-size:15px;font-weight:800;margin-bottom:10px;color:#439DEB;text-decoration:underline;">Datos de Documento de Pago</div>
                     <div style="margin-left:-85px;float:left;" class="wrapper"> 
                     				<s:label name="pago.tipo" value="%{getText('counter_RegistrarEncomienda.pago.tipo')}"/> 
                            		<s:select name="pago.tipo" style="margin-left:70px;"
                                    	headerKey="1" headerValue="(Seleccione)" 
										list="#{'Boleta':'Boleta','Factura':'Factura'}"/>
                     </div>
                     <div style="margin-left:-80px" class="wrapper">
                     <s:label name="pago.total" value="%{getText('counter_RegistrarEncomienda.pago.total')}"/>
                     <s:textfield name="pago.total"/></div>
                    
                         <!-------------------DATOS DE DESTINATARIO---------------->
                     	<div style="float:left;font-size:15px;font-weight:800;margin-top:30px;margin-bottom:10px;color:#439DEB;text-decoration:underline;">Datos de Destinatario</div>	
                     		<div style="margin-left:5px; margin-top:70px;">
                        	<s:label name="destinatario.nombre" value="%{getText('counter_RegistrarEncomienda.destinatario.nombre')}"/>
                        	<s:textfield name="destinatario.nombre"/></div>
							<div>
							<s:label name="destinatario.apellido" value="%{getText('counter_RegistrarEncomienda.destinatario.apellido')}"/>
							<s:textfield name="destinatario.apellido"/></div>	
                            <div style="margin-left:13px" class="wrapper">
                            <s:label name="destinatario.dni" value="%{getText('counter_RegistrarEncomienda.destinatario.dni')}"/>
                            <s:textfield name="destinatario.dni"/></div>
                      </br>
                        <!--------------------------------------------------------->
                    <div style="margin-left:100px; width:650px;">  
                        <div style="float:left;margin-left:90px;" class="button"><s:submit value="%{getText('counter_RegistrarEncomienda.btnGuardar')}"/></div>
                        <div style="float:left;margin-left:90px;"><s:property value="mensaje"/></div>
                    </div>
						<div style="margin-left:100px; width:650px;">  
                        <div style="float:left;margin-left:90px;" class="button"><s:submit value="%{getText('counter_RegistrarEncomienda.btnGenerarEtiqueta')}"/></div>
                        <div style="float:left;margin-left:90px;"><s:property value="mensaje"/></div>
                    </div>
                        <div style="margin-left:100px; width:650px;">  
                        <div style="float:left;margin-left:90px;" class="button"><s:submit value="%{getText('counter_RegistrarEncomienda.btnLimpiar')}"/></div>
                        <div style="float:left;margin-left:90px;"><s:property value="mensaje"/></div>
                    </div>		
					</s:form>
				</div>
			</article>
</div>            
</body>
</html>