<%-- 
    Document   : signup
    Created on : Apr 17, 2014, 2:14:23 AM
    Author     : dev jat
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"
        session="true"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js">
</script>
        <title>JSP Page</title>
        <%
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
        %>
        <link href="WEB-INF/../fantasycss.css" rel="stylesheet" type="text/css" />
        
    
            <meta name="generator" content="Web Page Maker (unregistered version)">
            <script>
                var i=2;
                var m;
                var lc=0;
                var c1=0,c2=0,c3=0,c4=0;
                var ar1 = new Array();
                var ar2 = new Array();
                var ar3 = new Array();
                var ar4 = new Array();
                function change()
                      { 
                          var jspcall = "test.jsp?ar1="+ar1+"&ar2="+ar2+"&ar3="+ar3+"&ar4="+ar4;
                          document.getElementById('finish').href=jspcall;
                       if(i==109)   
                      {
                          alert("All Sold,Go home,Drink Beer");
                      }
                      else
                          {
                      document.getElementById("f").value="5000000";
                      document.getElementById("i").src="Images/playerimage/a"+i+".bmp";
                      i++;
                      
                      document.getElementById('g').style.display="";
                      stopdelay();
                          }
                      }          
                      function myFunction(id)
                      {     stopdelay();
                            document.getElementById("f").value = parseInt(document.getElementById("f").value) + 1000000; 
                            if(id=="bid1")
                                {
                                    lc=1;
                                }
                                else if(id=="bid2")
                                {
                                    lc=2;
                                }
                                else if(id=="bid3")
                                {
                                    lc=3;
                                }
                                else if(id=="bid4")
                                {
                                    lc=4;
                                }
                                delay();
                      }
                      function delay()
                      { 
                          m = setInterval(function()
                                {
                                    if(lc==0)
                                    {alert("Player Not Sold");
                                    stopdelay();
                                }
                                    else
                                        {
                                         document.getElementById("amt"+lc).value=document.getElementById("amt"+lc).value-document.getElementById("f").value;
                                         switch(lc)
                                         {
                                          case 1:
                                              ar1[c1]="a"+i+".bmp";
                                              c1++;
                                              break;
                                          case 2:
                                              ar2[c2]="a"+i+".bmp";
                                              c2++;
                                              break;
                                          case 3:
                                              ar3[c3]="a"+i+".bmp";
                                              c3++;
                                              break;
                                          case 4:
                                              ar4[c4]="a"+i+".bmp";
                                              c4++;
                                              break;
                                         }
                                         alert("player sold to franchise"+lc+" for amount "+document.getElementById("f").value);
                                         stopdelay();
                                        }
                                },8000);
                                document.getElementById('g').style.display="none";
                      }
                      function stopdelay()
                        {
                            clearInterval(m);
                        }
            </script>

             
            <style type="text/css">
/*----------Text Styles----------*/
.ws6 {font-size: 8px;}
.ws7 {font-size: 9.3px;}
.ws8 {font-size: 11px;}
.ws9 {font-size: 12px;}
.ws10 {font-size: 13px;}
.ws11 {font-size: 15px;}
.ws12 {font-size: 16px;}
.ws14 {font-size: 19px;}
.ws16 {font-size: 21px;}
.ws18 {font-size: 24px;}
.ws20 {font-size: 27px;}
.ws22 {font-size: 29px;}
.ws24 {font-size: 32px;}
.ws26 {font-size: 35px;}
.ws28 {font-size: 37px;}
.ws36 {font-size: 48px;}
.ws48 {font-size: 64px;}
.ws72 {font-size: 96px;}
.wpmd {font-size: 13px;font-family: Arial,Helvetica,Sans-Serif;font-style: normal;font-weight: normal;}
/*----------Para Styles----------*/
DIV,UL,OL /* Left */
{
 margin-top: 0px;
 margin-bottom: 0px;
}
</style>

