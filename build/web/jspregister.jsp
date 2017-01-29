<%-- 
    Document   : jspregister
    Created on : Apr 3, 2014, 10:18:54 PM
    Author     : dev jat
--%>

<%@page import="javax.swing.JOptionPane"%>
<%@page import="com.sun.java.swing.plaf.windows.resources.windows"%>
<%@page import="javax.swing.JPopupMenu"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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

    
%>

       
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="WEB-INF/../default.css" rel="stylesheet" type="text/css" />
        <script language="javascript">
   function validate()
        {
              var fname,lname,pass,cpass,i,cno,eml;
              fname=document.getElementById("text_FName").value;
              lname=document.getElementById("text_LName").value;
              eml= document.getElementById("text_EId").value;
              cno=document.getElementById("text_Cont").value;
              pass=document.getElementById("text_pass").value;
              cpass=document.getElementById("text_cpass").value;
              
              
              if(fname=="")
              {
                  alert("please enter all the fields");
                  document.getElementById("text_FName").focus();
                  return false;
              }
              if(fname!="")
              {
                 for(i=0;i<fname.length;i++)
                 {
                  if(!((fname.charCodeAt(i)>=65&&fname.charCodeAt(i)<=90)||(fname.charCodeAt(i)>=97&&fname.charCodeAt(i)<=122)))
                  {
                      alert("only Character Allowed");
                      document.getElementById("text_FName").focus(); 
                      document.getElementById("text_FName").select();
                      return false;
                  }
                }

             }
            
             if(lname=="")
             {
                  alert("please enter all the fields");
                  document.getElementById("text_LName").focus();
                  return false;
             }
             if(lname!="")
             {
                 for(i=0;i<lname.length;i++)
                 {
                  if(!((lname.charCodeAt(i)>=65&&lname.charCodeAt(i)<=90)||(lname.charCodeAt(i)>=97&&lname.charCodeAt(i)<=122)))
                  {
                      alert("only Character Allowed");
                      document.getElementById("text_LName").focus();
                      document.getElementById("text_LName").select();
                      return false;
                  }
                }

             }
             if(eml=="")
             {
                  alert("please enter all the fields");
                  document.getElementById("text_EId").focus();
                  return false;
             }
            
             if((eml.indexOf('@'))==-1 || (eml.indexOf('.'))==-1)
             {
                  alert("Please Enter valid Email Id");  
                  document.getElementById("text_EId").focus();  
                  document.getElementById("text_EId").select();
                  return false;
             } 
             if(cno=="" )
             {
                  alert("please enter all the fields");
                  document.getElementById("text_Cont").focus();
                  return false;
             }
              if(cno.length!=10 )
             {
                  alert("Contact must be of 10 digit");
                  document.getElementById("text_Cont").focus();
                  return false;
             }
             
             if(cno!="")
             {
               
              for(i=0;i<cno.length;i++)
              {
               if((cno.charCodeAt(i)>=65&&cno.charCodeAt(i)<=90)||(cno.charCodeAt(i)>=97&& cno.charCodeAt(i)<=122))
               {
                  alert("Enter Number Only");
                  document.getElementById("text_Cont").focus();
                  document.getElementById("text_Cont").select();
                  return false;
               }
              }
             }
            if(pass=="")
            {
                  alert("please enter all the fields");
                  document.getElementById("text_pass").focus();
                  return false;
            }
            if(cpass=="")
            {
                  alert("please enter all the fields");
                  document.getElementById("text_cpass").focus();
                  return false;
            }
            if(pass!=cpass)
            {
                alert("Password and Confirm Password Should be Same");
                document.getElementById("text_cpass").focus();
                document.getElementById("text_cpass").select();
                return false;
            }
           
          
            return true;
           
            
        }
        function change(){
             var uid,upass;
              uid=document.getElementById("inputtext1").value;
              uid=document.getElementById("inputtext2").value;
               if(uid=="")
              {
                  alert("please enter all the fields");
                  document.getElementById("inputtext1").focus();
                  return false;
        }
         if(upass=="")
              {
                  alert("please enter all the fields");
                  document.getElementById("inputtext2").focus();
                  return false;
              }
        }
