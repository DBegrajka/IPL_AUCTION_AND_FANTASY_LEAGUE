package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class jspteams_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"WEB-INF/../default2.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"logo\">\n");
      out.write("  <h1><a href=\"index.jsp\"><span>IPL 2014 Auction</span></a></h1>\n");
      out.write("  <h2><a href=\"jspregister.jsp\">Login/Register</span></a></h2>\n");
      out.write("  </div>\n");
      out.write("        <div id=\"splash\"><img src=\"Images/indeximages/IPL-2014-Sold-Player-List-In-IPL-7-.jpg\" alt=\"\" width=\"1000\" height=\"280\" /></a></div>\n");
      out.write("<div id=\"menu\">\n");
      out.write("  <ul>\n");
      out.write("    <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("    <li><a href=\"jspregister.jsp\">Register</a></li>\n");
      out.write("    <li><a href=\"news.jsp\">News</a></li>\n");
      out.write("    <li><a href=\"jspteams.jsp\">Teams</a></li>\n");
      out.write("    <li><a href=\"jspstats.jsp\">Stats</a></li>\n");
      out.write("    <li><a href=\"videos.jsp\">Videos</a></li> \n");
      out.write("    <li><a href=\"photos.jsp\">Photos</a></li> \n");
      out.write("    <li><a href=\"about.jsp\">About</a></li> \n");
      out.write(" </ul>\n");
      out.write("</div>\n");
      out.write("<div id=\"content\">\n");
      out.write("  <div id=\"main\">\n");
      out.write("    <div id=\"container\" class=\"boxed\">\n");
      out.write("      <h1 align=\"center\">TEAMS</h1>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("      <table>\n");
      out.write("          <tr><td><h2>Chennai Super Kings</h2>\n");
      out.write("                  <a href=\"csk.jsp\"><img src=\"Images/Teamsimages/Chennai Super Kings Logo Wallpaper 72.jpg\"  width=\"400\" height=\"300\"></a></td>\n");
      out.write("              <td><h2>Delhi Daredevils</h2>\n");
      out.write("                    <img src=\"Images/Teamsimages/Delhi_Daredevils_Logo.jpg\" width=\"400\" height=\"300\"></td></tr>\n");
      out.write("          <tr><td><h2>Kings XI Punjab</h2>\n");
      out.write("                  <img src=\"Images/Teamsimages/Kings-XI-Punjab-Logo-Wallpaper-2013.jpg\" width=\"400\" height=\"300\"></td>\n");
      out.write("              <td><h2>Kolkata Knight Riders</h2>\n");
      out.write("                  <img src=\"Images/Teamsimages/kkr-kolkata-knight-riders-new-logo-154176.jpg\" width=\"400\" height=\"300\"></td></tr>\n");
      out.write("          <tr><td><h2>Mumbai Indians</h2>\n");
      out.write("                    <img src=\"Images/Teamsimages/IPL 6-Mumbai Indians-Pardaphash-80422.jpg\" width=\"400\" height=\"300\"></td>\n");
      out.write("              <td><h2>Rajasthan Royals</h2>\n");
      out.write("                  <img src=\"Images/Teamsimages/rrlogo_with_whiteborder.jpg\" width=\"400\" height=\"300\"></td></tr>\n");
      out.write("          <tr><td><h2>Royal Challengers Bangalore</h2>\n");
      out.write("              <img src=\"Images/Teamsimages/n62osyi37att9b7y_D0_rcb_logo.jpg\" width=\"400\" height=\"300\"></td>\n");
      out.write("              <td><h2>Sunrisers Hyderabad</h2>\n");
      out.write("                  <img src=\"Images/Teamsimages/Sunrisers_Hyderabad.jpg\" width=\"400\" height=\"300\"></td></tr>               \n");
      out.write("      </table>\n");
      out.write("             \n");
      out.write("</div>\n");
      out.write("    </div>\n");
      out.write("  \n");
      out.write("<div id=\"footer\">\n");
      out.write("        <div id=\"footerNav\" align=\"center\">\n");
      out.write("            <div id=\"footerNavSection\" >\n");
      out.write("                <p>Teams</p>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"/teams/chennai-super-kings\">Chennai Super Kings</a></li>\n");
      out.write("                    <li><a href=\"/teams/delhi-daredevils\">Delhi Daredevils</a></li>\n");
      out.write("                    <li><a href=\"/teams/kings-xi-punjab\">Kings XI Punjab</a></li>\n");
      out.write("                    <li><a href=\"/teams/kolkata-knight-riders\">Kolkata Knight Riders</a></li>\n");
      out.write("                    <li><a href=\"/teams/mumbai-indians\">Mumbai Indians</a></li>\n");
      out.write("                    <li><a href=\"/teams/rajasthan-royals\">Rajasthan Royals</a></li>\n");
      out.write("                    <li><a href=\"/teams/royal-challengers-bangalore\">Royal Challengers Bangalore</a></li>\n");
      out.write("                    <li><a href=\"/teams/sunrisers-hyderabad\">Sunrisers Hyderabad</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div> \n");
      out.write("            \n");
      out.write("            <div id=\"footerNavSection\">\n");
      out.write("                <p>About</p>\n");
      out.write("                <ul>    \n");
      out.write("                     <li><a href=\"/about/2014/anti-corruption-policy\">Anti Corruption Policy</a></li>   \n");
      out.write("                     <li><a href=\"/about/2014/anti-doping-policy\">Anti Doping Policy</a></li>   \n");
      out.write("                     <li><a href=\"/about/2014/anti-racism-policy\">Anti Racism Policy</a></li>   \n");
      out.write("                     <li><a href=\"/about/2014/clothing-regulations\">Clothing Regulations</a></li>   \n");
      out.write("                     <li><a href=\"/about/2014/code-of-conduct-for-players\">Code of Conduct for Players</a></li>   \n");
      out.write("                     <li><a href=\"/about/2014/code-of-conduct-for-umpires\">Code of Conduct for Umpires</a></li>   \n");
      out.write("                     <li><a href=\"/about/2014/ipl-committees\">IPL Committees</a></li>   \n");
      out.write("                     <li><a href=\"/about/2014/match-playing-conditions\">Match Playing Conditions</a></li>   \n");
      out.write("                </ul>  \n");
      out.write("            </div><!-- END footerNavSection -->\n");
      out.write("                        \n");
      out.write("            <div id=\"footerNavSection\">\n");
      out.write("                <p>Contact</p>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"/about/contact/0\">Feedback</a></li>\n");
      out.write("                    <li><a href=\"/about/contact/1\">Marketing</a></li>\n");
      out.write("                    <li><a href=\"http://media.iplt20.com\">Media Accreditation</a></li>\n");
      out.write("                    <li><a href=\"/about/contact/2\">Operations</a></li>\n");
      out.write("                    <li><a href=\"/about/contact/3\">Press / Media</a></li>\n");
      out.write("                    <li><a href=\"http://www.iplt20.com/mediahandbook\">Media Handbook</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div><!-- END footerNavSection -->\n");
      out.write("            <div id=\"footerNavSection\" align=\"center\">\n");
      out.write("            <p>&copy; Copyright IPL, BCCI 2014. All Rights reserved.</p>\n");
      out.write("            <p><a href=\"/about/2014/terms-and-conditions\">Terms and Conditions</a></p>\n");
      out.write("            <p><a href=\"/about/2014/privacy-policy\">Privacy Policy</a></p>\n");
      out.write("            <p><a href=\"#\">Back to top</a></p>\t\t\t\n");
      out.write("        </div><!-- END footerNavSection -->\n");
      out.write("     </div><!-- END footerNav -->\n");
      out.write("      </div><!-- END footer --> \n");
      out.write("</body>\n");
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
