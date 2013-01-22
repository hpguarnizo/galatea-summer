package org.apache.jsp.Wary;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class despachador_005fRegistrarIngresoEncomiendaDespacho_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/reset.css\" type=\"text/css\" media=\"all\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/layout.css\" type=\"text/css\" media=\"all\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" media=\"all\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.4.2.js\" ></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/cufon-yui.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/cufon-replace.js\"></script>  \r\n");
      out.write("<script type=\"text/javascript\" src=\"js/Myriad_Pro_600.font.js\"></script>\r\n");
      out.write("<title>Untitled Document</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<article class=\"col11\"><p style=\"font-family:Verdana, Geneva, sans-serif; font-size:18px; margin:auto; padding:15px;\">\"##/##/####\"<br /><br />##:##:##<br /><br />DESPACHADOR:<br /><br />\"Huido Diaz Cabezas\"</p><img src=\"images/fapencio.jpg\" width=\"200px\" /><br /><br /><br /><img src=\"images/counter.png\" width=\"200px\" /><br /><br /><br /><img src=\"images/peru.png\" width=\"200px\"/><br /><br /><br /><img src=\"images/cargo.png\" width=\"200px\" /></article>\r\n");
      out.write("<div align=\"center\">\r\n");
      out.write("<article class=\"col18\">\r\n");
      out.write("\t\t\t\t<ul class=\"tabs2\">\r\n");
      out.write("\t\t\t\t\t<li style=\"width:450px;margin-left:0px;\" ><a href=\"#\" class=\"active\">Registrar Ingreso de Encomienda a Despacho</a></li>\r\n");
      out.write("                     <li style=\"width:210px;margin-left:0px;\"><a href=\"despachador_ActualizarEstado.html\">Actualizar estado</a></li>\r\n");
      out.write("\t\t\t\t                  \r\n");
      out.write("                    \r\n");
      out.write("                </ul>\r\n");
      out.write("\t\t\t\t<div  class=\"tabs_cont\">\r\n");
      out.write("\t\t\t\t\t<form id=\"form_1\" action=\"\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("                     <!-------------------DATOS DE GRT----------------> \r\n");
      out.write("                    \t<div style=\"float:left;font-size:15px;font-weight:800;color:#439DEB;text-decoration:underline;\">Registrar Ingreso a Despacho</div>\r\n");
      out.write("                        <div style=\"margin-left:-100px\" class=\"wrapper\"><input type=\"text\" class=\"input\">Nro de GRT:</div></br>   \r\n");
      out.write("                        <div style=\"float:right;margin-right:100px;\"><a href=\"#\" class=\"button\" onclick=\"document.getElementById('form_1').submit()\">Buscar</a></div>\r\n");
      out.write("              \t\t\t            \r\n");
      out.write("                     <!-------------------LISTA DE GRT (GRILLA)---------------->        \r\n");
      out.write("                       <div style=\"float:left;font-size:15px;font-weight:800;color:#439DEB;text-decoration:underline;\">Detalle de GRT</div>\r\n");
      out.write("                      \t\t<div style=\"padding-top:35px;margin-left:0px;\">\r\n");
      out.write("                        \t<table width=\"500\" border=\"1\" cellspacing=\"0\" bordercolor=\"#EEEEEE\">\r\n");
      out.write("                            \t<tr style=\"font-weight:700;\">\r\n");
      out.write("                                \t<td>C&oacute;digo de Env&iacute;o</td>\r\n");
      out.write("                                    <td>Origen</td>\r\n");
      out.write("                                    <td>Peso</td>\r\n");
      out.write("                                    <td>Volumen</td>\r\n");
      out.write("                                    <td>&nbsp;&nbsp;</td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <td>12345</td>\r\n");
      out.write("                                    <td>Lima</td>\r\n");
      out.write("                                    <td>500</td>\r\n");
      out.write("                                    <td>300</td>\r\n");
      out.write("                                    <td><div><input type=\"checkbox\" checked=\"\"></div></td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                            </table></br>\r\n");
      out.write("                             <div style=\"float:right;margin-right:80px;\"><a href=\"#\" class=\"button2\" onclick=\"document.getElementById('form_1').submit()\">Registrar Incidencia</a></div>\r\n");
      out.write("                             <div style=\"float:right;margin-right:80px;\"><a href=\"#\" class=\"button2\" onclick=\"document.getElementById('form_1').submit()\">Actualizar Estado</a></div></br></br>\r\n");
      out.write("                        </div>  \r\n");
      out.write("                     \t                 \r\n");
      out.write("                        <!--------------------------------------------------------->\r\n");
      out.write("                        \t\t\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</article>\r\n");
      out.write("</div>            \r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
