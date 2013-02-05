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
<!--<article class="col11"><p style="font-family:Verdana, Geneva, sans-serif; font-size:18px; margin:auto; padding:15px;">"##/##/####"<br /><br />##:##:##<br /><br />ALMACENERO:<br /><br />"William Vargas Tipismana"</p><img src="images/fuckyeah.jpg" width="200px" /><br /><br /><br /><img src="images/counter.png" width="200px" /><br /><br /><br /><img src="images/peru.png" width="200px"/><br /><br /><br /><img src="images/cargo.png" width="200px" /></article> -->
<div align="center">
<article class="col18">
				<ul class="tabs1">
					<li style="width:240px;"><a href="#" class="active">Registrar Ingreso a Almacen</a></li>
                    <li style="width:240px;"><a href="<s:url action='opcionSaliAlm' namespace="/despacho"/>">Registrar Salida de Almacen</a></li>             
                    <li style="width:180px;"><a href="<s:url action='opcionReIncidencia' namespace="/despacho"/>">Registrar Incidencia</a></li>
				</ul>
				<div  class="tabs1_cont" style="margin-left: 200px;margin-top: 210px;">
					<s:form id="form_1" action="buscarUbicacion">
                    
                    <div style="float:left;font-size:13px;font-weight:800;">Codigo de Env&iacute;o:Xxxx</div><br />
                    <div style="float:right;margin-right:100px;"></div></br></br>
                    
                        	<div style="float:left;"><s:label value="codigo"/><s:textfield name="encomienda.idEnco"/></div></br>
                        	<div style="float:left;"><s:label value="%{getText('counter_RegistrarEncomienda.encomienda.destino')}"/><s:textfield name="encomienda.destino" value="%{destino}" readonly="true"/></div></br>
                            <div style="float:left;"><s:label value="%{getText('counter_RegistrarEncomienda.encomienda.peso')}"/><s:textfield name="encomienda.peso" value="%{peso}" readonly="true"/></div></br>
                            <div style="float:left;"><s:label value="%{getText('counter_RegistrarEncomienda.encomienda.volumen')}"/><s:textfield name="encomienda.volumen" value="%{volumen}" readonly="true"/></div></br>
                         	<s:submit value="buscar"/>
                         	<s:property value="mensajeE"/>
                         </div>
                         </s:form>
                             <!-------------------RESULTADO DE BUSQUEDA (GRILLA)----------------> 	
                     	<div style="float:left;font-size:15px;font-weight:800;color:#439DEB;text-decoration:underline;">Ubicaci&oacute;n de Almancenaje</div>
                     	<div style="margin-left:-100px;padding-top:45px;"> 
                     	
                     	
                        <s:form id="form1" action="registrarIng">
                        	<s:label value="bloque"/>   
                            		<s:select name="almacen.bloque" style="margin-left:90px;"
                                    	headerKey="1" headerValue="(Seleccione)" 
										list="#{'A':'A','B':'B','C':'C'}"/></br>
										<s:label value="area"/></br>   
                            		<s:select name="almacen.area" style="margin-left:90px;"
                                    	headerKey="1" headerValue="(Seleccione)" 
										list="#{'Fragiles':'Fragiles','No Fragiles':'No Fragiles','Premium':'Premium'}"/></br>
										<s:label value="seccion"/></br>
									<s:select name="almacen.seccion" style="margin-left:90px;"
                                    	headerKey="1" headerValue="(Seleccione)" 
										list="#{'1A':'1A','2A':'2A','3A':'3A'}"/></br>	
									<s:textfield name="almacen.idEnco" value="%{idEnco}" hidden="true"/>
									<s:submit value="Guardar"/>	
									<s:property value="mensajeI"/>		                        
                     	</s:form>
                    
                      </div></br>  
                      <s:form action="actualizarEnco" theme="simple">
                            <s:textfield name="encomienda.idEnco" value="%{idEnco}" hidden="true"/>
                            <s:textfield name="encomienda.estado" value="En almacen" hidden="true"/>
                            <s:property value="mensajeAE"/>
                            <div style="float:right;margin-right:80px;"><s:reset value="Limpiar"/></div></br>
                      </s:form>
                         </div></br>   
                     
                        <!--------------------------------------------------------->
                    <div style="margin-left:90px;">  
                    </div>
			</article>
</div>            
</body>
</html>
