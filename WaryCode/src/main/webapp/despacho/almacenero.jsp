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
<!--<article class="col11"><p style="font-family:Verdana, Geneva, sans-serif; font-size:18px; margin:auto; padding:15px;">"##/##/####"<br /><br />##:##:##</p><img src="images/counter.png" width="200px" /><br /><br /><br /><img src="images/peru.png" width="200px"/><br /><br /><br /><img src="images/cargo.png" width="200px" /></article>-->
<article class="col18">
				
                <ul class="tabs1">
					<li style="width:255px;"><a href="<s:url action='opcionIngALm' namespace="/despacho"/>">Registrar Ingreso a Almacen</a></li>
                    <li style="width:255px;"><a href="<s:url action='opcionSaliAlm' namespace="/despacho"/>">Registrar Salida de Almacen</a></li>
				             
                </ul>
                <p style="margin-left:50px; font-family:Verdana, Geneva, sans-serif; font-size:20px; margin:auto; margin-top:50px; padding-left:50px;">Bienvenido Almacenero: "William Vargas Tipismana" <br /><br />FOTO: <br /> <br /> <img src="images/fuckyeah.jpg" width="138" height="149" /></p>
</article>
            <script type="text/javascript"> Cufon.now(); </script>
		<script>
		$(window).load(function() {
			$('.spinner').fadeOut();
			$('body').css({overflow:'inherit'})
		})
		</script>
</body>
</html>