</script>
    </head>
    <body>
        
       
         <div id="logo">
         <h1><a href="index.jsp"><span>IPL 2014 Auction</span></a></h1>
         <h2><a href="jspregister.jsp">Login/Register</span></a></h2>
         </div>
         <div id="splash"><img src="Images/indeximages/IPL-2014-Sold-Player-List-In-IPL-7-.jpg" alt="" width="1000" height="280" /></a></div>
         <div id="menu">
  <ul>
    <li><a href="index.jsp">Home</a></li>
    <li><a href="jspregister.jsp">Register</a></li>
    <li><a href="news.jsp">News</a></li>
    <li><a href="jspteams.jsp">Teams</a></li>
    <li><a href="jspstats.jsp">Stats</a></li>
    <li><a href="videos.jsp">Videos</a></li> 
    <li><a href="photos.jsp">Photos</a></li> 
    <li><a href="about.jsp">About</a></li> 
 </ul>
</div>
<div id="content">
  <div id="main">
    <div id="welcome" class="boxed">
      <h2 class="title">Create Your IPL Account</h2>
      <div class="content">
 
          <form action="jspregister.jsp" method="get">
<div id="text1" style="position:absolute; overflow:hidden; left:500px; top:500px; width:85px; height:21px; z-index:14">
<div class="wpmd">
<div><font face="@Adobe Fan Heiti Std B" class="ws12"><B>First Name</B></font></div>
</div></div>
<input id="text_FName" name="formtext1" type="text" style="position:absolute;width:200px;left:700px;top:495px;z-index:15">


<div id="text2" style="position:absolute; overflow:hidden; left:500px; top:550px; width:85px; height:23px; z-index:16">
<div class="wpmd">
<div><font face="@Adobe Fan Heiti Std B" class="ws12"><B>Last Name</B></font></div>
</div></div>
<input id="text_LName" name="formtext2" type="text" style="position:absolute;width:200px;left:700px;top:545px;z-index:17">



<div id="text17" style="position:absolute; overflow:hidden; left:500px; top:600px; width:102px; height:23px; z-index:28">
<div class="wpmd">
<div><font face="@Adobe Fan Heiti Std B" class="ws12"><B>Email Id</B></font></div>
</div></div>
<input id="text_EId" name="formtext3" type="text" style="position:absolute;width:200px;left:700px;top:595px;z-index:27">

<select name="formselect1" style="position:absolute;left:700px;top:646px;width:200px;z-index:32">
<option value="Male">Male</option>
<option value="Female">Female</option>
</select>
<div id="text11" style="position:absolute; overflow:hidden; left:500px; top:654px; width:69px; height:23px; z-index:18">
<div class="wpmd">
<div><font face="@Adobe Fan Heiti Std B" class="ws12"><B>Gender</B></font></div>
</div></div>

<div id="text14" style="position:absolute; overflow:hidden; left:500px; top:705px; width:88px; height:23px; z-index:19">
<div class="wpmd">
<div><font face="@Adobe Fan Heiti Std B" class="ws12"><B>Contact No</B></font></div>
</div></div>
<input id="text_Cont" name="formtext4" type="text" style="position:absolute;width:200px;left:700px;top:705px;z-index:20">

<div id="text15" style="position:absolute; overflow:hidden; left:500px; top:755px; width:88px; height:23px; z-index:21">
<div class="wpmd">
<div><font face="@Adobe Fan Heiti Std B" class="ws12"><B>Password</B></font></div>
</div></div>
<input id="text_pass" name="formtext5" type="password" style="position:absolute;width:200px;left:700px;top:755px;z-index:22">

<div id="text16" style="position:absolute; overflow:hidden; left:500px; top:805px; width:156px; height:23px; z-index:23">
<div class="wpmd">
<div><font face="@Adobe Fan Heiti Std B" class="ws12"><B>Confirm Password</B></font></div>
</div></div>
<input id="text_cpass" name="formtext6" type="password" style="position:absolute;width:200px;left:700px;top:806px;z-index:24">

