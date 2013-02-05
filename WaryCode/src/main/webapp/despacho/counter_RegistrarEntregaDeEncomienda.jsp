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
open('RegistrarIncidencia.jsp','','top=50,left=400,width=600,height=500') ; 
} 
</script> 

</head>

<body>
<!-- <article class="col11"><p style="font-family:Verdana, Geneva, sans-serif; font-size:18px; margin:auto; padding:15px;">"##/##/####"<br /><br />##:##:##<br /><br />COUNTER:<br /><br />"Veronica Casas Azañedo"</p><img src="images/fuckencia.jpeg" width="200px" /><br /><br /><br /><img src="images/counter.png" width="200px" /><br /><br /><br /><img src="images/peru.png" width="200px"/><br /><br /><br /><img src="images/cargo.png" width="200px" /></article> -->
<div align="center">
<article class="col18">
				<ul class="tabs1">
					<li style="width:260px;margin-left:0px;" ><a href="<s:url action='listarDespacho' namespace="/despacho"/>">Registrar Ingreso a Despacho</a></li>                    
                    <li style="width:170px;"><a href="<s:url action='opcionRegistrarEntre' namespace="/despacho"/>">Registrar Entrega</a></li>
                    
				</ul>
				<div  class="tabs_cont" style="margin-top: 200px;margin-left: 190px;">
					
                     
						
				
					<!-------------------DATOS DE ENCOMIENDA (GRILLA)----------------> 
                      <div style="float:left;font-size:15px;font-weight:800;color:#439DEB;text-decoration:underline;">Datos destinatario</div>
                     	
                     	
                     	
                     	
                     	<div style="margin-left:25px;padding-top:5px;">
                     	
                     	 
                        	<div style="float:right;margin-right:80px;"></div><br/>
                        	<table width="100" border="0" cellspacing="0">
                        	
                        	<tr>
                            		<td><a href="<s:url action='buscarCliente' namespace="/despacho"/>">Buscar Cliente</a></td>
                            		
                            		                          		
                           	</tr>
                           	
                        	</table>
                        	<br/>
                            		<br/>
                        	<table width="300" border="1" cellspacing="0" bordercolor="#EEEEEE">
                            	
                            	<tr style="font-weight:700;">
                            		<td></td>
                                	<td>Nombre/RazonSocial</td>
                                    <td>Apellido/PersonaContacto</td>                                
                                    <td>Dni/Ruc</td>
                                    
                                </tr>
                                
                                <s:iterator value="encomiendas">
                                <tr>
                                    <td><a href="<s:url action='eliminarEncomienda-%{idEnco}' namespace="/despacho"/>">Entregar</a></td>
                                    <td><s:property value="idEnco"/></td>
                                    <td><s:property value="destino"/></td>
                                    <td><s:property value="tipo"/></td>   
                                	
                                	
                                </tr>
                                </s:iterator>
                                <s:property value="mensajeEE"/>
                            </table>
                          
                            </br>                         
                      </div></br>        
                    
                         
                     <!-------------------DATOS DE ENCOMIENDA (GRILLA)----------------> 
                     	<div style="float:left;font-size:15px;font-weight:800;color:#439DEB;text-decoration:underline;">Datos de Encomienda</div>
                     	<div style="margin-left:25px;padding-top:45px;">
                        	<div style="float:right;margin-right:80px;"></div></br><br /><br />
                        	<table width="300" border="1" cellspacing="0" bordercolor="#EEEEEE">
                            	<tr style="font-weight:700;">
                            		<td></td>
                                	<td>Codigo</td>
                                    <td>Destino</td>                                
                                    <td>Peso</td>
                                    <td>volumen</td>
                                    <td>FechaRegistro</td>
                                </tr>
                                <s:iterator value="encomiendas">
                                <tr>
                                    <td><a href="<s:url action='eliminarEncomienda-%{idEnco}' namespace="/despacho"/>">Entregar</a></td>
                                    <td><s:property value="idEnco"/></td>
                                    <td><s:property value="destino"/></td>
                                    <td><s:property value="tipo"/></td>   
                                	<td><s:property value="peso"/></td>
                                	<td><s:property value="estado"/></td>
                                	<td><s:property value="detalle"/></td>
                                </tr>
                                </s:iterator>
                                <s:property value="mensajeEE"/>
                            </table>
                            </br>                         
                      </div></br>                    
                        <!--------------------------------------------------------->
                        
                        <table width="400" border="0" cellspacing="0">
                        	
                        	<tr  style="font-weight:400;">
                           		<td>INGRESE CLAVE:<s:textfield name="encomienda.tiempoAprox"/></td><td><s:submit value="VALIDAR"/></td>
                            </tr>        
                                         
                           	<td><s:submit onclick="abrir()" value="Registrar Incidencia"/></td>
                            <td><s:submit value="Grabar"/></td>
                            <td><s:submit value="Cancelar"/></td>
                        	</table>
                       
                        
                    
				</div>
			</article>
</div>            
</body>
</html>
