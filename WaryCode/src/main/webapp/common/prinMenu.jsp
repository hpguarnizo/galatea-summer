<%@ taglib uri="/struts-tags" prefix="st" %>

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

<div align="left" style="margin-left:50px;">
<article>
	<div style="width:200px;">
			<li style="width: 200px;">
				<ul class="tabs3">
				<st:if test="#session.user.tipo == 3">
					<li><a href="<st:url action='opcionCounter' namespace="/despacho"/>">Counter</a></li>
				</st:if>
			    <st:if test="#session.user.tipo == 2">
					<li><a href="<st:url action='opcionDespachador' namespace="/despacho"/>">Despachador</a></li>
					
                    <li><a href="<st:url action='opcionAlmacenero' namespace="/despacho"/>">Almacenero</a></li>
                    <li><a href="<st:url action='opcionAdministrador' namespace="/despacho"/>">Administrador</a></li>
                    </st:if>
				</ul>
            </li>
	</div> 			
</article>
            
</div>            
</body>
</html>
