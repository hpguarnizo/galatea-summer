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
<article class="col11"><p style="font-family:Verdana, Geneva, sans-serif; font-size:18px; margin:auto; padding:15px;">"##/##/####"<br /><br />##:##:##<br /><br />COUNTER:<br /><br />"Veronica Casas Azañedo"</p><img src="images/fuckencia.jpeg" width="200px" /><br /><br /><br /><img src="images/counter.png" width="200px" /><br /><br /><br /><img src="images/peru.png" width="200px"/><br /><br /><br /><img src="images/cargo.png" width="200px" /></article>
<div align="center">
<article class="col18">
				
<ul class="tabs">
					<li><a href="<s:url action='opcionRegistrarEnco' namespace="/despacho"/>">Registrar Encomienda</a></li>
               		<li><a href="<s:url action='opcionRegistrarRemi' namespace="/despacho"/>">Registrar Cliente</a></li>
					<li><a href="#" class="active">Buscar<br />Cliente</a></li>
                    
				</ul>
				
        
				<div  class="tabs_cont">
					

                    <!----------------BUSCAR CLIENTE--------------------->
                    	<div style="float:left;font-size:15px;font-weight:800;color:#439DEB;text-decoration:underline;">Buscar Cliente</div>
                        <div style="margin-left:90px; padding-top:35px;">
                        	                   			
                             
                            		
                           		<!-------------------BUSCAR CLIENTE---------------> 
                     		<s:form id="form_1" action="bCliente">   
                          	
                            <div style="margin-left:-200px" class="wrapper">	
                            <s:label value="Tipo de Cliente"/>			
                            <s:select name="clientes.tipo" style="margin-left:90px;"headerKey="1" headerValue="(Seleccione)" 
							list="#{'natural':'natural','juridico':'juridico'}"/>
                             </div>		
                            <div style="margin-left:-200px" class="wrapper">
                            <s:label value="Documento"/>
                            <s:textfield name="clientes.nrodoc"/>
                            </div>

                           <div style="float:left;margin-left:-40px;">
                           <s:submit value="Buscar"/></a></div></br>
                           </div>
                           </br>   
                             </s:form>
                                 
                                 
                                 
                                 
                     <!-------------------RESULTADO DE BUSQUEDA (GRILLA)----------------> 
                    	<div style="float:left;font-size:15px;font-weight:800;color:#439DEB;text-decoration:underline;">Resultado de Busqueda</div>
                     	<div style="margin-left:-120px;padding-top:45px;"> 
                     	</br>
                     	</br>
                        	<table width="300" border="1" bordercolor="white">
                            	<tr style="font-weight:700;">
                            		<th></th>
                                	<th>Nro Documento</th>
                                    <th>Nombre</th>
                                    <th>Apellido</th>
                                   	<th>Tipo</th>
                                </tr>
                                <s:iterator value="clientes">
                                <tr>
                                    <th></th>
                                    <th><s:property value="nrodoc"/></th>
                                    <th><s:property value="nombre"/></th>
                                    <th><s:property value="apellido"/></th>
                                    <th><s:property value="tipo"/></th>
                                </tr>
						</table>
					                                                 
                      </div>                  
					<div style="margin-left:10px;">  
                      <div style="float:left;margin-left:15px;"><a href="<s:url action='enviarIdRegenco-%{nrodoc}' namespace="/despacho"/>">Continuar</a></div>
                     </div>
							 </s:iterator>	
                       <!--------------------------------------------------------->
				</div>
			</article>
</div>            
</body>
</html>