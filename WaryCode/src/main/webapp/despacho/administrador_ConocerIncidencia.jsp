<%@ page language="java" contentType="text/html; charset=utf-8"
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
<!-- <article class="col11"><p style="font-family:Verdana, Geneva, sans-serif; font-size:18px; margin:auto; padding:15px;">"##/##/####"<br /><br />##:##:##<br /><br />ADMINISTRADORA:<br /><br />"Alexandra Mariaca Valdez"</p><img src="images/foreveralone.jpg" width="200px" /><br /><br /><br /><img src="images/counter.png" width="200px" /><br /><br /><br /><img src="images/peru.png" width="200px"/><br /><br /><br /><img src="images/cargo.png" width="200px" /></article>-->

<div align="center">
<article class="col18">
				<ul class="tabs1">				
					<li style="width:333px;"><a href="administrador_ConocerIncidencia.jsp">Conocer Incidencia</a></li>
				</ul>
	
	<script type="text/javascript">
	$(function(){
		$("#txt_desde").datepicker();

	});
	
	</script>	
					
        <div  class="tabs_cont" style="margin-top: 200px;margin-left: 225px;">
					<!-- <form id="form_1" action="conocerIncidencia" method="simple"> -->
					 <s:form id="form_1" action="conIncidencia" theme="simple">
        
			

                    <!----------------BUSCAR INCIDENCIA--------------------->
                    	<div style="float:left;font-size:15px;font-weight:800;color:#439DEB;text-decoration:underline;">Conocer Incidencia</div>
                           
                           <div style="margin-left:200px; padding-top:35px;">
                            <div style="margin-left:-450px;" class="wrapper">Desde<input type="text" name="txt_desde" class="input"></div></br>
							<div style="margin-left:-450px;" class="wrapper">Hasta<input type="text" name="txt_hasta" class="input"></div></br>
							<div style="margin-left:-105px;float:left;" class="wrapper">   
                            		<s:label value="%{getText('administrador_ConocerIncidencia.incidencia.tipo')}"/>
                            		<s:select name="incidencia.tipo" style="margin-left:105px;"
                                    	headerKey="1" headerValue="(Seleccione)" 
										list="#{'Perdida':'Perdida','Vulnerada':'Vulnerada'}"/>
                            </div> 
                            
                            </s:form>
                            <div style="float:left;margin-left:90px;" class="button"><s:submit value="%{getText('counter_RegistrarEncomienda.btnGuardar')}"/></div>
                        <!--  </div></br> --->  
                     <!-------------------RESULTADO DE BUSQUEDA (GRILLA)----------------> 
                     	<div style="float:left;font-size:15px;font-weight:800;color:#439DEB;text-decoration:underline;">Resultado de Busqueda</div>
                     	<div style="margin-left:-120px;padding-top:45px;"> 
                        	<table width="300" border="1" cellspacing="0" bordercolor="#EEEEEE">
                            	<tr style="font-weight:700;">
                            		<td></td>
                                	<td>Codigode incidencia</td>
                                    <td>Tipo</td>
                                    <td>Descripcion</td>
                                    <td>Estado</td>
                                    <td>Fecha</td>
                                    <td>Cod Encomienda</td>
                                </tr>
                                <s:iterator value="incidencias">
                                <tr>
                                    <td><a href="<s:url action='eliminarIncidencia-%{idInc}' namespace="/despacho"/>">Solucionado</a></td>
                                    <td><s:property value="idInc"/></td>
                                    <td><s:property value="tipo"/></td>
                                    <td><s:property value="descripcion"/></td>                         
                                	<td><s:property value="fecha"/></td>
                                	<td><s:property value="idEnc"/></td>
                                </tr>
                                </s:iterator>
                                <s:property value="mensajeEE"/>
                            </table>
							
							
							</br>
                                                  
                      </div></br>     
                                     
                        <!--------------------------------------------------------->
                    <div style="margin-left:5px;">  
                        <div style="float:left; margin-right:10px"><a href="#" class="button" onclick="document.getElementById('form_1').submit()">Imprimir</a></div>
                        <Br>
                        <div style="float:left;margin-left:15px;"><a href="administrador.jsp" class="button" onclick="document.getElementById('form_1').submit()">Cancelar</a></div>
                    </div>
								

			</article>
	
</div>            
</body>
</html>
