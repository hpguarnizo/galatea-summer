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

<script> 
function abrir() { 
open('buscarEncomienda.jsp','','top=300,left=300,width=300,height=300') ; 
} 
</script> 
</head>

<body>
<div align="center">
<article class="col18">
				<ul class="tabs1">
					<li style="width:240px;"><a href="<s:url action='opcionIngALm' namespace="/despacho"/>">Registrar Ingreso a Almacen</a></li>
                    <li style="width:240px;"><a href="#" class="active">Registrar Salida de Almacen</a></li>
				    <li style="width:180px;"><a href="<s:url action='opcionReIncidencia' namespace="/despacho"/>">Registrar Incidencia</a></li>             
				</ul>
				<div  class="tabs1_cont" style="margin-top: 210px;margin-left: 200px;">
		
                     <!-------------------DATOS DE ENCOMIENDA----------------> 
                     	<div style="float:left;font-size:15px;font-weight:800;color:#439DEB;text-decoration:underline;">Datos de Encomienda</div>
                     	<div style="float:right;margin-right:280px;"><a href="#" class="button" onclick="abrir()">Buscar Encomienda</a></div></br>
                     	
                     	<div style="margin-left:105px; margin-top:35px;">
                     		<table width="500" border="1" cellspacing="0" bordercolor="#EEEEEE">
                     			<tr style="font-weight:700;">
                                	<td>Codigo</td>
                                	<td>Destino</td>
                                	<td>Peso</td>
                                    <td>Volumen</td>
                                    <td>FechaRegistro</td>
                                    <td>estado</td>
                                </tr>
                                <s:iterator value="encomiendas">
                                <tr>
                                    <td><s:property value="idEnco"/></td>
                                    <td><s:property value="destino"/></td>
                                    <td><s:property value="peso"/></td>
                                    <td><s:property value="volumen"/></td>
                                    <td><s:property value="fechaReg"/></td>
                                    <td><s:property value="estado"/></td>
                                </tr>
                                </s:iterator>
                            </table>   
                      </div>
                      </br>
                      
                        <!--------------------------------------------------------->
                    <div style="margin-left:10px;">  
                        <div style="float:left;margin-left:15px;"><a href="#" class="button" onclick="document.getElementById('form_1').submit()">Grabar</a></div>
                        <div style="float:left;margin-left:15px;"><a href="#" class="button" onclick="document.getElementById('form_1').submit()">Cancelar</a></div>
                    </div>
								
				
				</div>
			</article>
</div>            
</body>
</html>