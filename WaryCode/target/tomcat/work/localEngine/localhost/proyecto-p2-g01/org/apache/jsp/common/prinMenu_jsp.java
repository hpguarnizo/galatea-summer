package org.apache.jsp.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class prinMenu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fst_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fst_005furl_0026_005fnamespace_005faction_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fst_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fst_005furl_0026_005fnamespace_005faction_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fst_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fst_005furl_0026_005fnamespace_005faction_005fnobody.release();
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
      out.write("\r\n");
      out.write("<div align=\"left\" style=\"margin-left:50px;\">\r\n");
      out.write("<article>\r\n");
      out.write("\t<div style=\"width:200px;\">\r\n");
      out.write("\t\t\t<li style=\"width: 200px;\">\r\n");
      out.write("\t\t\t\t<ul class=\"tabs3\">\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_st_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t    ");
      if (_jspx_meth_st_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_st_005fif_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                ");
      if (_jspx_meth_st_005fif_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("            </li>\r\n");
      out.write("\t</div> \t\t\t\r\n");
      out.write("</article>\r\n");
      out.write("            \r\n");
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

  private boolean _jspx_meth_st_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  st:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_st_005fif_005f0 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fst_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_st_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_st_005fif_005f0.setParent(null);
    // /common/prinMenu.jsp(24,4) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_st_005fif_005f0.setTest("#session.user.tipo == 1");
    int _jspx_eval_st_005fif_005f0 = _jspx_th_st_005fif_005f0.doStartTag();
    if (_jspx_eval_st_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_st_005fif_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_st_005fif_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_st_005fif_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t<li><a href=\"");
        if (_jspx_meth_st_005furl_005f0(_jspx_th_st_005fif_005f0, _jspx_page_context))
          return true;
        out.write("\">Counter</a></li>\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_st_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_st_005fif_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_st_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fst_005fif_0026_005ftest.reuse(_jspx_th_st_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fst_005fif_0026_005ftest.reuse(_jspx_th_st_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_st_005furl_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_st_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  st:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_st_005furl_005f0 = (org.apache.struts2.views.jsp.URLTag) _005fjspx_005ftagPool_005fst_005furl_0026_005fnamespace_005faction_005fnobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_st_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_st_005furl_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_st_005fif_005f0);
    // /common/prinMenu.jsp(25,17) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_st_005furl_005f0.setAction("opcionCounter");
    // /common/prinMenu.jsp(25,17) name = namespace type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_st_005furl_005f0.setNamespace("/despacho");
    int _jspx_eval_st_005furl_005f0 = _jspx_th_st_005furl_005f0.doStartTag();
    if (_jspx_th_st_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fst_005furl_0026_005fnamespace_005faction_005fnobody.reuse(_jspx_th_st_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fst_005furl_0026_005fnamespace_005faction_005fnobody.reuse(_jspx_th_st_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_st_005fif_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  st:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_st_005fif_005f1 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fst_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_st_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_st_005fif_005f1.setParent(null);
    // /common/prinMenu.jsp(27,7) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_st_005fif_005f1.setTest("#session.user.tipo == 2");
    int _jspx_eval_st_005fif_005f1 = _jspx_th_st_005fif_005f1.doStartTag();
    if (_jspx_eval_st_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_st_005fif_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_st_005fif_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_st_005fif_005f1.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t<li><a href=\"");
        if (_jspx_meth_st_005furl_005f1(_jspx_th_st_005fif_005f1, _jspx_page_context))
          return true;
        out.write("\">Despachador</a></li>\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_st_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_st_005fif_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_st_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fst_005fif_0026_005ftest.reuse(_jspx_th_st_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fst_005fif_0026_005ftest.reuse(_jspx_th_st_005fif_005f1);
    return false;
  }

  private boolean _jspx_meth_st_005furl_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_st_005fif_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  st:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_st_005furl_005f1 = (org.apache.struts2.views.jsp.URLTag) _005fjspx_005ftagPool_005fst_005furl_0026_005fnamespace_005faction_005fnobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_st_005furl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_st_005furl_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_st_005fif_005f1);
    // /common/prinMenu.jsp(28,17) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_st_005furl_005f1.setAction("opcionDespachador");
    // /common/prinMenu.jsp(28,17) name = namespace type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_st_005furl_005f1.setNamespace("/despacho");
    int _jspx_eval_st_005furl_005f1 = _jspx_th_st_005furl_005f1.doStartTag();
    if (_jspx_th_st_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fst_005furl_0026_005fnamespace_005faction_005fnobody.reuse(_jspx_th_st_005furl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fst_005furl_0026_005fnamespace_005faction_005fnobody.reuse(_jspx_th_st_005furl_005f1);
    return false;
  }

  private boolean _jspx_meth_st_005fif_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  st:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_st_005fif_005f2 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fst_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_st_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_st_005fif_005f2.setParent(null);
    // /common/prinMenu.jsp(30,4) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_st_005fif_005f2.setTest("#session.user.tipo == 3");
    int _jspx_eval_st_005fif_005f2 = _jspx_th_st_005fif_005f2.doStartTag();
    if (_jspx_eval_st_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_st_005fif_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_st_005fif_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_st_005fif_005f2.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                <li><a href=\"");
        if (_jspx_meth_st_005furl_005f2(_jspx_th_st_005fif_005f2, _jspx_page_context))
          return true;
        out.write("\">Almacenero</a></li>\r\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_st_005fif_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_st_005fif_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_st_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fst_005fif_0026_005ftest.reuse(_jspx_th_st_005fif_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fst_005fif_0026_005ftest.reuse(_jspx_th_st_005fif_005f2);
    return false;
  }

  private boolean _jspx_meth_st_005furl_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_st_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  st:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_st_005furl_005f2 = (org.apache.struts2.views.jsp.URLTag) _005fjspx_005ftagPool_005fst_005furl_0026_005fnamespace_005faction_005fnobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_st_005furl_005f2.setPageContext(_jspx_page_context);
    _jspx_th_st_005furl_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_st_005fif_005f2);
    // /common/prinMenu.jsp(31,29) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_st_005furl_005f2.setAction("opcionAlmacenero");
    // /common/prinMenu.jsp(31,29) name = namespace type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_st_005furl_005f2.setNamespace("/despacho");
    int _jspx_eval_st_005furl_005f2 = _jspx_th_st_005furl_005f2.doStartTag();
    if (_jspx_th_st_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fst_005furl_0026_005fnamespace_005faction_005fnobody.reuse(_jspx_th_st_005furl_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fst_005furl_0026_005fnamespace_005faction_005fnobody.reuse(_jspx_th_st_005furl_005f2);
    return false;
  }

  private boolean _jspx_meth_st_005fif_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  st:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_st_005fif_005f3 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fst_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_st_005fif_005f3.setPageContext(_jspx_page_context);
    _jspx_th_st_005fif_005f3.setParent(null);
    // /common/prinMenu.jsp(33,16) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_st_005fif_005f3.setTest("#session.user.tipo == 4");
    int _jspx_eval_st_005fif_005f3 = _jspx_th_st_005fif_005f3.doStartTag();
    if (_jspx_eval_st_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_st_005fif_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_st_005fif_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_st_005fif_005f3.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                <li><a href=\"");
        if (_jspx_meth_st_005furl_005f3(_jspx_th_st_005fif_005f3, _jspx_page_context))
          return true;
        out.write("\">Administrador</a></li>\r\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_st_005fif_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_st_005fif_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_st_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fst_005fif_0026_005ftest.reuse(_jspx_th_st_005fif_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fst_005fif_0026_005ftest.reuse(_jspx_th_st_005fif_005f3);
    return false;
  }

  private boolean _jspx_meth_st_005furl_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_st_005fif_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  st:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_st_005furl_005f3 = (org.apache.struts2.views.jsp.URLTag) _005fjspx_005ftagPool_005fst_005furl_0026_005fnamespace_005faction_005fnobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_st_005furl_005f3.setPageContext(_jspx_page_context);
    _jspx_th_st_005furl_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_st_005fif_005f3);
    // /common/prinMenu.jsp(34,29) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_st_005furl_005f3.setAction("opcionAdministrador");
    // /common/prinMenu.jsp(34,29) name = namespace type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_st_005furl_005f3.setNamespace("/despacho");
    int _jspx_eval_st_005furl_005f3 = _jspx_th_st_005furl_005f3.doStartTag();
    if (_jspx_th_st_005furl_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fst_005furl_0026_005fnamespace_005faction_005fnobody.reuse(_jspx_th_st_005furl_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fst_005furl_0026_005fnamespace_005faction_005fnobody.reuse(_jspx_th_st_005furl_005f3);
    return false;
  }
}
