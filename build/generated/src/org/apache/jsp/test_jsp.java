package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class test_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      out.write("\n");
      out.write("\n");
      out.write("<link href=\"WEB-INF/../fantasycss.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    ");

        String[] ar1 = request.getParameterValues("ar1");
        String[] ar2 = request.getParameterValues("ar2");
        String[] ar3 = request.getParameterValues("ar3");
        String[] ar4 = request.getParameterValues("ar4");
        
     
    
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <table id=\"table\" style=\"width:600px\" align=\"center\" left=\"300\">\n");
      out.write("          <tr>\n");
      out.write("              <th>Franchise1</th>\n");
      out.write("              <th>Franchise2</th>\n");
      out.write("              <th>Franchise3</th>\n");
      out.write("              <th>Franchise4</th>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("              <td>Aaron finch</td>\n");
      out.write("              <td>Abhishek Nayar</td>\n");
      out.write("              <td>Abu Nechim</td>\n");
      out.write("              <td>Ab De Villiers</td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("              <td>Aditya Tare</td>\n");
      out.write("              <td></td>\n");
      out.write("              <td>Ajinkya Rahane</td>\n");
      out.write("              <td></td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("              <td></td>\n");
      out.write("              <td></td>\n");
      out.write("              <td></td>\n");
      out.write("              <td></td>\n");
      out.write("          </tr>\n");
      out.write("        </table>\n");
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
