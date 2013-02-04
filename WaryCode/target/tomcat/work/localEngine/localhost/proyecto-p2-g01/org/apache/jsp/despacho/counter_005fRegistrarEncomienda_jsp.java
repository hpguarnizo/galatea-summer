package org.apache.jsp.despacho;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class counter_005fRegistrarEncomienda_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005furl_0026_005fnamespace_005faction_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fform_0026_005ftheme_005fid_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005flabel_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fhidden_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fselect_0026_005fstyle_005fname_005flist_005fheaderValue_005fheaderKey_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftextfield_0026_005ftype_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftextarea_0026_005fstyle_005frows_005fname_005fcols_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005furl_0026_005fnamespace_005faction_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fform_0026_005ftheme_005fid_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005flabel_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fhidden_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fselect_0026_005fstyle_005fname_005flist_005fheaderValue_005fheaderKey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005ftype_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005ftextarea_0026_005fstyle_005frows_005fname_005fcols_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005furl_0026_005fnamespace_005faction_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fform_0026_005ftheme_005fid_005faction.release();
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005flabel_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fhidden_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fselect_0026_005fstyle_005fname_005flist_005fheaderValue_005fheaderKey_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005ftype_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005ftextarea_0026_005fstyle_005frows_005fname_005fcols_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005fnobody.release();
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
      out.write("<!-- <article class=\"col11\"><p style=\"font-family:Verdana, Geneva, sans-serif; font-size:18px; margin:auto; padding:15px;\">\"##/##/####\"<br /><br />##:##:##<br /><br />COUNTER:<br /><br />\"Veronica Casas Azañedo\"</p><img src=\"images/fuckencia.jpeg\" width=\"200px\" /><br /><br /><br /><img src=\"images/counter.png\" width=\"200px\" /><br /><br /><br /><img src=\"images/peru.png\" width=\"200px\"/><br /><br /><br /><img src=\"images/cargo.png\" width=\"200px\" /></article>-->\r\n");
      out.write("<div align=\"center\">\r\n");
      out.write("<article class=\"col18\">\r\n");
      out.write("\t\t\t\t<ul class=\"tabs\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\" class=\"active\">Registrar Encomienda</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      if (_jspx_meth_s_005furl_005f0(_jspx_page_context))
        return;
      out.write("\">Registrar Cliente</a></li>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<div  class=\"tabs_cont\" style=\"margin-top: 200px;margin-left: 225px;\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("                     ");
      if (_jspx_meth_s_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
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
    // /despacho/counter_RegistrarEncomienda.jsp(25,18) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005furl_005f0.setAction("opcionRegistrarRemi");
    // /despacho/counter_RegistrarEncomienda.jsp(25,18) name = namespace type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005furl_005f0.setNamespace("/despacho");
    int _jspx_eval_s_005furl_005f0 = _jspx_th_s_005furl_005f0.doStartTag();
    if (_jspx_th_s_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005furl_0026_005fnamespace_005faction_005fnobody.reuse(_jspx_th_s_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005furl_0026_005fnamespace_005faction_005fnobody.reuse(_jspx_th_s_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fform_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_005fform_005f0 = (org.apache.struts2.views.jsp.ui.FormTag) _005fjspx_005ftagPool_005fs_005fform_0026_005ftheme_005fid_005faction.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fform_005f0.setParent(null);
    // /despacho/counter_RegistrarEncomienda.jsp(30,21) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setId("form_1");
    // /despacho/counter_RegistrarEncomienda.jsp(30,21) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setAction("regenco");
    // /despacho/counter_RegistrarEncomienda.jsp(30,21) name = theme type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setTheme("simple");
    int _jspx_eval_s_005fform_005f0 = _jspx_th_s_005fform_005f0.doStartTag();
    if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fform_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fform_005f0.doInitBody();
      }
      do {
        out.write("              \r\n");
        out.write("                    <div style=\"float:right;font-size:13px;font-weight:800;\"></div>\r\n");
        out.write("                    <!----------------DATOS DE REMITENTE--------------------->\r\n");
        out.write("                    \t<div style=\"float:left;font-size:15px;font-weight:800;color:#439DEB;text-decoration:underline;\">Datos de Remitente</div>\r\n");
        out.write("                    \t\t</br>\r\n");
        out.write("                    \t\t</br>\r\n");
        out.write("                    \t\t\r\n");
        out.write("                        <div style=\"margin-left:90px;\">\r\n");
        out.write("                       \t<div style=\"float:left;\">");
        if (_jspx_meth_s_005ftextfield_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("</div>\r\n");
        out.write("                       \t</br>\r\n");
        out.write("                        <div style=\"float:left;\">");
        if (_jspx_meth_s_005ftextfield_005f1(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("</div></br>\r\n");
        out.write("                            <div style=\"float:right;margin-right:80px;\"><a href=\"");
        if (_jspx_meth_s_005furl_005f1(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\">Buscar Cliente</a></div>\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005fproperty_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                         </div></br></br></br>   \r\n");
        out.write("                       \r\n");
        out.write("                     <!-------------------DATOS DE ENCOMIENDA----------------> \r\n");
        out.write("                                              \t\t\r\n");
        out.write("\t\t\t<div style=\"float:left;font-size:15px;font-weight:800;color:#439DEB;text-decoration:underline;\">Datos de Encomienda</div>\r\n");
        out.write("                     \t<div style=\"margin-left:105px; margin-top:35px;\"> \r\n");
        out.write("                        \t<div style=\"margin-left:-105px;float:left;\" class=\"wrapper\">\r\n");
        out.write("                        \t");
        if (_jspx_meth_s_005ftextfield_005f2(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                        \t");
        if (_jspx_meth_s_005flabel_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("   \r\n");
        out.write("                            \t\t");
        if (_jspx_meth_s_005fselect_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                            </div>\r\n");
        out.write("                            <div style=\"margin-left:-200px\" class=\"wrapper\">\r\n");
        out.write("                            ");
        if (_jspx_meth_s_005flabel_005f1(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                            ");
        if (_jspx_meth_s_005ftextfield_005f3(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("</div>\r\n");
        out.write("                            <div style=\"margin-left:-150px\" class=\"wrapper\">\r\n");
        out.write("                            ");
        if (_jspx_meth_s_005flabel_005f2(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                            ");
        if (_jspx_meth_s_005ftextfield_005f4(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("</div>\r\n");
        out.write("                            <div style=\"margin-left:-220px\" class=\"wrapper\">\r\n");
        out.write("                            ");
        if (_jspx_meth_s_005flabel_005f3(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                            ");
        if (_jspx_meth_s_005ftextfield_005f5(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("</div>\r\n");
        out.write("                            <div style=\"margin-left:15px;\" class=\"wrapper\">\r\n");
        out.write("                            ");
        if (_jspx_meth_s_005flabel_005f4(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                            ");
        if (_jspx_meth_s_005ftextfield_005f6(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                            ");
        if (_jspx_meth_s_005flabel_005f5(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                            ");
        if (_jspx_meth_s_005ftextfield_005f7(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                            ");
        if (_jspx_meth_s_005flabel_005f6(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                            ");
        if (_jspx_meth_s_005ftextfield_005f8(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("</div>\r\n");
        out.write("                            <div style=\"margin-left:-170px\" class=\"wrapper\">\r\n");
        out.write("                            ");
        if (_jspx_meth_s_005flabel_005f7(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                            ");
        if (_jspx_meth_s_005ftextfield_005f9(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("</div>\r\n");
        out.write("                            <div style=\"margin-left:-230px\" class=\"wrapper\">\r\n");
        out.write("                            ");
        if (_jspx_meth_s_005flabel_005f8(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                            ");
        if (_jspx_meth_s_005ftextfield_005f10(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("</div>\r\n");
        out.write("                            <div style=\"margin-left:-105px;float:left;\" class=\"wrapper\">   \r\n");
        out.write("                            \t\t");
        if (_jspx_meth_s_005flabel_005f9(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                            \t\t");
        if (_jspx_meth_s_005fselect_005f1(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                            </div> \r\n");
        out.write("                            <div style=\"margin-left:-200px\" class=\"wrapper\">\r\n");
        out.write("                            ");
        if (_jspx_meth_s_005flabel_005f10(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                            ");
        if (_jspx_meth_s_005ftextfield_005f11(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("</div>   \r\n");
        out.write("                            <div style=\"margin-left:-155px\" class=\"wrapper\">\r\n");
        out.write("                            ");
        if (_jspx_meth_s_005flabel_005f11(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                            ");
        if (_jspx_meth_s_005ftextfield_005f12(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("</div>\r\n");
        out.write("                            <div style=\"margin-left:-255px\" class=\"wrapper\">\r\n");
        out.write("                            ");
        if (_jspx_meth_s_005flabel_005f12(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                            ");
        if (_jspx_meth_s_005ftextfield_005f13(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("</div>\r\n");
        out.write("                            <div style=\"margin-left:-205px\" class=\"wrapper\">\r\n");
        out.write("                            ");
        if (_jspx_meth_s_005flabel_005f13(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                            ");
        if (_jspx_meth_s_005ftextfield_005f14(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("</div>\r\n");
        out.write("                            <div style=\"margin-left:-200px\" class=\"wrapper\">\r\n");
        out.write("                            ");
        if (_jspx_meth_s_005flabel_005f14(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                            ");
        if (_jspx_meth_s_005ftextarea_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("<br></div>              \r\n");
        out.write("\t\t\t\t\t\t\t<div style=\"margin-left:-155px\" class=\"wrapper\">\r\n");
        out.write("                            \r\n");
        out.write("                  \r\n");
        out.write("                      </div></br>\r\n");
        out.write("                     <!-------------------DATOS DE REMITENTE NATURAL---------------->\r\n");
        out.write("                     <div style=\"float:left;font-size:15px;font-weight:800;margin-bottom:10px;color:#439DEB;text-decoration:underline;\">Datos de Documento de Pago</div>\r\n");
        out.write("                     <div style=\"margin-left:-85px;float:left;\" class=\"wrapper\"> \r\n");
        out.write("                     \t\t\t\t");
        if (_jspx_meth_s_005flabel_005f15(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write(" \r\n");
        out.write("                            \t\t");
        if (_jspx_meth_s_005fselect_005f2(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                     </div>\r\n");
        out.write("                     <div style=\"margin-left:-80px\" class=\"wrapper\">\r\n");
        out.write("                     ");
        if (_jspx_meth_s_005flabel_005f16(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                     ");
        if (_jspx_meth_s_005ftextfield_005f15(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("</div>\r\n");
        out.write("                    \r\n");
        out.write("                         <!-------------------DATOS DE DESTINATARIO---------------->\r\n");
        out.write("                     \t<div style=\"float:left;font-size:15px;font-weight:800;margin-top:30px;margin-bottom:10px;color:#439DEB;text-decoration:underline;\">Datos de Destinatario</div>\t\r\n");
        out.write("                     \t\t<div style=\"margin-left:5px; margin-top:70px;\">\r\n");
        out.write("                        \t");
        if (_jspx_meth_s_005flabel_005f17(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                        \t");
        if (_jspx_meth_s_005ftextfield_005f16(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("</div>\r\n");
        out.write("\t\t\t\t\t\t\t<div>\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005flabel_005f18(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f17(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("</div>\t\r\n");
        out.write("                            <div style=\"margin-left:13px\" class=\"wrapper\">\r\n");
        out.write("                            ");
        if (_jspx_meth_s_005flabel_005f19(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                            ");
        if (_jspx_meth_s_005ftextfield_005f18(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("</div>\r\n");
        out.write("                      </br>\r\n");
        out.write("                        <!--------------------------------------------------------->\r\n");
        out.write("                    <div style=\"margin-left:100px; width:650px;\">  \r\n");
        out.write("                        <div style=\"float:left;margin-left:90px;\" class=\"button\">");
        if (_jspx_meth_s_005fsubmit_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("</div>\r\n");
        out.write("                        <div style=\"float:left;margin-left:90px;\">");
        if (_jspx_meth_s_005fproperty_005f1(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("</div>\r\n");
        out.write("                    </div>\r\n");
        out.write("\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fform_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fform_0026_005ftheme_005fid_005faction.reuse(_jspx_th_s_005fform_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fform_0026_005ftheme_005fid_005faction.reuse(_jspx_th_s_005fform_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f0 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005flabel_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /despacho/counter_RegistrarEncomienda.jsp(38,49) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f0.setName("clientes.nrodoc");
    // /despacho/counter_RegistrarEncomienda.jsp(38,49) name = label type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f0.setLabel("Nro de Documento");
    int _jspx_eval_s_005ftextfield_005f0 = _jspx_th_s_005ftextfield_005f0.doStartTag();
    if (_jspx_th_s_005ftextfield_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005flabel_005fnobody.reuse(_jspx_th_s_005ftextfield_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005flabel_005fnobody.reuse(_jspx_th_s_005ftextfield_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f1 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005flabel_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /despacho/counter_RegistrarEncomienda.jsp(40,49) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f1.setName("clientes.nombre");
    // /despacho/counter_RegistrarEncomienda.jsp(40,49) name = label type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f1.setLabel("nombre");
    int _jspx_eval_s_005ftextfield_005f1 = _jspx_th_s_005ftextfield_005f1.doStartTag();
    if (_jspx_th_s_005ftextfield_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005flabel_005fnobody.reuse(_jspx_th_s_005ftextfield_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005flabel_005fnobody.reuse(_jspx_th_s_005ftextfield_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005furl_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_005furl_005f1 = (org.apache.struts2.views.jsp.URLTag) _005fjspx_005ftagPool_005fs_005furl_0026_005fnamespace_005faction_005fnobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_005furl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005furl_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /despacho/counter_RegistrarEncomienda.jsp(41,81) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005furl_005f1.setAction("buscarCliente");
    // /despacho/counter_RegistrarEncomienda.jsp(41,81) name = namespace type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005furl_005f1.setNamespace("/despacho");
    int _jspx_eval_s_005furl_005f1 = _jspx_th_s_005furl_005f1.doStartTag();
    if (_jspx_th_s_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005furl_0026_005fnamespace_005faction_005fnobody.reuse(_jspx_th_s_005furl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005furl_0026_005fnamespace_005faction_005fnobody.reuse(_jspx_th_s_005furl_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f0 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /despacho/counter_RegistrarEncomienda.jsp(42,7) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f0.setValue("mensaje");
    int _jspx_eval_s_005fproperty_005f0 = _jspx_th_s_005fproperty_005f0.doStartTag();
    if (_jspx_th_s_005fproperty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f2 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fhidden_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /despacho/counter_RegistrarEncomienda.jsp(50,25) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f2.setName("encomienda.codRemi");
    // /despacho/counter_RegistrarEncomienda.jsp(50,25) null
    _jspx_th_s_005ftextfield_005f2.setDynamicAttribute(null, "hidden", new String("true"));
    // /despacho/counter_RegistrarEncomienda.jsp(50,25) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f2.setValue("%{codRemi}");
    int _jspx_eval_s_005ftextfield_005f2 = _jspx_th_s_005ftextfield_005f2.doStartTag();
    if (_jspx_th_s_005ftextfield_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fhidden_005fnobody.reuse(_jspx_th_s_005ftextfield_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005fname_005fhidden_005fnobody.reuse(_jspx_th_s_005ftextfield_005f2);
    return false;
  }

  private boolean _jspx_meth_s_005flabel_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:label
    org.apache.struts2.views.jsp.ui.LabelTag _jspx_th_s_005flabel_005f0 = (org.apache.struts2.views.jsp.ui.LabelTag) _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.ui.LabelTag.class);
    _jspx_th_s_005flabel_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005flabel_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /despacho/counter_RegistrarEncomienda.jsp(51,25) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005flabel_005f0.setValue("%{getText('counter_RegistrarEncomienda.encomienda.destino')}");
    int _jspx_eval_s_005flabel_005f0 = _jspx_th_s_005flabel_005f0.doStartTag();
    if (_jspx_th_s_005flabel_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005flabel_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005flabel_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fselect_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:select
    org.apache.struts2.views.jsp.ui.SelectTag _jspx_th_s_005fselect_005f0 = (org.apache.struts2.views.jsp.ui.SelectTag) _005fjspx_005ftagPool_005fs_005fselect_0026_005fstyle_005fname_005flist_005fheaderValue_005fheaderKey_005fnobody.get(org.apache.struts2.views.jsp.ui.SelectTag.class);
    _jspx_th_s_005fselect_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fselect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /despacho/counter_RegistrarEncomienda.jsp(52,30) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setName("encomienda.destino");
    // /despacho/counter_RegistrarEncomienda.jsp(52,30) null
    _jspx_th_s_005fselect_005f0.setDynamicAttribute(null, "style", new String("margin-left:90px;"));
    // /despacho/counter_RegistrarEncomienda.jsp(52,30) name = headerKey type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setHeaderKey("1");
    // /despacho/counter_RegistrarEncomienda.jsp(52,30) name = headerValue type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setHeaderValue("(Seleccione)");
    // /despacho/counter_RegistrarEncomienda.jsp(52,30) name = list type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f0.setList("#{'Lima':'Lima','Piura':'Piura'}");
    int _jspx_eval_s_005fselect_005f0 = _jspx_th_s_005fselect_005f0.doStartTag();
    if (_jspx_th_s_005fselect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fselect_0026_005fstyle_005fname_005flist_005fheaderValue_005fheaderKey_005fnobody.reuse(_jspx_th_s_005fselect_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fselect_0026_005fstyle_005fname_005flist_005fheaderValue_005fheaderKey_005fnobody.reuse(_jspx_th_s_005fselect_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005flabel_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:label
    org.apache.struts2.views.jsp.ui.LabelTag _jspx_th_s_005flabel_005f1 = (org.apache.struts2.views.jsp.ui.LabelTag) _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.ui.LabelTag.class);
    _jspx_th_s_005flabel_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005flabel_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /despacho/counter_RegistrarEncomienda.jsp(57,28) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005flabel_005f1.setValue("%{getText('counter_RegistrarEncomienda.encomienda.tiempoAprox')}");
    int _jspx_eval_s_005flabel_005f1 = _jspx_th_s_005flabel_005f1.doStartTag();
    if (_jspx_th_s_005flabel_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005flabel_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005flabel_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f3 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f3.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /despacho/counter_RegistrarEncomienda.jsp(58,28) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f3.setName("encomienda.tiempoAprox");
    int _jspx_eval_s_005ftextfield_005f3 = _jspx_th_s_005ftextfield_005f3.doStartTag();
    if (_jspx_th_s_005ftextfield_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftextfield_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftextfield_005f3);
    return false;
  }

  private boolean _jspx_meth_s_005flabel_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:label
    org.apache.struts2.views.jsp.ui.LabelTag _jspx_th_s_005flabel_005f2 = (org.apache.struts2.views.jsp.ui.LabelTag) _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.ui.LabelTag.class);
    _jspx_th_s_005flabel_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005flabel_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /despacho/counter_RegistrarEncomienda.jsp(60,28) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005flabel_005f2.setValue("%{getText('counter_RegistrarEncomienda.encomienda.peso')}");
    int _jspx_eval_s_005flabel_005f2 = _jspx_th_s_005flabel_005f2.doStartTag();
    if (_jspx_th_s_005flabel_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005flabel_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005flabel_005f2);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f4 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f4.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /despacho/counter_RegistrarEncomienda.jsp(61,28) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f4.setName("encomienda.peso");
    int _jspx_eval_s_005ftextfield_005f4 = _jspx_th_s_005ftextfield_005f4.doStartTag();
    if (_jspx_th_s_005ftextfield_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftextfield_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftextfield_005f4);
    return false;
  }

  private boolean _jspx_meth_s_005flabel_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:label
    org.apache.struts2.views.jsp.ui.LabelTag _jspx_th_s_005flabel_005f3 = (org.apache.struts2.views.jsp.ui.LabelTag) _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.ui.LabelTag.class);
    _jspx_th_s_005flabel_005f3.setPageContext(_jspx_page_context);
    _jspx_th_s_005flabel_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /despacho/counter_RegistrarEncomienda.jsp(63,28) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005flabel_005f3.setValue("%{getText('counter_RegistrarEncomienda.encomienda.tarifaXdest')}");
    int _jspx_eval_s_005flabel_005f3 = _jspx_th_s_005flabel_005f3.doStartTag();
    if (_jspx_th_s_005flabel_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005flabel_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005flabel_005f3);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f5 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005flabel_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f5.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /despacho/counter_RegistrarEncomienda.jsp(64,28) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f5.setName("encomienda.tarifaXdest");
    // /despacho/counter_RegistrarEncomienda.jsp(64,28) name = label type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f5.setLabel("%{getText('counter_RegistrarEncomienda.encomienda.tarifaXdest')}");
    int _jspx_eval_s_005ftextfield_005f5 = _jspx_th_s_005ftextfield_005f5.doStartTag();
    if (_jspx_th_s_005ftextfield_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005flabel_005fnobody.reuse(_jspx_th_s_005ftextfield_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005flabel_005fnobody.reuse(_jspx_th_s_005ftextfield_005f5);
    return false;
  }

  private boolean _jspx_meth_s_005flabel_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:label
    org.apache.struts2.views.jsp.ui.LabelTag _jspx_th_s_005flabel_005f4 = (org.apache.struts2.views.jsp.ui.LabelTag) _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.ui.LabelTag.class);
    _jspx_th_s_005flabel_005f4.setPageContext(_jspx_page_context);
    _jspx_th_s_005flabel_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /despacho/counter_RegistrarEncomienda.jsp(66,28) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005flabel_005f4.setValue("%{getText('counter_RegistrarEncomienda.encomienda.ancho')}");
    int _jspx_eval_s_005flabel_005f4 = _jspx_th_s_005flabel_005f4.doStartTag();
    if (_jspx_th_s_005flabel_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005flabel_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005flabel_005f4);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f6 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f6.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /despacho/counter_RegistrarEncomienda.jsp(67,28) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f6.setName("encomienda.ancho");
    int _jspx_eval_s_005ftextfield_005f6 = _jspx_th_s_005ftextfield_005f6.doStartTag();
    if (_jspx_th_s_005ftextfield_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftextfield_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftextfield_005f6);
    return false;
  }

  private boolean _jspx_meth_s_005flabel_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:label
    org.apache.struts2.views.jsp.ui.LabelTag _jspx_th_s_005flabel_005f5 = (org.apache.struts2.views.jsp.ui.LabelTag) _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.ui.LabelTag.class);
    _jspx_th_s_005flabel_005f5.setPageContext(_jspx_page_context);
    _jspx_th_s_005flabel_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /despacho/counter_RegistrarEncomienda.jsp(68,28) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005flabel_005f5.setValue("%{getText('counter_RegistrarEncomienda.encomienda.alto')}");
    int _jspx_eval_s_005flabel_005f5 = _jspx_th_s_005flabel_005f5.doStartTag();
    if (_jspx_th_s_005flabel_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005flabel_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005flabel_005f5);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f7 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f7.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /despacho/counter_RegistrarEncomienda.jsp(69,28) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f7.setName("encomienda.alto");
    int _jspx_eval_s_005ftextfield_005f7 = _jspx_th_s_005ftextfield_005f7.doStartTag();
    if (_jspx_th_s_005ftextfield_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftextfield_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftextfield_005f7);
    return false;
  }

  private boolean _jspx_meth_s_005flabel_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:label
    org.apache.struts2.views.jsp.ui.LabelTag _jspx_th_s_005flabel_005f6 = (org.apache.struts2.views.jsp.ui.LabelTag) _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.ui.LabelTag.class);
    _jspx_th_s_005flabel_005f6.setPageContext(_jspx_page_context);
    _jspx_th_s_005flabel_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /despacho/counter_RegistrarEncomienda.jsp(70,28) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005flabel_005f6.setValue("%{getText('counter_RegistrarEncomienda.encomienda.largo')}");
    int _jspx_eval_s_005flabel_005f6 = _jspx_th_s_005flabel_005f6.doStartTag();
    if (_jspx_th_s_005flabel_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005flabel_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005flabel_005f6);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f8 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f8.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /despacho/counter_RegistrarEncomienda.jsp(71,28) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f8.setName("encomienda.largo");
    int _jspx_eval_s_005ftextfield_005f8 = _jspx_th_s_005ftextfield_005f8.doStartTag();
    if (_jspx_th_s_005ftextfield_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftextfield_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftextfield_005f8);
    return false;
  }

  private boolean _jspx_meth_s_005flabel_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:label
    org.apache.struts2.views.jsp.ui.LabelTag _jspx_th_s_005flabel_005f7 = (org.apache.struts2.views.jsp.ui.LabelTag) _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.ui.LabelTag.class);
    _jspx_th_s_005flabel_005f7.setPageContext(_jspx_page_context);
    _jspx_th_s_005flabel_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /despacho/counter_RegistrarEncomienda.jsp(73,28) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005flabel_005f7.setValue("%{getText('counter_RegistrarEncomienda.encomienda.volumen')}");
    int _jspx_eval_s_005flabel_005f7 = _jspx_th_s_005flabel_005f7.doStartTag();
    if (_jspx_th_s_005flabel_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005flabel_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005flabel_005f7);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f9 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f9.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /despacho/counter_RegistrarEncomienda.jsp(74,28) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f9.setName("encomienda.volumen");
    int _jspx_eval_s_005ftextfield_005f9 = _jspx_th_s_005ftextfield_005f9.doStartTag();
    if (_jspx_th_s_005ftextfield_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftextfield_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftextfield_005f9);
    return false;
  }

  private boolean _jspx_meth_s_005flabel_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:label
    org.apache.struts2.views.jsp.ui.LabelTag _jspx_th_s_005flabel_005f8 = (org.apache.struts2.views.jsp.ui.LabelTag) _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.ui.LabelTag.class);
    _jspx_th_s_005flabel_005f8.setPageContext(_jspx_page_context);
    _jspx_th_s_005flabel_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /despacho/counter_RegistrarEncomienda.jsp(76,28) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005flabel_005f8.setValue("%{getText('counter_RegistrarEncomienda.encomienda.tarifaXemb')}");
    int _jspx_eval_s_005flabel_005f8 = _jspx_th_s_005flabel_005f8.doStartTag();
    if (_jspx_th_s_005flabel_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005flabel_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005flabel_005f8);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f10 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f10.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /despacho/counter_RegistrarEncomienda.jsp(77,28) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f10.setName("encomienda.tarifaXemb");
    int _jspx_eval_s_005ftextfield_005f10 = _jspx_th_s_005ftextfield_005f10.doStartTag();
    if (_jspx_th_s_005ftextfield_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftextfield_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftextfield_005f10);
    return false;
  }

  private boolean _jspx_meth_s_005flabel_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:label
    org.apache.struts2.views.jsp.ui.LabelTag _jspx_th_s_005flabel_005f9 = (org.apache.struts2.views.jsp.ui.LabelTag) _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.ui.LabelTag.class);
    _jspx_th_s_005flabel_005f9.setPageContext(_jspx_page_context);
    _jspx_th_s_005flabel_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /despacho/counter_RegistrarEncomienda.jsp(79,30) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005flabel_005f9.setValue("%{getText('counter_RegistrarEncomienda.encomienda.tipo')}");
    int _jspx_eval_s_005flabel_005f9 = _jspx_th_s_005flabel_005f9.doStartTag();
    if (_jspx_th_s_005flabel_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005flabel_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005flabel_005f9);
    return false;
  }

  private boolean _jspx_meth_s_005fselect_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:select
    org.apache.struts2.views.jsp.ui.SelectTag _jspx_th_s_005fselect_005f1 = (org.apache.struts2.views.jsp.ui.SelectTag) _005fjspx_005ftagPool_005fs_005fselect_0026_005fstyle_005fname_005flist_005fheaderValue_005fheaderKey_005fnobody.get(org.apache.struts2.views.jsp.ui.SelectTag.class);
    _jspx_th_s_005fselect_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fselect_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /despacho/counter_RegistrarEncomienda.jsp(80,30) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f1.setName("encomienda.tipo");
    // /despacho/counter_RegistrarEncomienda.jsp(80,30) null
    _jspx_th_s_005fselect_005f1.setDynamicAttribute(null, "style", new String("margin-left:105px;"));
    // /despacho/counter_RegistrarEncomienda.jsp(80,30) name = headerKey type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f1.setHeaderKey("1");
    // /despacho/counter_RegistrarEncomienda.jsp(80,30) name = headerValue type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f1.setHeaderValue("(Seleccione)");
    // /despacho/counter_RegistrarEncomienda.jsp(80,30) name = list type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f1.setList("#{'Fragil':'Fragil','No Fragil':'No Fragil'}");
    int _jspx_eval_s_005fselect_005f1 = _jspx_th_s_005fselect_005f1.doStartTag();
    if (_jspx_th_s_005fselect_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fselect_0026_005fstyle_005fname_005flist_005fheaderValue_005fheaderKey_005fnobody.reuse(_jspx_th_s_005fselect_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fselect_0026_005fstyle_005fname_005flist_005fheaderValue_005fheaderKey_005fnobody.reuse(_jspx_th_s_005fselect_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005flabel_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:label
    org.apache.struts2.views.jsp.ui.LabelTag _jspx_th_s_005flabel_005f10 = (org.apache.struts2.views.jsp.ui.LabelTag) _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.ui.LabelTag.class);
    _jspx_th_s_005flabel_005f10.setPageContext(_jspx_page_context);
    _jspx_th_s_005flabel_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /despacho/counter_RegistrarEncomienda.jsp(85,28) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005flabel_005f10.setValue("%{getText('counter_RegistrarEncomienda.encomienda.tarifaXtipo')}");
    int _jspx_eval_s_005flabel_005f10 = _jspx_th_s_005flabel_005f10.doStartTag();
    if (_jspx_th_s_005flabel_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005flabel_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005flabel_005f10);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f11 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f11.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /despacho/counter_RegistrarEncomienda.jsp(86,28) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f11.setName("encomienda.tarifaXtipo");
    int _jspx_eval_s_005ftextfield_005f11 = _jspx_th_s_005ftextfield_005f11.doStartTag();
    if (_jspx_th_s_005ftextfield_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftextfield_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftextfield_005f11);
    return false;
  }

  private boolean _jspx_meth_s_005flabel_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:label
    org.apache.struts2.views.jsp.ui.LabelTag _jspx_th_s_005flabel_005f11 = (org.apache.struts2.views.jsp.ui.LabelTag) _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.ui.LabelTag.class);
    _jspx_th_s_005flabel_005f11.setPageContext(_jspx_page_context);
    _jspx_th_s_005flabel_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /despacho/counter_RegistrarEncomienda.jsp(88,28) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005flabel_005f11.setValue("%{getText('counter_RegistrarEncomienda.encomienda.costo')}");
    int _jspx_eval_s_005flabel_005f11 = _jspx_th_s_005flabel_005f11.doStartTag();
    if (_jspx_th_s_005flabel_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005flabel_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005flabel_005f11);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f12 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f12.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /despacho/counter_RegistrarEncomienda.jsp(89,28) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f12.setName("encomienda.costo");
    int _jspx_eval_s_005ftextfield_005f12 = _jspx_th_s_005ftextfield_005f12.doStartTag();
    if (_jspx_th_s_005ftextfield_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftextfield_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftextfield_005f12);
    return false;
  }

  private boolean _jspx_meth_s_005flabel_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:label
    org.apache.struts2.views.jsp.ui.LabelTag _jspx_th_s_005flabel_005f12 = (org.apache.struts2.views.jsp.ui.LabelTag) _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.ui.LabelTag.class);
    _jspx_th_s_005flabel_005f12.setPageContext(_jspx_page_context);
    _jspx_th_s_005flabel_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /despacho/counter_RegistrarEncomienda.jsp(91,28) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005flabel_005f12.setValue("%{getText('counter_RegistrarEncomienda.encomienda.estado')}");
    int _jspx_eval_s_005flabel_005f12 = _jspx_th_s_005flabel_005f12.doStartTag();
    if (_jspx_th_s_005flabel_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005flabel_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005flabel_005f12);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f13 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f13.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /despacho/counter_RegistrarEncomienda.jsp(92,28) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f13.setName("encomienda.estado");
    // /despacho/counter_RegistrarEncomienda.jsp(92,28) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f13.setValue("Recepcionada");
    // /despacho/counter_RegistrarEncomienda.jsp(92,28) name = readonly type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f13.setReadonly("true");
    int _jspx_eval_s_005ftextfield_005f13 = _jspx_th_s_005ftextfield_005f13.doStartTag();
    if (_jspx_th_s_005ftextfield_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fnobody.reuse(_jspx_th_s_005ftextfield_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fvalue_005freadonly_005fname_005fnobody.reuse(_jspx_th_s_005ftextfield_005f13);
    return false;
  }

  private boolean _jspx_meth_s_005flabel_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:label
    org.apache.struts2.views.jsp.ui.LabelTag _jspx_th_s_005flabel_005f13 = (org.apache.struts2.views.jsp.ui.LabelTag) _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.ui.LabelTag.class);
    _jspx_th_s_005flabel_005f13.setPageContext(_jspx_page_context);
    _jspx_th_s_005flabel_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /despacho/counter_RegistrarEncomienda.jsp(94,28) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005flabel_005f13.setValue("%{getText('counter_RegistrarEncomienda.encomienda.claveEnvio')}");
    int _jspx_eval_s_005flabel_005f13 = _jspx_th_s_005flabel_005f13.doStartTag();
    if (_jspx_th_s_005flabel_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005flabel_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005flabel_005f13);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f14(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f14 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005ftype_005fname_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f14.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /despacho/counter_RegistrarEncomienda.jsp(95,28) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f14.setName("encomienda.claveEnvio");
    // /despacho/counter_RegistrarEncomienda.jsp(95,28) null
    _jspx_th_s_005ftextfield_005f14.setDynamicAttribute(null, "type", new String("password"));
    int _jspx_eval_s_005ftextfield_005f14 = _jspx_th_s_005ftextfield_005f14.doStartTag();
    if (_jspx_th_s_005ftextfield_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005ftype_005fname_005fnobody.reuse(_jspx_th_s_005ftextfield_005f14);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005ftype_005fname_005fnobody.reuse(_jspx_th_s_005ftextfield_005f14);
    return false;
  }

  private boolean _jspx_meth_s_005flabel_005f14(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:label
    org.apache.struts2.views.jsp.ui.LabelTag _jspx_th_s_005flabel_005f14 = (org.apache.struts2.views.jsp.ui.LabelTag) _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.ui.LabelTag.class);
    _jspx_th_s_005flabel_005f14.setPageContext(_jspx_page_context);
    _jspx_th_s_005flabel_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /despacho/counter_RegistrarEncomienda.jsp(97,28) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005flabel_005f14.setValue("%{getText('counter_RegistrarEncomienda.encomienda.detalle')}");
    int _jspx_eval_s_005flabel_005f14 = _jspx_th_s_005flabel_005f14.doStartTag();
    if (_jspx_th_s_005flabel_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005flabel_005f14);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005flabel_005f14);
    return false;
  }

  private boolean _jspx_meth_s_005ftextarea_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textarea
    org.apache.struts2.views.jsp.ui.TextareaTag _jspx_th_s_005ftextarea_005f0 = (org.apache.struts2.views.jsp.ui.TextareaTag) _005fjspx_005ftagPool_005fs_005ftextarea_0026_005fstyle_005frows_005fname_005fcols_005fnobody.get(org.apache.struts2.views.jsp.ui.TextareaTag.class);
    _jspx_th_s_005ftextarea_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextarea_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /despacho/counter_RegistrarEncomienda.jsp(98,28) null
    _jspx_th_s_005ftextarea_005f0.setDynamicAttribute(null, "style", new String("margin-left:60px; width:300px; height:50px"));
    // /despacho/counter_RegistrarEncomienda.jsp(98,28) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextarea_005f0.setName("encomienda.detalle");
    // /despacho/counter_RegistrarEncomienda.jsp(98,28) name = cols type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextarea_005f0.setCols("1");
    // /despacho/counter_RegistrarEncomienda.jsp(98,28) name = rows type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextarea_005f0.setRows("1");
    int _jspx_eval_s_005ftextarea_005f0 = _jspx_th_s_005ftextarea_005f0.doStartTag();
    if (_jspx_th_s_005ftextarea_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextarea_0026_005fstyle_005frows_005fname_005fcols_005fnobody.reuse(_jspx_th_s_005ftextarea_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextarea_0026_005fstyle_005frows_005fname_005fcols_005fnobody.reuse(_jspx_th_s_005ftextarea_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005flabel_005f15(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:label
    org.apache.struts2.views.jsp.ui.LabelTag _jspx_th_s_005flabel_005f15 = (org.apache.struts2.views.jsp.ui.LabelTag) _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fname_005fnobody.get(org.apache.struts2.views.jsp.ui.LabelTag.class);
    _jspx_th_s_005flabel_005f15.setPageContext(_jspx_page_context);
    _jspx_th_s_005flabel_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /despacho/counter_RegistrarEncomienda.jsp(106,25) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005flabel_005f15.setName("pago.tipo");
    // /despacho/counter_RegistrarEncomienda.jsp(106,25) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005flabel_005f15.setValue("%{getText('counter_RegistrarEncomienda.pago.tipo')}");
    int _jspx_eval_s_005flabel_005f15 = _jspx_th_s_005flabel_005f15.doStartTag();
    if (_jspx_th_s_005flabel_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_s_005flabel_005f15);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_s_005flabel_005f15);
    return false;
  }

  private boolean _jspx_meth_s_005fselect_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:select
    org.apache.struts2.views.jsp.ui.SelectTag _jspx_th_s_005fselect_005f2 = (org.apache.struts2.views.jsp.ui.SelectTag) _005fjspx_005ftagPool_005fs_005fselect_0026_005fstyle_005fname_005flist_005fheaderValue_005fheaderKey_005fnobody.get(org.apache.struts2.views.jsp.ui.SelectTag.class);
    _jspx_th_s_005fselect_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005fselect_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /despacho/counter_RegistrarEncomienda.jsp(107,30) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f2.setName("pago.tipo");
    // /despacho/counter_RegistrarEncomienda.jsp(107,30) null
    _jspx_th_s_005fselect_005f2.setDynamicAttribute(null, "style", new String("margin-left:70px;"));
    // /despacho/counter_RegistrarEncomienda.jsp(107,30) name = headerKey type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f2.setHeaderKey("1");
    // /despacho/counter_RegistrarEncomienda.jsp(107,30) name = headerValue type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f2.setHeaderValue("(Seleccione)");
    // /despacho/counter_RegistrarEncomienda.jsp(107,30) name = list type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fselect_005f2.setList("#{'Boleta':'Boleta','Factura':'Factura'}");
    int _jspx_eval_s_005fselect_005f2 = _jspx_th_s_005fselect_005f2.doStartTag();
    if (_jspx_th_s_005fselect_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fselect_0026_005fstyle_005fname_005flist_005fheaderValue_005fheaderKey_005fnobody.reuse(_jspx_th_s_005fselect_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fselect_0026_005fstyle_005fname_005flist_005fheaderValue_005fheaderKey_005fnobody.reuse(_jspx_th_s_005fselect_005f2);
    return false;
  }

  private boolean _jspx_meth_s_005flabel_005f16(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:label
    org.apache.struts2.views.jsp.ui.LabelTag _jspx_th_s_005flabel_005f16 = (org.apache.struts2.views.jsp.ui.LabelTag) _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fname_005fnobody.get(org.apache.struts2.views.jsp.ui.LabelTag.class);
    _jspx_th_s_005flabel_005f16.setPageContext(_jspx_page_context);
    _jspx_th_s_005flabel_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /despacho/counter_RegistrarEncomienda.jsp(112,21) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005flabel_005f16.setName("pago.total");
    // /despacho/counter_RegistrarEncomienda.jsp(112,21) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005flabel_005f16.setValue("%{getText('counter_RegistrarEncomienda.pago.total')}");
    int _jspx_eval_s_005flabel_005f16 = _jspx_th_s_005flabel_005f16.doStartTag();
    if (_jspx_th_s_005flabel_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_s_005flabel_005f16);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_s_005flabel_005f16);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f15(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f15 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f15.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /despacho/counter_RegistrarEncomienda.jsp(113,21) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f15.setName("pago.total");
    int _jspx_eval_s_005ftextfield_005f15 = _jspx_th_s_005ftextfield_005f15.doStartTag();
    if (_jspx_th_s_005ftextfield_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftextfield_005f15);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftextfield_005f15);
    return false;
  }

  private boolean _jspx_meth_s_005flabel_005f17(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:label
    org.apache.struts2.views.jsp.ui.LabelTag _jspx_th_s_005flabel_005f17 = (org.apache.struts2.views.jsp.ui.LabelTag) _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fname_005fnobody.get(org.apache.struts2.views.jsp.ui.LabelTag.class);
    _jspx_th_s_005flabel_005f17.setPageContext(_jspx_page_context);
    _jspx_th_s_005flabel_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /despacho/counter_RegistrarEncomienda.jsp(118,25) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005flabel_005f17.setName("destinatario.nombre");
    // /despacho/counter_RegistrarEncomienda.jsp(118,25) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005flabel_005f17.setValue("%{getText('counter_RegistrarEncomienda.destinatario.nombre')}");
    int _jspx_eval_s_005flabel_005f17 = _jspx_th_s_005flabel_005f17.doStartTag();
    if (_jspx_th_s_005flabel_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_s_005flabel_005f17);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_s_005flabel_005f17);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f16(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f16 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f16.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /despacho/counter_RegistrarEncomienda.jsp(119,25) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f16.setName("destinatario.nombre");
    int _jspx_eval_s_005ftextfield_005f16 = _jspx_th_s_005ftextfield_005f16.doStartTag();
    if (_jspx_th_s_005ftextfield_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftextfield_005f16);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftextfield_005f16);
    return false;
  }

  private boolean _jspx_meth_s_005flabel_005f18(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:label
    org.apache.struts2.views.jsp.ui.LabelTag _jspx_th_s_005flabel_005f18 = (org.apache.struts2.views.jsp.ui.LabelTag) _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fname_005fnobody.get(org.apache.struts2.views.jsp.ui.LabelTag.class);
    _jspx_th_s_005flabel_005f18.setPageContext(_jspx_page_context);
    _jspx_th_s_005flabel_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /despacho/counter_RegistrarEncomienda.jsp(121,7) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005flabel_005f18.setName("destinatario.apellido");
    // /despacho/counter_RegistrarEncomienda.jsp(121,7) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005flabel_005f18.setValue("%{getText('counter_RegistrarEncomienda.destinatario.apellido')}");
    int _jspx_eval_s_005flabel_005f18 = _jspx_th_s_005flabel_005f18.doStartTag();
    if (_jspx_th_s_005flabel_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_s_005flabel_005f18);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_s_005flabel_005f18);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f17(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f17 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f17.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /despacho/counter_RegistrarEncomienda.jsp(122,7) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f17.setName("destinatario.apellido");
    int _jspx_eval_s_005ftextfield_005f17 = _jspx_th_s_005ftextfield_005f17.doStartTag();
    if (_jspx_th_s_005ftextfield_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftextfield_005f17);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftextfield_005f17);
    return false;
  }

  private boolean _jspx_meth_s_005flabel_005f19(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:label
    org.apache.struts2.views.jsp.ui.LabelTag _jspx_th_s_005flabel_005f19 = (org.apache.struts2.views.jsp.ui.LabelTag) _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fname_005fnobody.get(org.apache.struts2.views.jsp.ui.LabelTag.class);
    _jspx_th_s_005flabel_005f19.setPageContext(_jspx_page_context);
    _jspx_th_s_005flabel_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /despacho/counter_RegistrarEncomienda.jsp(124,28) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005flabel_005f19.setName("destinatario.dni");
    // /despacho/counter_RegistrarEncomienda.jsp(124,28) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005flabel_005f19.setValue("%{getText('counter_RegistrarEncomienda.destinatario.dni')}");
    int _jspx_eval_s_005flabel_005f19 = _jspx_th_s_005flabel_005f19.doStartTag();
    if (_jspx_th_s_005flabel_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_s_005flabel_005f19);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005flabel_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_s_005flabel_005f19);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f18(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f18 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f18.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /despacho/counter_RegistrarEncomienda.jsp(125,28) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f18.setName("destinatario.dni");
    int _jspx_eval_s_005ftextfield_005f18 = _jspx_th_s_005ftextfield_005f18.doStartTag();
    if (_jspx_th_s_005ftextfield_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftextfield_005f18);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftextfield_005f18);
    return false;
  }

  private boolean _jspx_meth_s_005fsubmit_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:submit
    org.apache.struts2.views.jsp.ui.SubmitTag _jspx_th_s_005fsubmit_005f0 = (org.apache.struts2.views.jsp.ui.SubmitTag) _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.ui.SubmitTag.class);
    _jspx_th_s_005fsubmit_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fsubmit_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /despacho/counter_RegistrarEncomienda.jsp(129,81) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fsubmit_005f0.setValue("%{getText('counter_RegistrarEncomienda.btnGuardar')}");
    int _jspx_eval_s_005fsubmit_005f0 = _jspx_th_s_005fsubmit_005f0.doStartTag();
    if (_jspx_th_s_005fsubmit_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fsubmit_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fsubmit_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f1 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /despacho/counter_RegistrarEncomienda.jsp(130,66) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f1.setValue("mensaje");
    int _jspx_eval_s_005fproperty_005f1 = _jspx_th_s_005fproperty_005f1.doStartTag();
    if (_jspx_th_s_005fproperty_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f1);
    return false;
  }
}
