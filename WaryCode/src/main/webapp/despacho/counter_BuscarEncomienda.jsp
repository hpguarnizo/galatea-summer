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
<article class="col18">	
					

                    <!----------------BUSCAR ENCOMIENDA--------------------->
                    	<div style="float:left;font-size:15px;font-weight:800;color:#439DEB;text-decoration:underline;">Buscar Encomienda</div>
                        <div style="margin-left:90px; padding-top:35px;">
                        	                   			
                             
                            		
                        <!-------------------BUSCAR ENCOMIENDA---------------> 
                     		<s:form id="form_1" action="bEncomienda">   		
                           
                           	<div style="margin-left:-200px" class="wrapper">
                        	<div style="float:left;"><s:label value="%{getText('counter_BuscarEncomienda.encomienda.codigo')}"/>
                       	 	<s:textfield name="encomienda.idEnco"/>
                       	 	</div>
                       	 	
                           	<div style="float:right;margin-right:80px;">
                           	<s:submit value="%{getText('counter_BuscarEncomienda.encomienda.btnBuscar')}"/>
                           	</div>
                        	</div>
                            </br>
                            </br>   
                            
                            </s:form>
                                 
                                 
                                 
                                 
                     <!-------------------RESULTADO DE BUSQUEDA (GRILLA)----------------> 
                    	<div style="float:left;font-size:15px;font-weight:800;color:#439DEB;text-decoration:underline;">Resultado de Busqueda</div>
                     	<div style="margin-left:-70px;padding-top:45px;"> 
                     	</br>
                     	</br>
                        	<table width="300" border="1" bordercolor="white">
                            	<tr style="font-weight:700;">
                            		<td></th>
                                	<td>Nro Encomienda</td>
                                    <td>Destino</td>
                                    <td>Estado</td>
                                   	<td>Detalle</td>
                                </tr>
                                <s:iterator value="encomienda">
                                <tr>
                                    <td></th>
                                    <td><s:property value="idEnco"/></td>
                                    <td><s:property value="destino"/></td>
                                    <td><s:property value="estado"/></td>
                                    <td><s:property value="detalle"/></td>
                                </tr>
                                </s:iterator>	
						</table>
					                                                 
                      </div>                  
					<div style="margin-left:10px;">  
                      <div style="float:left;margin-left:15px;">
                      <a href="<s:url action='enviarIdSalmacen-%{idEnco}' namespace="/despacho"/>">Continuar</a></div>
                     </div>
							
                       <!--------------------------------------------------------->
			</article>           
</body>
</html>