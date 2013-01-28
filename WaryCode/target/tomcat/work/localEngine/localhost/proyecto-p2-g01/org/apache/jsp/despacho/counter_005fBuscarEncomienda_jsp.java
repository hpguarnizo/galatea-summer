package org.apache.jsp.despacho;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class counter_005fBuscarEncomienda_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005furl_0026_005fnamespace_005faction_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005furl_0026_005fnamespace_005faction_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005furl_0026_005fnamespace_005faction_005fnobody.release();
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("\r\n");
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
      out.write("<div align=\"center\">\r\n");
      out.write("<article class=\"col18\">\r\n");
      out.write("\t\t\t\t<ul class=\"tabs\">\r\n");
      out.write("\t\t\t\t\t<li style=\"width:300px;margin-left:0px;\" ><a href=\"");
      if (_jspx_meth_s_005furl_005f0(_jspx_page_context))
        return;
      out.write("\">Registrar Ingreso a Despacho</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      if (_jspx_meth_s_005furl_005f1(_jspx_page_context))
        return;
      out.write("\">Registrar Encomienda</a></li>\r\n");
      out.write("                    <li><a href=\"");
      if (_jspx_meth_s_005furl_005f2(_jspx_page_context))
        return;
      out.write("\">Registrar Entrega</a></li>\r\n");
      out.write("                    <li><a href=\"#\" class=\"active\">Buscar Encomienda</a></li> \r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("        <div  class=\"tabs_cont\" style=\"margin-top: 200px;margin-left: 225px;\">\r\n");
      out.write("\t\t\t\t\t<form id=\"form_1\" action=\"buscarEncomienda\" method=\"simple\">\r\n");
      out.write("        \r\n");
      out.write("                    <!----------------BUSCAR CLIENTE--------------------->\r\n");
      out.write("                    \t<div style=\"float:left;font-size:15px;font-weight:800;color:#439DEB;text-decoration:underline;\">Buscar Encomienda</div>\r\n");
      out.write("                           \r\n");
      out.write("                        <div style=\"margin-left:200px; padding-top:35px;\">\r\n");
      out.write("                            <div style=\"margin-left:-450px;\" class=\"wrapper\">C&oacute;digo de Env&iacute;o:<input type=\"text\" class=\"input\"></div></br>\r\n");
      out.write("                            <div style=\"float:right;margin-right:280px;\"><a href=\"#\" class=\"button\" onclick=\"document.getElementById('form_1').submit()\">Buscar</a></div></br>\r\n");
      out.write("                         </div></br>   \r\n");
      out.write("                     <!-------------------RESULTADO DE BUSQUEDA (GRILLA)----------------> \r\n");
      out.write("                     \t<div style=\"float:left;font-size:15px;font-weight:800;color:#439DEB;text-decoration:underline;\">Resultado de Busqueda</div>\r\n");
      out.write("                     \t<div style=\"margin-left:-120px;padding-top:45px;\"> \r\n");
      out.write("                        \t<table width=\"300\" border=\"1\" cellspacing=\"0\" bordercolor=\"#EEEEEE\">\r\n");
      out.write("                            \t<tr style=\"font-weight:700;\">\r\n");
      out.write("                                \t<td>Destino</td>\r\n");
      out.write("                                \t<td>Peso</td>\r\n");
      out.write("                                    <td>Volumen</td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                \t<td>Piura</td>\r\n");
      out.write("                                    <td>500Kg</td>\r\n");
      out.write("                                    <td>800</td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                            </table></br>\r\n");
      out.write("                            <div style=\"margin-left:-38px\" class=\"wrapper\">*Encomienda no encontrada</div>                          \r\n");
      out.write("                      </div></br>                    \r\n");
      out.write("                        <!--------------------------------------------------------->\r\n");
      out.write("                    <div style=\"margin-left:5px;\">  \r\n");
      out.write("                        <div style=\"float:left; margin-right:10px\"><a href=\"#\" class=\"button\" onclick=\"document.getElementById('form_1').submit()\">Continuar</a></div>\r\n");
      out.write("                        <div style=\"float:left;margin-left:15px;\"><a href=\"#\" class=\"button\" onclick=\"document.getElementById('form_1').submit()\">Cancelar</a></div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t</article>\r\n");
      out.write("</div>            \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_s_005furl_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_005furl_005f0 = (org.apache.struts2.views.jsp.URLTag) _005fjspx_005ftagPool_005fs_005furl_0026_005fnamespace_005faction_005fnobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005furl_005f0.setParent(null);
    // /despacho/counter_BuscarEncomienda.jsp(23,56) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005furl_005f0.setAction("listarDespacho");
    // /despacho/counter_BuscarEncomienda.jsp(23,56) name = namespace type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005furl_005f0.setNamespace("/despacho");
    int _jspx_eval_s_005furl_005f0 = _jspx_th_s_005furl_005f0.doStartTag();
    if (_jspx_th_s_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005furl_0026_005fnamespace_005faction_005fnobody.reuse(_jspx_th_s_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005furl_0026_005fnamespace_005faction_005fnobody.reuse(_jspx_th_s_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005furl_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_005furl_005f1 = (org.apache.struts2.views.jsp.URLTag) _005fjspx_005ftagPool_005fs_005furl_0026_005fnamespace_005faction_005fnobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_005furl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005furl_005f1.setParent(null);
    // /despacho/counter_BuscarEncomienda.jsp(24,18) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005furl_005f1.setAction("opcionRegistrarEnco");
    // /despacho/counter_BuscarEncomienda.jsp(24,18) name = namespace type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005furl_005f1.setNamespace("/despacho");
    int _jspx_eval_s_005furl_005f1 = _jspx_th_s_005furl_005f1.doStartTag();
    if (_jspx_th_s_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005furl_0026_005fnamespace_005faction_005fnobody.reuse(_jspx_th_s_005furl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005furl_0026_005fnamespace_005faction_005fnobody.reuse(_jspx_th_s_005furl_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005furl_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_005furl_005f2 = (org.apache.struts2.views.jsp.URLTag) _005fjspx_005ftagPool_005fs_005furl_0026_005fnamespace_005faction_005fnobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_005furl_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005furl_005f2.setParent(null);
    // /despacho/counter_BuscarEncomienda.jsp(25,33) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005furl_005f2.setAction("opcionRegistrarEntre");
    // /despacho/counter_BuscarEncomienda.jsp(25,33) name = namespace type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005furl_005f2.setNamespace("/despacho");
    int _jspx_eval_s_005furl_005f2 = _jspx_th_s_005furl_005f2.doStartTag();
    if (_jspx_th_s_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005furl_0026_005fnamespace_005faction_005fnobody.reuse(_jspx_th_s_005furl_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005furl_0026_005fnamespace_005faction_005fnobody.reuse(_jspx_th_s_005furl_005f2);
    return false;
  }
}