</head>
<body style="background-color:burlywood">
       
        
        
         <div id="logo">
         <h1><span>Fantasy League</span></a></h1>
         <h2><a href="index.jsp">Log out</span></a></h2>
         </div>
        
        
       <div id="content">
        <div id="main">
    <div id="image1" style="position:absolute; overflow:hidden; left:167px; top:241px; width:499px; height:258px; z-index:0"><img src="Images/Fantasy/2919_wood.jpg" alt="" title="" border=0 width=499 height=258></div>
    <div id="formimage01" style="position:absolute; left:350px; top:270px;"><input type="button" id="g" value="Start Bid On This Player" onclick="delay()"></div>
    <div id="formimage02" style="position:absolute; left:400px; top:350px;"><input type="button" id="f" value="5000000"></div>
    <div id="image2" style="position:absolute; overflow:hidden; left:330px; top:73px; width:162px; height:145px; z-index:1"><img src="Images/Fantasy/a-3.gif" alt="" title="" border=0 width=162 height=145></div>
    <a id="finish" style="left:400px;top:200px;">Show List</a>
    <div id="image3" style="position:absolute; overflow:hidden; left:64px; top:251px; width:93px; height:97px; z-index:2"><img src="Images/Fantasy/a-2.gif" alt="" title="" border=0 width=93 height=97></div>
    <div id="formimage1" style="position:absolute; left:64px; top:380px; z-index:25"><input type="button" id="bid1" value="    +10 Lakhs    " onclick="myFunction(this.id)"></div>
    <div id="formimage1" style="position:absolute; left:64px; top:410px;"><input type="button" id="amt1" value="600000000"></div>
    
    <div id="image5" style="position:absolute; overflow:hidden; left:238px; top:497px; width:70px; height:101px; z-index:3"><img src="Images/Fantasy/a-2.gif" alt="" title="" border=0 width=70 height=101></div>
       <div id="formimage1" style="position:absolute; left:230px; top:626px; z-index:25"><input type="button" id="bid2" value="    +10 Lakhs    " onclick="myFunction(this.id)"></div>
    <div id="formimage1" style="position:absolute; left:230px; top:656px;"><input type="button" id="amt2" value="600000000"></div>
    
       <div id="image4" style="position:absolute; overflow:hidden; left:688px; top:258px; width:84px; height:103px; z-index:4"><img src="Images/Fantasy/a-2.gif" alt="" title="" border=0 width=84 height=103></div>
    <div id="formimage1" style="position:absolute; left:688px; top:387px; z-index:25"><input type="button" id="bid4" value="    +10 Lakhs    " onclick="myFunction(this.id)"></div>
    <div id="formimage1" style="position:absolute; left:688px; top:417px;"><input type="button" id="amt4" value="600000000"></div>
    
    <div id="image6" style="position:absolute; overflow:hidden; left:531px; top:497px; width:75px; height:95px; z-index:5"><img src="Images/Fantasy/a-2.gif" alt="" title="" border=0 width=75 height=95></div>
    <div id="formimage1" style="position:absolute; left:531px; top:626px; z-index:25"><input type="button" id="bid3" value="    +10 Lakhs    " onclick="myFunction(this.id)"></div>
    <div id="formimage1" style="position:absolute; left:531px; top:656px;"><input type="button" id="amt3" value="600000000"></div>
    
    <div id="text1" style="position:absolute; overflow:hidden; left:75px; top:357px; width:66px; height:40px; z-index:6">
<div class="wpmd">
<div><font color="#000000"><B><I>Franchise1</I></B></font></div>
</div></div>

<div id="text2" style="position:absolute; overflow:hidden; left:239px; top:600px; width:75px; height:40px; z-index:7">
<div class="wpmd">
<div><B><I>Franchise2</I></B></div>
</div></div>

<div id="text3" style="position:absolute; overflow:hidden; left:536px; top:600px; width:70px; height:40px; z-index:8">
<div class="wpmd">
<div><B><I>Franchise3</I></B></div>
</div></div>

<div id="text4" style="position:absolute; overflow:hidden; left:697px; top:368px; width:71px; height:40px; z-index:9">
<div class="wpmd">
<div><B><I>Franchise4</I></B></div>
</div></div>

<div id="text5" style="position:absolute; overflow:hidden; left:370px; top:220px; width:77px; height:31px; z-index:10">
<div class="wpmd">
<div><B><I>Auctioner</I></B></div>
</div></div>
    <div id="image7" style="position:absolute; overflow:hidden; left:800px; top:100px; width:500px; height:700px; z-index:3"><img id="i" src="Images/playerimage/a1.bmp" alt="" title="" border=0 width=450 height=550></div>
    <div id="formimage10" style="position:absolute; left:1250px; top:626px; z-index:25"><input type="submit" name="submit" value="  Next  " onclick="change()"></div>        
    </div>
  </div>
        
 </body>
</html>
