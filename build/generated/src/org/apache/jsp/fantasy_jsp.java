package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class fantasy_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" >\n");
      out.write("        <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js\">\n");
      out.write("</script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        ");

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
        String uid=null, upass=null;
             uid         =request.getParameter("inputtext1");
                             upass       =request.getParameter("inputtext2");
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
      out.write("        <link href=\"WEB-INF/../fantasycss.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        \n");
      out.write("    \n");
      out.write("            <meta name=\"generator\" content=\"Web Page Maker (unregistered version)\">\n");
      out.write("            <script>\n");
      out.write("                var i=2;\n");
      out.write("                var m;\n");
      out.write("                var lc=0;\n");
      out.write("                var c1=0,c2=0,c3=0,c4=0;\n");
      out.write("                var ar1 = new Array();\n");
      out.write("                var ar2 = new Array();\n");
      out.write("                var ar3 = new Array();\n");
      out.write("                var ar4 = new Array();\n");
      out.write("                function change()\n");
      out.write("                      { \n");
      out.write("                          var jspcall = \"test.jsp?ar1=\"+ar1+\"&ar2=\"+ar2+\"&ar3=\"+ar3+\"&ar4=\"+ar4;\n");
      out.write("                          document.getElementById('finish').href=jspcall;\n");
      out.write("                       if(i==109)   \n");
      out.write("                      {\n");
      out.write("                          alert(\"All Sold,Go home,Drink Beer\");\n");
      out.write("                      }\n");
      out.write("                      else\n");
      out.write("                          {\n");
      out.write("                      document.getElementById(\"f\").value=\"5000000\";\n");
      out.write("                      document.getElementById(\"i\").src=\"Images/playerimage/a\"+i+\".bmp\";\n");
      out.write("                      i++;\n");
      out.write("                      \n");
      out.write("                      document.getElementById('g').style.display=\"\";\n");
      out.write("                      stopdelay();\n");
      out.write("                          }\n");
      out.write("                      }          \n");
      out.write("                      function myFunction(id)\n");
      out.write("                      {     stopdelay();\n");
      out.write("                            document.getElementById(\"f\").value = parseInt(document.getElementById(\"f\").value) + 1000000; \n");
      out.write("                            if(id==\"bid1\")\n");
      out.write("                                {\n");
      out.write("                                    lc=1;\n");
      out.write("                                }\n");
      out.write("                                else if(id==\"bid2\")\n");
      out.write("                                {\n");
      out.write("                                    lc=2;\n");
      out.write("                                }\n");
      out.write("                                else if(id==\"bid3\")\n");
      out.write("                                {\n");
      out.write("                                    lc=3;\n");
      out.write("                                }\n");
      out.write("                                else if(id==\"bid4\")\n");
      out.write("                                {\n");
      out.write("                                    lc=4;\n");
      out.write("                                }\n");
      out.write("                                delay();\n");
      out.write("                      }\n");
      out.write("                      function delay()\n");
      out.write("                      { \n");
      out.write("                          m = setInterval(function()\n");
      out.write("                                {\n");
      out.write("                                    if(lc==0)\n");
      out.write("                                    {alert(\"Player Not Sold\");\n");
      out.write("                                    stopdelay();\n");
      out.write("                                }\n");
      out.write("                                    else\n");
      out.write("                                        {\n");
      out.write("                                         document.getElementById(\"amt\"+lc).value=document.getElementById(\"amt\"+lc).value-document.getElementById(\"f\").value;\n");
      out.write("                                         switch(lc)\n");
      out.write("                                         {\n");
      out.write("                                          case 1:\n");
      out.write("                                              ar1[c1]=\"a\"+i+\".bmp\";\n");
      out.write("                                              c1++;\n");
      out.write("                                              break;\n");
      out.write("                                          case 2:\n");
      out.write("                                              ar2[c2]=\"a\"+i+\".bmp\";\n");
      out.write("                                              c2++;\n");
      out.write("                                              break;\n");
      out.write("                                          case 3:\n");
      out.write("                                              ar3[c3]=\"a\"+i+\".bmp\";\n");
      out.write("                                              c3++;\n");
      out.write("                                              break;\n");
      out.write("                                          case 4:\n");
      out.write("                                              ar4[c4]=\"a\"+i+\".bmp\";\n");
      out.write("                                              c4++;\n");
      out.write("                                              break;\n");
      out.write("                                         }\n");
      out.write("                                         alert(\"player sold to franchise\"+lc+\" for amount \"+document.getElementById(\"f\").value);\n");
      out.write("                                         stopdelay();\n");
      out.write("                                        }\n");
      out.write("                                },8000);\n");
      out.write("                                document.getElementById('g').style.display=\"none\";\n");
      out.write("                      }\n");
      out.write("                      function stopdelay()\n");
      out.write("                        {\n");
      out.write("                            clearInterval(m);\n");
      out.write("                        }\n");
      out.write("            </script>\n");
      out.write("\n");
      out.write("             \n");
      out.write("            <style type=\"text/css\">\n");
      out.write("/*----------Text Styles----------*/\n");
      out.write(".ws6 {font-size: 8px;}\n");
      out.write(".ws7 {font-size: 9.3px;}\n");
      out.write(".ws8 {font-size: 11px;}\n");
      out.write(".ws9 {font-size: 12px;}\n");
      out.write(".ws10 {font-size: 13px;}\n");
      out.write(".ws11 {font-size: 15px;}\n");
      out.write(".ws12 {font-size: 16px;}\n");
      out.write(".ws14 {font-size: 19px;}\n");
      out.write(".ws16 {font-size: 21px;}\n");
      out.write(".ws18 {font-size: 24px;}\n");
      out.write(".ws20 {font-size: 27px;}\n");
      out.write(".ws22 {font-size: 29px;}\n");
      out.write(".ws24 {font-size: 32px;}\n");
      out.write(".ws26 {font-size: 35px;}\n");
      out.write(".ws28 {font-size: 37px;}\n");
      out.write(".ws36 {font-size: 48px;}\n");
      out.write(".ws48 {font-size: 64px;}\n");
      out.write(".ws72 {font-size: 96px;}\n");
      out.write(".wpmd {font-size: 13px;font-family: Arial,Helvetica,Sans-Serif;font-style: normal;font-weight: normal;}\n");
      out.write("/*----------Para Styles----------*/\n");
      out.write("DIV,UL,OL /* Left */\n");
      out.write("{\n");
      out.write(" margin-top: 0px;\n");
      out.write(" margin-bottom: 0px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body style=\"background-color:burlywood\">\n");
      out.write("       \n");
      out.write("        \n");
      out.write("        \n");
      out.write("         <div id=\"logo\">\n");
      out.write("         <h1><span>Fantasy League</span></a></h1>\n");
      out.write("         <h2><a href=\"index.jsp\">Log out</span></a></h2>\n");
      out.write("         </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("       <div id=\"content\">\n");
      out.write("        <div id=\"main\">\n");
      out.write("    <div id=\"image1\" style=\"position:absolute; overflow:hidden; left:167px; top:241px; width:499px; height:258px; z-index:0\"><img src=\"Images/Fantasy/2919_wood.jpg\" alt=\"\" title=\"\" border=0 width=499 height=258></div>\n");
      out.write("    <div id=\"formimage01\" style=\"position:absolute; left:350px; top:270px;\"><input type=\"button\" id=\"g\" value=\"Start Bid On This Player\" onclick=\"delay()\"></div>\n");
      out.write("    <div id=\"formimage02\" style=\"position:absolute; left:400px; top:350px;\"><input type=\"button\" id=\"f\" value=\"5000000\"></div>\n");
      out.write("    <div id=\"image2\" style=\"position:absolute; overflow:hidden; left:330px; top:73px; width:162px; height:145px; z-index:1\"><img src=\"Images/Fantasy/a-3.gif\" alt=\"\" title=\"\" border=0 width=162 height=145></div>\n");
      out.write("    <a id=\"finish\" style=\"left:400px;top:200px;\">Show List</a>\n");
      out.write("    <div id=\"image3\" style=\"position:absolute; overflow:hidden; left:64px; top:251px; width:93px; height:97px; z-index:2\"><img src=\"Images/Fantasy/a-2.gif\" alt=\"\" title=\"\" border=0 width=93 height=97></div>\n");
      out.write("    <div id=\"formimage1\" style=\"position:absolute; left:64px; top:380px; z-index:25\"><input type=\"button\" id=\"bid1\" value=\"    +10 Lakhs    \" onclick=\"myFunction(this.id)\"></div>\n");
      out.write("    <div id=\"formimage1\" style=\"position:absolute; left:64px; top:410px;\"><input type=\"button\" id=\"amt1\" value=\"600000000\"></div>\n");
      out.write("    \n");
      out.write("    <div id=\"image5\" style=\"position:absolute; overflow:hidden; left:238px; top:497px; width:70px; height:101px; z-index:3\"><img src=\"Images/Fantasy/a-2.gif\" alt=\"\" title=\"\" border=0 width=70 height=101></div>\n");
      out.write("       <div id=\"formimage1\" style=\"position:absolute; left:230px; top:626px; z-index:25\"><input type=\"button\" id=\"bid2\" value=\"    +10 Lakhs    \" onclick=\"myFunction(this.id)\"></div>\n");
      out.write("    <div id=\"formimage1\" style=\"position:absolute; left:230px; top:656px;\"><input type=\"button\" id=\"amt2\" value=\"600000000\"></div>\n");
      out.write("    \n");
      out.write("       <div id=\"image4\" style=\"position:absolute; overflow:hidden; left:688px; top:258px; width:84px; height:103px; z-index:4\"><img src=\"Images/Fantasy/a-2.gif\" alt=\"\" title=\"\" border=0 width=84 height=103></div>\n");
      out.write("    <div id=\"formimage1\" style=\"position:absolute; left:688px; top:387px; z-index:25\"><input type=\"button\" id=\"bid4\" value=\"    +10 Lakhs    \" onclick=\"myFunction(this.id)\"></div>\n");
      out.write("    <div id=\"formimage1\" style=\"position:absolute; left:688px; top:417px;\"><input type=\"button\" id=\"amt4\" value=\"600000000\"></div>\n");
      out.write("    \n");
      out.write("    <div id=\"image6\" style=\"position:absolute; overflow:hidden; left:531px; top:497px; width:75px; height:95px; z-index:5\"><img src=\"Images/Fantasy/a-2.gif\" alt=\"\" title=\"\" border=0 width=75 height=95></div>\n");
      out.write("    <div id=\"formimage1\" style=\"position:absolute; left:531px; top:626px; z-index:25\"><input type=\"button\" id=\"bid3\" value=\"    +10 Lakhs    \" onclick=\"myFunction(this.id)\"></div>\n");
      out.write("    <div id=\"formimage1\" style=\"position:absolute; left:531px; top:656px;\"><input type=\"button\" id=\"amt3\" value=\"600000000\"></div>\n");
      out.write("    \n");
      out.write("    <div id=\"text1\" style=\"position:absolute; overflow:hidden; left:75px; top:357px; width:66px; height:40px; z-index:6\">\n");
      out.write("<div class=\"wpmd\">\n");
      out.write("<div><font color=\"#000000\"><B><I>Franchise1</I></B></font></div>\n");
      out.write("</div></div>\n");
      out.write("\n");
      out.write("<div id=\"text2\" style=\"position:absolute; overflow:hidden; left:239px; top:600px; width:75px; height:40px; z-index:7\">\n");
      out.write("<div class=\"wpmd\">\n");
      out.write("<div><B><I>Franchise2</I></B></div>\n");
      out.write("</div></div>\n");
      out.write("\n");
      out.write("<div id=\"text3\" style=\"position:absolute; overflow:hidden; left:536px; top:600px; width:70px; height:40px; z-index:8\">\n");
      out.write("<div class=\"wpmd\">\n");
      out.write("<div><B><I>Franchise3</I></B></div>\n");
      out.write("</div></div>\n");
      out.write("\n");
      out.write("<div id=\"text4\" style=\"position:absolute; overflow:hidden; left:697px; top:368px; width:71px; height:40px; z-index:9\">\n");
      out.write("<div class=\"wpmd\">\n");
      out.write("<div><B><I>Franchise4</I></B></div>\n");
      out.write("</div></div>\n");
      out.write("\n");
      out.write("<div id=\"text5\" style=\"position:absolute; overflow:hidden; left:370px; top:220px; width:77px; height:31px; z-index:10\">\n");
      out.write("<div class=\"wpmd\">\n");
      out.write("<div><B><I>Auctioner</I></B></div>\n");
      out.write("</div></div>\n");
      out.write("    <div id=\"image7\" style=\"position:absolute; overflow:hidden; left:800px; top:100px; width:500px; height:700px; z-index:3\"><img id=\"i\" src=\"Images/playerimage/a1.bmp\" alt=\"\" title=\"\" border=0 width=450 height=550></div>\n");
      out.write("    <div id=\"formimage10\" style=\"position:absolute; left:1250px; top:626px; z-index:25\"><input type=\"submit\" name=\"submit\" value=\"  Next  \" onclick=\"change()\"></div>        \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("        \n");
      out.write(" </body>\n");
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
