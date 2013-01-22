<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
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
</head>

<body>
<!-- <article class="col11"><p style="font-family:Verdana, Geneva, sans-serif; font-size:18px; margin:auto; padding:15px;">"##/##/####"<br /><br />##:##:##<br /><br />DESPACHADOR:<br /><br />"Huido Diaz Cabezas"</p><img src="images/fapencio.jpg" width="200px" /><br /><br /><br /><img src="images/counter.png" width="200px" /><br /><br /><br /><img src="images/peru.png" width="200px"/><br /><br /><br /><img src="images/cargo.png" width="200px" /></article> -->
<div align="center">
<article class="col18">
				<ul class="tabs2">
					<li style="width:450px;margin-left:0px;" ><a href="#" class="active">Listar encomiendas a entregar</a></li>
                     
				                  
                    
                </ul>
				<div  class="tabs_cont" style="margin-top: 200px;margin-left: 200px">

                     <!-------------------DATOS DE GRT----------------> 
                    	<div style="float:left;font-size:15px;font-weight:800;color:#439DEB;text-decoration:underline;">Listar encomiendas a despachar</div>
              			            
                     <!-------------------LISTA DE GRT (GRILLA)---------------->        
                       <div style="float:left;font-size:15px;font-weight:800;color:#439DEB;text-decoration:underline;"></div>
                      		<div style="padding-top:35px;margin-left:0px;">
                        	<table width="500" border="1" cellspacing="0" bordercolor="#EEEEEE">
                            	<tr style="font-weight:700;">
                                	<td>C&oacute;digo de encomienda</td>
                                    <td>destino</td>
                                    <td>Peso</td>
                                    <td>Volumen</td> 
                                </tr>
                                <s:iterator value="despachos">
                                <tr>
                                    <td><s:property value="idEnco"/></td>
                                    <td><s:property value="destino"/></td>
                                    <td><s:property value="peso"/></td>
                                    <td><s:property value="volumen"/></td>
                                </tr>
                                </s:iterator>
                            </table></br>
                             <div style="float:right;margin-right:80px;"><a href="#" class="button2" onclick="document.getElementById('form_1').submit()">Registrar Incidencia</a></div>
                             <div style="float:right;margin-right:80px;"><a href="#" class="button2" onclick="document.getElementById('form_1').submit()">Actualizar Estado</a></div></br></br>
                        </div>  
                     	                 
                        <!--------------------------------------------------------->
                        		
					</div>
			</article>
</div>            
</body>
</html>
