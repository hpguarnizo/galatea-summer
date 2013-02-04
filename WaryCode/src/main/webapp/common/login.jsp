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

<script type="text/javascript" src="js1/jquery-1.7.1.min.js"> </script>
<script>
$(document).ready(function(){
   alert('hola wachiturro :D');
})
</script>

<script>
$(document).ready(function(){
   $("#campofecha").datepicker();
})
</script>
<script >  $(document).ready(function(){
	 $("btnIngresar").click(function(){
		 var usuario= $("itcuenta").val();
		 var contrasena= $("itclave").val();
	 });
	
})   

</script>
</head>

<body>
<article>
	<div>
		<img src="images/logo.jpg" width="354px" />
	</div>
	<div>
		<s:form action="login" theme="simple">		
            
  		<p style="font-family:Verdana, Geneva, sans-serif; font-size:20px; 
		margin:auto; margin-top:50px; padding-left:500px;">LOGIN:<br /> <br />
  		
  		<s:label placeholder="Usuario" value="%{getText('login.usuario.cuenta')}"/><s:textfield id="itcuenta" name="usuario.cuenta" style="margin-left:50px"/><br />
  		
  		<br /><s:label placeholder="clave" value="%{getText('login.usuario.clave')}"/><s:textfield id="itclave" name="usuario.clave" style="margin-left:10px"/><br />
  		
  		<br /><br /><s:submit id="bEnviar" value="%{getText('login.btnIngresar')}"/><br /><s:property value="mensaje"/><br />
    	<img src="images/login.png" width="332" height="268" style="margin-left:180px;" /></p>
	</div>
</article>
            <script type="text/javascript"> Cufon.now(); </script>
		<script>
		$(window).load(function() {
			$('.spinner').fadeOut();
			$('body').css({overflow:'inherit'})
		})
		</script>
		</s:form>
		<br />
		
</body>
</html>
