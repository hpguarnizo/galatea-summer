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
<div align="center">
<article class="col18">
				<ul class="tabs">
					<li style="width:240px;"><a href="<s:url action='opcionIngALm' namespace="/despacho"/>">Registrar Ingreso a Almacen</a></li>
                    <li style="width:240px;"><a href="<s:url action='opcionSaliAlm' namespace="/despacho"/>">Registrar Salida de Almacen</a></li>
                    <li style="width:180px;"><a href="#" class="active">Registrar Incidencia</a></li>
				</ul>
				<div  class="tabs_cont" style="margin-top: 200px;margin-left: 225px;">
					<s:form id="form_1" action="buscarR">
                                    
                  
                     <!-------------------DATOS DE INCIDENCIA----------------> 
                     <s:form id="form_1" action="reginc" theme="simple">                           		
			            <div style="float:left;font-size:15px;font-weight:800;color:#439DEB;text-decoration:underline;">Datos de Incidencia</div>
                     	<br>
                     	<br>
                     	
							<div style="margin-left:90px;">
                        	<s:label value="Tipo de incidencia"/>   
                            <s:select name="incidencia.tipo" style="margin-left:90px;"headerKey="1" headerValue="(Seleccione)" 
							list="#{'Robo':'Robo','Vulnerada':'Vulnerada', 'Mal Sellada':'Mal Sellada','Destino equivocado':'Destino equivocado'}"/>
                            </div>                     	
                     	
                     		<div style="margin-left:-105px;float:left;" class="wrapper">
                     		<s:label value="codigo de encomienda"/> 
                        	<s:textfield name="incidencia.codEnc"  value="%{codEnc}"/>
                        	</div>
                        	<br>
                            <div style="margin-left:90px;">
                            <s:label value="Detalle"/>
                            <s:textarea style="margin-left:60px; width:300px; height:50px" name="encomienda.detalle" cols="1" rows="1"/><br></div> 
                            </br>
                            </div>
                           </article>
                           </s:form> 
                  
                      </div></br>
                    
                        <!--------------------------------------------------------->
                    <div style="margin-left:100px; width:650px;">  
                        <div style="float:left;margin-left:90px;" class="button"><s:submit value="%{getText('counter_RegistrarEncomienda.btnGuardar')}"/></div>
                        <div style="float:left;margin-left:90px;"><s:property value="mensaje"/></div>
                  
						                    
                        <div style="margin-left:100px; width:650px;">  
                        <s:submit value="%{getText('counter_RegistrarEncomienda.btnLimpiar')}"/>
                        <s:property value="mensaje"/>
                    </div>		
					</s:form>
			
			</article>
</div>            
</body>
</html>