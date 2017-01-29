<%-- 
    Document   : index
    Created on : Apr 3, 2014, 9:44:12 PM
    Author     : dev jat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="WEB-INF/../default2.css" rel="stylesheet" type="text/css" />
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js">
</script>
 
        <script language="javascript" type="text/javascript">
            function slider()
            {
                var $ftm = 3000;
                var $fotm = 1000;
                function slides()
                {
                    return $('#welcome').find('img');
                }
                slides().first().fadeIn($ftm);
                slides().first().addClass('active');
                $interval = setInterval(
                function()
                {
                    var $i = $('#welcome').find('img.active').index();
                    slides().eq($i).fadeOut(0);
                    slides().eq($i).removeClass('active');
                    if(slides().length == $i + 1)
                        {
                            $i= -1;
                        }
                    slides().eq($i + 1).fadeIn($ftm);
                    slides().eq($i + 1).addClass('active');
                },$fotm+$ftm
            );
            }
        </script>

    </head>
    <body onload="slider()">
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
    <div id="welcome" align="center">
    <img src="Images/indeximages/24424.jpg" width="800" height="500" style="display: none;">
    <img src="Images/indeximages/Dharamshala-Cricket-Stadium.jpg" width="800" height="500"  style="display: none;">
    <img src="Images/indeximages/Eden_gardens_ipl_2011.jpg" width="800" height="500" style="display: none;">
    <img src="Images/indeximages/IPL 4 (21).jpg" width="800" height="500" style="display: none;">
    </div>
<div id="footer">
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
      </div><!-- END footer -->
    </body>
</html>
