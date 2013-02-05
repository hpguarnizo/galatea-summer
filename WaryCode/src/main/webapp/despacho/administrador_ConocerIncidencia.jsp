<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="/struts-tags" prefix="s"%> 

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

<script type="text/javascript">
	$(function(){
		$("#txt_desde").datepicker();

	});
	
</script>
	
</head>

<body>

<div align="center">
<article class="col18">
				<ul class="tabs1">	
				<li><a href="#" class="active">Consultar Incidencia</a></li>
				</ul>
			
        <div  class="tabs_cont" style="margin-top: 200px;margin-left: 225px;">

                    <!----------------BUSCAR INCIDENCIA--------------------->
                    	<s:form id="form_1" action="conIncidencia" >
                    	<div style="float:left;font-size:15px;font-weight:800;color:#439DEB;text-decoration:underline;">Consultar Incidencia</div>  
                        <div style="margin-left:200px; padding-top:35px;">
                        <div style="margin-left:-450px;" class="wrapper">Desde<input type="text" name="txt_desde" class="input"></div></br>
						<div style="margin-left:-450px;" class="wrapper">Hasta<input type="text" name="txt_hasta" class="input"></div></br>			
                        <div style="float:left;margin-left:90px;" class="button"><s:submit value="%{getText('counter_RegistrarEncomienda.btnGuardar')}"/></div>
                       	</div></br>
                       </s:form> 
                        </br>
                        </br>
                        </br>
                     <!-------------------RESULTADO DE BUSQUEDA (GRILLA)----------------> 
                     	<div style="float:left;font-size:15px;font-weight:800;color:#439DEB;text-decoration:underline;">Resultado de Busqueda</div>
                     	<div style="margin-left:-50px;padding-top:45px;"> 
                     	</br>
                     	</br>
                        	<table width="500" border="1" bordercolor="white">
                            	<tr style="font-weight:700;">
                            		<td></td>
                                	<td>Cod-incidencia</td>
                                    <td>Tipo</td>
                                    <td>Detalle/td>
                                    <td>Area</td>
                                    <td>Usuario</td>
                                </tr>
                                <s:iterator value="incidencias">
                                <tr>
                                    <td><a href="<s:url action='eliminarIncidencia-%{id}' namespace="/despacho"/>">Eliminar</a></td>
                                    <td><s:property value="id"/></td>
                                    <td><s:property value="tipo"/></td>
                                    <td><s:property value="detalle"/></td>                         
                                	<td><s:property value="area"/></td>
                                	<td><s:property value="usuario"/></td>
                                </tr>
                                </s:iterator>
                              </table>
					                                                 
                      </div>    
                                     
                        <!--------------------------------------------------------->
                        </br>
                        </br>
                        
                    <div style="margin-left:5px;">  
                        <div style="float:left; margin-right:10px"><a href="#" class="button" onclick="document.getElementById('form_1').submit()">Imprimir</a></div>
                        <Br>
                    </div>
								

			</article>
	
</div>            
</body>
</html>
