package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class updateacc_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("--%>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("         <link href=\"css/stylecreate.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("          <link href=\"\thttps://cdn.jsdelivr.net/npm/bootstrap@5.0.0-alpha1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"updateacc\" method=\"post\">\n");
      out.write("       <div class=\"card\">\n");
      out.write("    <div class=\"text-center\">\n");
      out.write("        <h3>Update Your Account</h3> <span class=\"abt\"> <a href=\"home\">Return Home</a></span>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form mt-3\">\n");
      out.write("        <div class=\"inputbox\">Username <input  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${st.user}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"type=\"text\" class=\"form-control\"  name=\"user\"> </div>\n");
      out.write("        <div class=\"input-group inputbox\"> <input  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${st.userID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"type=\"text\" class=\"form-control\" name=\"id\"> <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${st.ad}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"number\"  class=\"form-control\" name=\"admin\"> </div>\n");
      out.write("        PassWord<div class=\"inputbox\"> <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${st.pass}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\" class=\"form-control\"  name=\"pass\"> </div>\n");
      out.write("        Name<div class=\"inputbox\"> <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${st.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\" class=\"form-control\"  name=\"name\"> </div>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("   \n");
      out.write("            <div class=\"text-right\"> <button>UPDATE ACCOUNT</button> </div>\n");
      out.write("            <p>after update you will return Login</p>\n");
      out.write("    <div class=\"mt-1\">\n");
      out.write("       \n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("            </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
