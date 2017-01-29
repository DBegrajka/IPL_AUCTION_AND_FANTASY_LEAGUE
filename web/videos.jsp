<%-- 
    Document   : videos
    Created on : Apr 18, 2014, 12:23:55 AM
    Author     : dev jat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="WEB-INF/../default3.css" rel="stylesheet" type="text/css" />
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
    <div id="welcome" class="boxed" onload="setTimeout('nextPic()',2000)">
      <h1 align="center">Watchout Videos</h1>
      <img src="Images/indeximages/Dharamshala-Cricket-Stadium.jpg" width="450" height="400">
      <img src="Images/photosjsp/19191.jpg" width="450" height="400">
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
