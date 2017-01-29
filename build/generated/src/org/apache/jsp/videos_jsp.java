package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class videos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"WEB-INF/../default3.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("         <div id=\"logo\">\n");
      out.write("  <h1><a href=\"index.jsp\"><span>IPL 2014 Auction</span></a></h1>\n");
      out.write("  <h2><a href=\"jspregister.jsp\">Register</span></a></h2>\n");
      out.write("  </div>\n");
      out.write("        <div id=\"splash\"><img src=\"Images/indeximages/IPL-2014-Sold-Player-List-In-IPL-7-.jpg\" alt=\"\" width=\"1000\" height=\"280\" /></a></div>\n");
      out.write("<div id=\"menu\">\n");
      out.write("  <ul>\n");
      out.write("    <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("    <li><a href=\"fantasy.jsp\">Fantasy</a></li>\n");
      out.write("    <li><a href=\"news.jsp\">News</a></li>\n");
      out.write("    <li><a href=\"jspteams.jsp\">Teams</a></li>\n");
      out.write("    <li><a href=\"jspstats.jsp\">Stats</a></li>\n");
      out.write("    <li><a href=\"videos.jsp\">Videos</a></li> \n");
      out.write("    <li><a href=\"photos.jsp\">Photos</a></li> \n");
      out.write("    <li><a href=\"about.jsp\">About</a></li> \n");
      out.write(" </ul>\n");
      out.write("</div>\n");
      out.write("<div id=\"content\">\n");
      out.write("  \n");
      out.write("    <div id=\"main\">\n");
      out.write("    <div id=\"welcome\" class=\"boxed\" onload=\"setTimeout('nextPic()',2000)\">\n");
      out.write("      <h1 align=\"center\">Watchout Videos</h1>\n");
      out.write("      <img src=\"Images/indeximages/Dharamshala-Cricket-Stadium.jpg\" width=\"350\" height=\"350\">\n");
      out.write("      <img src=\"Images/photosjsp/19191.jpg\" width=\"350\" height=\"350\">\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("   <div id=\"footer\">\n");
      out.write("        <div id=\"footerNav\" align=\"center\">\n");
      out.write("            <div id=\"footerNavSection\" >\n");
      out.write("                <p>Teams</p>\n");
      out.write("                <ul>\n");
      out.write("                     <li><a href=\"jspteams.jsp\">Chennai Super Kings</a></li>\n");
      out.write("                    <li><a href=\"jspteams.jsp\">Delhi Daredevils</a></li>\n");
      out.write("                    <li><a href=\"jspteams.jsp\">Kings XI Punjab</a></li>\n");
      out.write("                    <li><a href=\"jspteams.jsp\">Kolkata Knight Riders</a></li>\n");
      out.write("                    <li><a href=\"jspteams.jsp\">Mumbai Indians</a></li>\n");
      out.write("                    <li><a href=\"jspteams.jsp\">Rajasthan Royals</a></li>\n");
      out.write("                    <li><a href=\"jspteams.jsp\">Royal Challengers Bangalore</a></li>\n");
      out.write("                    <li><a href=\"jspteams.jsp\">Sunrisers Hyderabad</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div> \n");
      out.write("            \n");
      out.write("            <div id=\"footerNavSection\">\n");
      out.write("                <p>About</p>\n");
      out.write("                <ul>    \n");
      out.write("                     <li>Anti Corruption Policy</li>   \n");
      out.write("                     <li>Anti Doping Policy</li>   \n");
      out.write("                     <li>Anti Racism Policy</li>   \n");
      out.write("                     <li>Clothing Regulations</li>   \n");
      out.write("                     <li>Code of Conduct for Players</li>   \n");
      out.write("                     <li>Code of Conduct for Umpires</li>   \n");
      out.write("                     <li>IPL Committees</li>   \n");
      out.write("                     <li>Match Playing Conditions</li>   \n");
      out.write("                </ul>  \n");
      out.write("            </div><!-- END footerNavSection -->\n");
      out.write("                        \n");
      out.write("            <div id=\"footerNavSection\">\n");
      out.write("                <p>Contact</p>\n");
      out.write("                <ul>\n");
      out.write("                    <li>Feedback</li>\n");
      out.write("                    <li>Marketing</li>\n");
      out.write("                    <li>Media Accreditation</li>\n");
      out.write("                    <li>Operations</li>\n");
      out.write("                    <li>Press / Media</li>\n");
      out.write("                    <li>Media Handbook</li>\n");
      out.write("                </ul>\n");
      out.write("            </div><!-- END footerNavSection -->\n");
      out.write("            <div id=\"footerNavSection\" align=\"center\">\n");
      out.write("            <p>&copy; Copyright IPL, BCCI 2014. All Rights reserved.</p>\n");
      out.write("            <p>Terms and Conditions</p>\n");
      out.write("            <p>Privacy Policy</p>\n");
      out.write("            <p><a href=\"#\">Back to top</a></p>\t\t\t\n");
      out.write("        </div><!-- END footerNavSection -->\n");
      out.write("     </div><!-- END footerNav -->\n");
      out.write("      </div><!-- END footer -->\n");
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
