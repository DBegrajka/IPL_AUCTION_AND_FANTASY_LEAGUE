package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.swing.JOptionPane;
import com.sun.java.swing.plaf.windows.resources.windows;
import javax.swing.JPopupMenu;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public final class jspregister_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

                    Connection con=null;
                    Statement stat=null;
                    PreparedStatement ps=null;
                    PreparedStatement ps1=null;
                    ResultSet rs=null;
                    try
                    {
                      Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                      con=DriverManager.getConnection("jdbc:odbc:idsn");
                    }
                    catch(Exception e)
                    {
                      out.println(e);
                    }
                    String FName=null, LName=null, Gender=null, CNo=null, EId=null,  Pass=null, CPass=null, uid=null, upass=null;
                             FName       =request.getParameter("formtext1");
                             LName       =request.getParameter("formtext2");
                             EId         =request.getParameter("formtext3");
                             Gender      =request.getParameter("formselect1");
                             CNo         =request.getParameter("formtext4");
                             Pass        =request.getParameter("formtext5");
                             CPass       =request.getParameter("formtext6");
                             uid         =request.getParameter("inputtext1");
                             upass       =request.getParameter("inputtext2");
                    if(FName!=null && LName!=null && Gender!=null && CNo!=null && EId!=null && Pass!=null && CPass!=null)
                        {
                         try 
                         {
                            ps=con.prepareStatement("insert into Register values(?,?,?,?,?,?)");
                            ps.setString(1, FName);
                            ps.setString(2, LName);
                            ps.setString(3, EId);
                            ps.setString(4, Gender);
                            ps.setString(5, CNo);
                            ps.setString(6, Pass);
                            int n=ps.executeUpdate();
                            
                            response.sendRedirect("jspregister.jsp");                    
                         }
                                        
                         catch (Exception e) 
                         {
                          System.out.println(e);
                         }
                          
                        } 
                        System.out.println("hello");
                         
                        if(uid!=null && upass!=null)
                       {
                            System.out.println("hello5");
                          System.out.println(uid); 
                         System.out.println(upass);
                         stat = con.createStatement();
                         /*ps1=con.prepareStatement("select * from Register where 'First Name'=? and 'Password'=?");
                         ps1.setString(1,uid);
                         ps1.setString(2,upass);*/
                         
                         rs=stat.executeQuery("select * from Register where FirstName='"+uid+"'");
                         
                         if(rs.next())
                         {        
                         response.sendRedirect("fantasy.jsp");
                         }
                         else
                                                         {
                         response.sendRedirect("jspregister.jsp"); 
                                                 }
                       }

    

      out.write("\n");
      out.write("\n");
      out.write("       \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"WEB-INF/../default.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <script language=\"javascript\">\n");
      out.write("   function validate()\n");
      out.write("        {\n");
      out.write("              var fname,lname,pass,cpass,i,cno,eml;\n");
      out.write("              fname=document.getElementById(\"text_FName\").value;\n");
      out.write("              lname=document.getElementById(\"text_LName\").value;\n");
      out.write("              eml= document.getElementById(\"text_EId\").value;\n");
      out.write("              cno=document.getElementById(\"text_Cont\").value;\n");
      out.write("              pass=document.getElementById(\"text_pass\").value;\n");
      out.write("              cpass=document.getElementById(\"text_cpass\").value;\n");
      out.write("              \n");
      out.write("              \n");
      out.write("              if(fname==\"\")\n");
      out.write("              {\n");
      out.write("                  alert(\"please enter all the fields\");\n");
      out.write("                  document.getElementById(\"text_FName\").focus();\n");
      out.write("                  return false;\n");
      out.write("              }\n");
      out.write("              if(fname!=\"\")\n");
      out.write("              {\n");
      out.write("                 for(i=0;i<fname.length;i++)\n");
      out.write("                 {\n");
      out.write("                  if(!((fname.charCodeAt(i)>=65&&fname.charCodeAt(i)<=90)||(fname.charCodeAt(i)>=97&&fname.charCodeAt(i)<=122)))\n");
      out.write("                  {\n");
      out.write("                      alert(\"only Character Allowed\");\n");
      out.write("                      document.getElementById(\"text_FName\").focus(); \n");
      out.write("                      document.getElementById(\"text_FName\").select();\n");
      out.write("                      return false;\n");
      out.write("                  }\n");
      out.write("                }\n");
      out.write("\n");
      out.write("             }\n");
      out.write("            \n");
      out.write("             if(lname==\"\")\n");
      out.write("             {\n");
      out.write("                  alert(\"please enter all the fields\");\n");
      out.write("                  document.getElementById(\"text_LName\").focus();\n");
      out.write("                  return false;\n");
      out.write("             }\n");
      out.write("             if(lname!=\"\")\n");
      out.write("             {\n");
      out.write("                 for(i=0;i<lname.length;i++)\n");
      out.write("                 {\n");
      out.write("                  if(!((lname.charCodeAt(i)>=65&&lname.charCodeAt(i)<=90)||(lname.charCodeAt(i)>=97&&lname.charCodeAt(i)<=122)))\n");
      out.write("                  {\n");
      out.write("                      alert(\"only Character Allowed\");\n");
      out.write("                      document.getElementById(\"text_LName\").focus();\n");
      out.write("                      document.getElementById(\"text_LName\").select();\n");
      out.write("                      return false;\n");
      out.write("                  }\n");
      out.write("                }\n");
      out.write("\n");
      out.write("             }\n");
      out.write("             if(eml==\"\")\n");
      out.write("             {\n");
      out.write("                  alert(\"please enter all the fields\");\n");
      out.write("                  document.getElementById(\"text_EId\").focus();\n");
      out.write("                  return false;\n");
      out.write("             }\n");
      out.write("            \n");
      out.write("             if((eml.indexOf('@'))==-1 || (eml.indexOf('.'))==-1)\n");
      out.write("             {\n");
      out.write("                  alert(\"Please Enter valid Email Id\");  \n");
      out.write("                  document.getElementById(\"text_EId\").focus();  \n");
      out.write("                  document.getElementById(\"text_EId\").select();\n");
      out.write("                  return false;\n");
      out.write("             } \n");
      out.write("             if(cno==\"\" )\n");
      out.write("             {\n");
      out.write("                  alert(\"please enter all the fields\");\n");
      out.write("                  document.getElementById(\"text_Cont\").focus();\n");
      out.write("                  return false;\n");
      out.write("             }\n");
      out.write("              if(cno.length!=10 )\n");
      out.write("             {\n");
      out.write("                  alert(\"Contact must be of 10 digit\");\n");
      out.write("                  document.getElementById(\"text_Cont\").focus();\n");
      out.write("                  return false;\n");
      out.write("             }\n");
      out.write("             \n");
      out.write("             if(cno!=\"\")\n");
      out.write("             {\n");
      out.write("               \n");
      out.write("              for(i=0;i<cno.length;i++)\n");
      out.write("              {\n");
      out.write("               if((cno.charCodeAt(i)>=65&&cno.charCodeAt(i)<=90)||(cno.charCodeAt(i)>=97&& cno.charCodeAt(i)<=122))\n");
      out.write("               {\n");
      out.write("                  alert(\"Enter Number Only\");\n");
      out.write("                  document.getElementById(\"text_Cont\").focus();\n");
      out.write("                  document.getElementById(\"text_Cont\").select();\n");
      out.write("                  return false;\n");
      out.write("               }\n");
      out.write("              }\n");
      out.write("             }\n");
      out.write("            if(pass==\"\")\n");
      out.write("            {\n");
      out.write("                  alert(\"please enter all the fields\");\n");
      out.write("                  document.getElementById(\"text_pass\").focus();\n");
      out.write("                  return false;\n");
      out.write("            }\n");
      out.write("            if(cpass==\"\")\n");
      out.write("            {\n");
      out.write("                  alert(\"please enter all the fields\");\n");
      out.write("                  document.getElementById(\"text_cpass\").focus();\n");
      out.write("                  return false;\n");
      out.write("            }\n");
      out.write("            if(pass!=cpass)\n");
      out.write("            {\n");
      out.write("                alert(\"Password and Confirm Password Should be Same\");\n");
      out.write("                document.getElementById(\"text_cpass\").focus();\n");
      out.write("                document.getElementById(\"text_cpass\").select();\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("           \n");
      out.write("          \n");
      out.write("            return true;\n");
      out.write("           \n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        function change(){\n");
      out.write("             var uid,upass;\n");
      out.write("              uid=document.getElementById(\"inputtext1\").value;\n");
      out.write("              uid=document.getElementById(\"inputtext2\").value;\n");
      out.write("               if(uid==\"\")\n");
      out.write("              {\n");
      out.write("                  alert(\"please enter all the fields\");\n");
      out.write("                  document.getElementById(\"inputtext1\").focus();\n");
      out.write("                  return false;\n");
      out.write("        }\n");
      out.write("         if(upass==\"\")\n");
      out.write("              {\n");
      out.write("                  alert(\"please enter all the fields\");\n");
      out.write("                  document.getElementById(\"inputtext2\").focus();\n");
      out.write("                  return false;\n");
      out.write("              }\n");
      out.write("        }\n");
      out.write("</script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("       \n");
      out.write("         <div id=\"logo\">\n");
      out.write("         <h1><a href=\"index.jsp\"><span>IPL 2014 Auction</span></a></h1>\n");
      out.write("         <h2><a href=\"jspregister.jsp\">Login/Register</span></a></h2>\n");
      out.write("         </div>\n");
      out.write("         <div id=\"splash\"><img src=\"Images/indeximages/IPL-2014-Sold-Player-List-In-IPL-7-.jpg\" alt=\"\" width=\"1000\" height=\"280\" /></a></div>\n");
      out.write("         <div id=\"menu\">\n");
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
      out.write("    <div id=\"welcome\" class=\"boxed\">\n");
      out.write("      <h2 class=\"title\">Create Your IPL Account</h2>\n");
      out.write("      <div class=\"content\">\n");
      out.write(" \n");
      out.write("          <form action=\"jspregister.jsp\" method=\"get\">\n");
      out.write("<div id=\"text1\" style=\"position:absolute; overflow:hidden; left:500px; top:500px; width:85px; height:21px; z-index:14\">\n");
      out.write("<div class=\"wpmd\">\n");
      out.write("<div><font face=\"@Adobe Fan Heiti Std B\" class=\"ws12\"><B>First Name</B></font></div>\n");
      out.write("</div></div>\n");
      out.write("<input id=\"text_FName\" name=\"formtext1\" type=\"text\" style=\"position:absolute;width:200px;left:700px;top:495px;z-index:15\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"text2\" style=\"position:absolute; overflow:hidden; left:500px; top:550px; width:85px; height:23px; z-index:16\">\n");
      out.write("<div class=\"wpmd\">\n");
      out.write("<div><font face=\"@Adobe Fan Heiti Std B\" class=\"ws12\"><B>Last Name</B></font></div>\n");
      out.write("</div></div>\n");
      out.write("<input id=\"text_LName\" name=\"formtext2\" type=\"text\" style=\"position:absolute;width:200px;left:700px;top:545px;z-index:17\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"text17\" style=\"position:absolute; overflow:hidden; left:500px; top:600px; width:102px; height:23px; z-index:28\">\n");
      out.write("<div class=\"wpmd\">\n");
      out.write("<div><font face=\"@Adobe Fan Heiti Std B\" class=\"ws12\"><B>Email Id</B></font></div>\n");
      out.write("</div></div>\n");
      out.write("<input id=\"text_EId\" name=\"formtext3\" type=\"text\" style=\"position:absolute;width:200px;left:700px;top:595px;z-index:27\">\n");
      out.write("\n");
      out.write("<select name=\"formselect1\" style=\"position:absolute;left:700px;top:646px;width:200px;z-index:32\">\n");
      out.write("<option value=\"Male\">Male</option>\n");
      out.write("<option value=\"Female\">Female</option>\n");
      out.write("</select>\n");
      out.write("<div id=\"text11\" style=\"position:absolute; overflow:hidden; left:500px; top:654px; width:69px; height:23px; z-index:18\">\n");
      out.write("<div class=\"wpmd\">\n");
      out.write("<div><font face=\"@Adobe Fan Heiti Std B\" class=\"ws12\"><B>Gender</B></font></div>\n");
      out.write("</div></div>\n");
      out.write("\n");
      out.write("<div id=\"text14\" style=\"position:absolute; overflow:hidden; left:500px; top:705px; width:88px; height:23px; z-index:19\">\n");
      out.write("<div class=\"wpmd\">\n");
      out.write("<div><font face=\"@Adobe Fan Heiti Std B\" class=\"ws12\"><B>Contact No</B></font></div>\n");
      out.write("</div></div>\n");
      out.write("<input id=\"text_Cont\" name=\"formtext4\" type=\"text\" style=\"position:absolute;width:200px;left:700px;top:705px;z-index:20\">\n");
      out.write("\n");
      out.write("<div id=\"text15\" style=\"position:absolute; overflow:hidden; left:500px; top:755px; width:88px; height:23px; z-index:21\">\n");
      out.write("<div class=\"wpmd\">\n");
      out.write("<div><font face=\"@Adobe Fan Heiti Std B\" class=\"ws12\"><B>Password</B></font></div>\n");
      out.write("</div></div>\n");
      out.write("<input id=\"text_pass\" name=\"formtext5\" type=\"password\" style=\"position:absolute;width:200px;left:700px;top:755px;z-index:22\">\n");
      out.write("\n");
      out.write("<div id=\"text16\" style=\"position:absolute; overflow:hidden; left:500px; top:805px; width:156px; height:23px; z-index:23\">\n");
      out.write("<div class=\"wpmd\">\n");
      out.write("<div><font face=\"@Adobe Fan Heiti Std B\" class=\"ws12\"><B>Confirm Password</B></font></div>\n");
      out.write("</div></div>\n");
      out.write("<input id=\"text_cpass\" name=\"formtext6\" type=\"password\" style=\"position:absolute;width:200px;left:700px;top:806px;z-index:24\">\n");
      out.write("\n");
      out.write("<div id=\"formimage1\" style=\"position:absolute; left:700px; top:860px; z-index:25\"><input type=\"submit\" name=\"submit\" value=\"Submit\" onclick=\"return validate();\"></div></form>\n");
      out.write("<a href=\"jspregister.jsp\"><div id=\"formimage2\" style=\"position:absolute; left:800px; top:860px; z-index:26\"><input type=\"submit\" name=\"cancel\" value=\"Cancel\"></div></a>\n");
      out.write("\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("   </div>\n");
      out.write("  <div id=\"sidebar\">\n");
      out.write("    <div id=\"login\" class=\"boxed\">\n");
      out.write("      <h2 class=\"title\">User Account</h2>\n");
      out.write("      <div class=\"content\">\n");
      out.write("          <form id=\"form1\" method=\"get\" action=\"fantasy.jsp\">\n");
      out.write("          <fieldset>\n");
      out.write("          <legend>Sign-In</legend>\n");
      out.write("          <label for=\"inputtext1\">User ID:</label>\n");
      out.write("          <input id=\"inputtext1\" type=\"text\" name=\"inputtext1\">\n");
      out.write("          <label for=\"inputtext2\">Password:</label>\n");
      out.write("          <input id=\"inputtext2\" type=\"password\" name=\"inputtext2\">\n");
      out.write("          <input id=\"inputsubmit1\" type=\"submit\" name=\"inputsubmit1\" value=\"Sign In\"  onclick=\"return change();\">\n");
      out.write("          <p></p>\n");
      out.write("          </fieldset>\n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"updates\" class=\"boxed\">\n");
      out.write("      <h2 class=\"title\">Recent Updates</h2>\n");
      out.write("      <div class=\"content\">\n");
      out.write("        <ul>\n");
      out.write("          <li>\n");
      out.write("               <marquee behavior=\"scroll\" direction=\"left\" scrollamount=\"2\">Pepsi IPL ticket sales cross 100,000 mark</marquee>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("              <marquee behaviour=\"scroll\" direction=\"left\" scrollamount=\"2\">Pepsi IPL returns to India on May 2</marquee>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("              <marquee behaviour=\"scroll\" direction=\"left\" scrollamount=\"2\">Details of IPL tickets for UAE matches</marquee>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("              <marquee behaviour=\"scroll\" direction=\"left\" scrollamount=\"2\">UAE buzzing with Pepsi IPL excitement</marquee>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("              <marquee behaviour=\"scroll\" direction=\"left\" scrollamount=\"2\">Gavaskar holds meeting with IPL franchises</marquee>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"partners\" class=\"boxed\">\n");
      out.write("      <h1 class=\"title\">Partners</h1>\n");
      out.write("       <div class=\"content\">\n");
      out.write("       <h2>\n");
      out.write("           <span>Pepsi</span>\n");
      out.write("           <span>Etihad Airways</span>\n");
      out.write("           <span>India Cements</span>\n");
      out.write("           <span>Reliance</span>\n");
      out.write("        </h2>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<div id=\"footer\">\n");
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
      out.write("      </div><!-- END footer -->   \n");
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
