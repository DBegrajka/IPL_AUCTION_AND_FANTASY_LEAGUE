<%-- 
    Document   : jspteams
    Created on : Apr 4, 2014, 12:21:27 AM
    Author     : dev jat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="WEB-INF/../default2.css" rel="stylesheet" type="text/css" />
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
    <div id="container" class="boxed">
      <h1 align="center">TEAMS</h1>
        
        
      <table>
          <tr><td><h2>Chennai Super Kings</h2>
                  <a href="csk.jsp"><img src="Images/Teamsimages/Chennai Super Kings Logo Wallpaper 72.jpg"  width="400" height="300"></a></td>
              <td><h2>Delhi Daredevils</h2>
                    <img src="Images/Teamsimages/Delhi_Daredevils_Logo.jpg" width="400" height="300"></td></tr>
          <tr><td><h2>Kings XI Punjab</h2>
                  <img src="Images/Teamsimages/Kings-XI-Punjab-Logo-Wallpaper-2013.jpg" width="400" height="300"></td>
              <td><h2>Kolkata Knight Riders</h2>
                  <img src="Images/Teamsimages/kkr-kolkata-knight-riders-new-logo-154176.jpg" width="400" height="300"></td></tr>
          <tr><td><h2>Mumbai Indians</h2>
                    <img src="Images/Teamsimages/IPL 6-Mumbai Indians-Pardaphash-80422.jpg" width="400" height="300"></td>
              <td><h2>Rajasthan Royals</h2>
                  <img src="Images/Teamsimages/rrlogo_with_whiteborder.jpg" width="400" height="300"></td></tr>
          <tr><td><h2>Royal Challengers Bangalore</h2>
              <img src="Images/Teamsimages/n62osyi37att9b7y_D0_rcb_logo.jpg" width="400" height="300"></td>
              <td><h2>Sunrisers Hyderabad</h2>
                  <img src="Images/Teamsimages/Sunrisers_Hyderabad.jpg" width="400" height="300"></td></tr>               
      </table>
             
</div>
    </div>
  
<div id="footer">
        <div id="footerNav" align="center">
            <div id="footerNavSection" >
                <p>Teams</p>
                <ul>
                    <li><a href="/teams/chennai-super-kings">Chennai Super Kings</a></li>
                    <li><a href="/teams/delhi-daredevils">Delhi Daredevils</a></li>
                    <li><a href="/teams/kings-xi-punjab">Kings XI Punjab</a></li>
                    <li><a href="/teams/kolkata-knight-riders">Kolkata Knight Riders</a></li>
                    <li><a href="/teams/mumbai-indians">Mumbai Indians</a></li>
                    <li><a href="/teams/rajasthan-royals">Rajasthan Royals</a></li>
                    <li><a href="/teams/royal-challengers-bangalore">Royal Challengers Bangalore</a></li>
                    <li><a href="/teams/sunrisers-hyderabad">Sunrisers Hyderabad</a></li>
                </ul>
            </div> 
            
            <div id="footerNavSection">
                <p>About</p>
                <ul>    
                     <li><a href="/about/2014/anti-corruption-policy">Anti Corruption Policy</a></li>   
                     <li><a href="/about/2014/anti-doping-policy">Anti Doping Policy</a></li>   
                     <li><a href="/about/2014/anti-racism-policy">Anti Racism Policy</a></li>   
                     <li><a href="/about/2014/clothing-regulations">Clothing Regulations</a></li>   
                     <li><a href="/about/2014/code-of-conduct-for-players">Code of Conduct for Players</a></li>   
                     <li><a href="/about/2014/code-of-conduct-for-umpires">Code of Conduct for Umpires</a></li>   
                     <li><a href="/about/2014/ipl-committees">IPL Committees</a></li>   
                     <li><a href="/about/2014/match-playing-conditions">Match Playing Conditions</a></li>   
                </ul>  
            </div><!-- END footerNavSection -->
                        
            <div id="footerNavSection">
                <p>Contact</p>
                <ul>
                    <li><a href="/about/contact/0">Feedback</a></li>
                    <li><a href="/about/contact/1">Marketing</a></li>
                    <li><a href="http://media.iplt20.com">Media Accreditation</a></li>
                    <li><a href="/about/contact/2">Operations</a></li>
                    <li><a href="/about/contact/3">Press / Media</a></li>
                    <li><a href="http://www.iplt20.com/mediahandbook">Media Handbook</a></li>
                </ul>
            </div><!-- END footerNavSection -->
            <div id="footerNavSection" align="center">
            <p>&copy; Copyright IPL, BCCI 2014. All Rights reserved.</p>
            <p><a href="/about/2014/terms-and-conditions">Terms and Conditions</a></p>
            <p><a href="/about/2014/privacy-policy">Privacy Policy</a></p>
            <p><a href="#">Back to top</a></p>			
        </div><!-- END footerNavSection -->
     </div><!-- END footerNav -->
      </div><!-- END footer --> 
</body>
</html>
