package org.apache.jsp.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class prinHeader_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.release();
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>Intranet de Administracion de Encomiendas</title>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/reset.css\" type=\"text/css\" media=\"all\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/layout.css\" type=\"text/css\" media=\"all\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" media=\"all\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.4.2.js\" ></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/cufon-yui.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/cufon-replace.js\"></script>  \r\n");
      out.write("<script type=\"text/javascript\" src=\"js/Myriad_Pro_600.font.js\"></script>\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"http://info.template-help.com/files/ie6_warning/ie6_script_other.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/html5.js\"></script>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("</head>\r\n");
      out.write("<body id=\"page1\">\r\n");
      out.write("<div align=\"right\">");
      if (_jspx_meth_s_005fproperty_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<div class=\"extra\">\r\n");
      out.write("\t<div class=\"main\">\r\n");
      out.write("<!-- header -->\r\n");
      out.write("\t\t<header>\r\n");
      out.write("\t\t\t<div class=\"wrapper\">\r\n");
      out.write("\t\t\t\t<h1><a href=\"index.html\" id=\"logo\">Around the World</a></h1>\r\n");
      out.write("\t\t\t\t<div class=\"right\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t\t<nav id=\"menu2\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</nav>\r\n");
      out.write("\t\t</section>\r\n");
      out.write("<!-- / content -->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("</div>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\"> Cufon.now(); </script>\r\n");
      out.write("</body>\r\n");
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

  private boolean _jspx_meth_s_005fproperty_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f0 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f0.setParent(null);
    // /common/prinHeader.jsp(23,19) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f0.setValue("#session.user.alias");
    int _jspx_eval_s_005fproperty_005f0 = _jspx_th_s_005fproperty_005f0.doStartTag();
    if (_jspx_th_s_005fproperty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f0);
    return false;
  }
}