<div id="formimage1" style="position:absolute; left:700px; top:860px; z-index:25"><input type="submit" name="submit" value="Submit" onclick="return validate();"></div></form>
<a href="jspregister.jsp"><div id="formimage2" style="position:absolute; left:800px; top:860px; z-index:26"><input type="submit" name="cancel" value="Cancel"></div></a>


      </div>
    </div>
   </div>
  <div id="sidebar">
    <div id="login" class="boxed">
      <h2 class="title">User Account</h2>
      <div class="content">
          <form id="form1" method="get" action="fantasy.jsp">
          <fieldset>
          <legend>Sign-In</legend>
          <label for="inputtext1">User ID:</label>
          <input id="inputtext1" type="text" name="inputtext1">
          <label for="inputtext2">Password:</label>
          <input id="inputtext2" type="password" name="inputtext2">
          <input id="inputsubmit1" type="submit" name="inputsubmit1" value="Sign In"  onclick="return change();">
          <p></p>
          </fieldset>
        </form>
      </div>
    </div>
    <div id="updates" class="boxed">
      <h2 class="title">Recent Updates</h2>
      <div class="content">
        <ul>
          <li>
               <marquee behavior="scroll" direction="left" scrollamount="2">Pepsi IPL ticket sales cross 100,000 mark</marquee>
          </li>
          <li>
              <marquee behaviour="scroll" direction="left" scrollamount="2">Pepsi IPL returns to India on May 2</marquee>
          </li>
          <li>
              <marquee behaviour="scroll" direction="left" scrollamount="2">Details of IPL tickets for UAE matches</marquee>
          </li>
          <li>
              <marquee behaviour="scroll" direction="left" scrollamount="2">UAE buzzing with Pepsi IPL excitement</marquee>
          </li>
          <li>
              <marquee behaviour="scroll" direction="left" scrollamount="2">Gavaskar holds meeting with IPL franchises</marquee>
          </li>
        </ul>
      </div>
    </div>
    <div id="partners" class="boxed">
      <h1 class="title">Partners</h1>
       <div class="content">
       <h2>
           <span>Pepsi</span>
           <span>Etihad Airways</span>
           <span>India Cements</span>
           <span>Reliance</span>
        </h2>
      </div>
    </div>
  </div>
</div>
<div id="footer">
        <div id="footerNav" align="center">
            <div id="footerNavSection" >
                <p>Teams</p>
                <ul>
                     <li><a href="jspteams.jsp">Chennai Super Kings</a></li>
                    <li><a href="jspteams.jsp">Delhi Daredevils</a></li>
                    <li><a href="jspteams.jsp">Kings XI Punjab</a></li>
                    <li><a href="jspteams.jsp">Kolkata Knight Riders</a></li>
                    <li><a href="jspteams.jsp">Mumbai Indians</a></li>
                    <li><a href="jspteams.jsp">Rajasthan Royals</a></li>
                    <li><a href="jspteams.jsp">Royal Challengers Bangalore</a></li>
                    <li><a href="jspteams.jsp">Sunrisers Hyderabad</a></li>
                </ul>
            </div> 
            
            <div id="footerNavSection">
                <p>About</p>
                <ul>    
                     <li>Anti Corruption Policy</li>   
                     <li>Anti Doping Policy</li>   
                     <li>Anti Racism Policy</li>   
                     <li>Clothing Regulations</li>   
                     <li>Code of Conduct for Players</li>   
                     <li>Code of Conduct for Umpires</li>   
                     <li>IPL Committees</li>   
                     <li>Match Playing Conditions</li>   
                </ul>  
            </div><!-- END footerNavSection -->
                        
            <div id="footerNavSection">
                <p>Contact</p>
                <ul>
                    <li>Feedback</li>
                    <li>Marketing</li>
                    <li>Media Accreditation</li>
                    <li>Operations</li>
                    <li>Press / Media</li>
                    <li>Media Handbook</li>
                </ul>
            </div><!-- END footerNavSection -->
            <div id="footerNavSection" align="center">
            <p>&copy; Copyright IPL, BCCI 2014. All Rights reserved.</p>
            <p>Terms and Conditions</p>
            <p>Privacy Policy</p>
            <p><a href="#">Back to top</a></p>			
        </div><!-- END footerNavSection -->
     </div><!-- END footerNav -->
      </div><!-- END footer -->   
</body>
</html>
