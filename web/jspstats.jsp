<%-- 
    Document   : jspstats
    Created on : Apr 4, 2014, 4:12:47 PM
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
      <h1>2008-2013 STANDINGS</h1>
      <table id="table" style="width:600px">
          <tr>
              <th>Team</th>
              <th>Matches</th>
              <th>Won</th>
              <th>Lost</th>
              <th>Tied</th>
              <th>N/R</th>
              <th>Success Rate</th>
          </tr>
          <tr align="center">
              <td>CSK</td>
              <td>99</td>
              <td>58</td>
              <td>39</td>
              <td>0</td>
              <td>2</td>
              <td>58.58%</td>
          </tr>
           <tr align="center">
              <td>MI</td>
              <td>96</td>
              <td>56</td>
              <td>39</td>
              <td>0</td>
              <td>1</td>
              <td>58.94%</td>
          </tr>
           <tr align="center">
              <td>DD</td>
              <td>81</td>
              <td>41</td>
              <td>40</td>
              <td>0</td>
              <td>2</td>
              <td>51.90%</td>
          </tr>
           <tr align="center">
              <td>RCB</td>
              <td>91</td>
              <td>46</td>
              <td>42</td>
              <td>0</td>
              <td>2</td>
              <td>50.54%</td>
          </tr>
           <tr align="center">
              <td>RR</td>
              <td>88</td>
              <td>46</td>
              <td>40</td>
              <td>0</td>
              <td>2</td>
              <td>54.54%</td>
          </tr>
           <tr align="center">
              <td>KXIP</td>
              <td>89</td>
              <td>44</td>
              <td>45</td>
              <td>0</td>
              <td>0</td>
              <td>49.72%</td>
          </tr>
           <tr align="center">
              <td>KKR</td>
              <td>88</td>
              <td>42</td>
              <td>45</td>
              <td>1</td>
              <td>0</td>
              <td>49.36%</td>
          </tr>
           <tr align="center">
              <td>SRH</td>
              <td>17</td>
              <td>10</td>
              <td>7</td>
              <td>0</td>
              <td>0</td>
              <td>58.82%</td>
          </tr>
      </table>
      
      <h1>Most Runs</h1>
       <table id="table" style="width:600px">
          <tr>
              <th>Player</th>
              <th>Span</th>
              <th>Matches</th>
              <th>Runs</th>
              <th>HS</th>
              <th>Avg</th>
              <th>SR</th>
              <th>100/50</th>
          </tr>
          <tr align="center">
              <td>Suresh Raina</td>
              <td>2008-2013</td>
              <td>99</td>
              <td>2802</td>
              <td>100*</td>
              <td>35.02</td>
              <td>141.37</td>
              <td>1/18</td>
          </tr>
          <tr align="center">
              <td>Rohit Sharma</td>
              <td>2008-2013</td>
              <td>97</td>
              <td>2513</td>
              <td>109*</td>
              <td>32.63</td>
              <td>129.66</td>
              <td>1/18</td>
          </tr>
          <tr align="center">
              <td>Chris Gayle</td>
              <td>2009-2013</td>
              <td>59</td>
              <td>2512</td>
              <td>175*</td>
              <td>52.33</td>
              <td>160.20</td>
              <td>4/16</td>
          </tr>
          <tr align="center">
              <td>Gautam Gambhir</td>
              <td>2008-2013</td>
              <td>88</td>
              <td>2471</td>
              <td>93</td>
              <td>31.67</td>
              <td>127.04</td>
              <td>0/20</td>
          </tr>
          <tr align="center">
              <td>Sachin Tendulkar</td>
              <td>2008-2013</td>
              <td>78</td>
              <td>2334</td>
              <td>100*</td>
              <td>34.83</td>
              <td>119.81</td>
              <td>1/13</td>
          </tr>
          <tr align="center">
              <td>Jacques Kallis</td>
              <td>2008-2013</td>
              <td>90</td>
              <td>2276</td>
              <td>89*</td>
              <td>28.81</td>
              <td>108.74</td>
              <td>0/16</td>
          </tr>
          <tr align="center">
              <td>Virat Kohli</td>
              <td>2008-2013</td>
              <td>93</td>
              <td>2273</td>
              <td>99</td>
              <td>31.56</td>
              <td>124.13</td>
              <td>0/14</td>
          </tr>
          <tr align="center">
              <td>Mahendra Singh Dhoni</td>
              <td>2008-2013</td>
              <td>96</td>
              <td>2243</td>
              <td>70*</td>
              <td>38.01</td>
              <td>141.15</td>
              <td>0/13</td>
          </tr>
          <tr align="center">
              <td>Virendra Sehwag</td>
              <td>2008-2013</td>
              <td>79</td>
              <td>2174</td>
              <td>119</td>
              <td>29.37</td>
              <td>160.32</td>
              <td>1/15</td>
          </tr>
       </table>
      
      <h1>Most Wickets</h1>
       <table id="table" style="width:600px">
          <tr>
              <th>Player</th>
              <th>Span</th>
              <th>Matches</th>
              <th>Wickets</th>
              <th>BF</th>
              <th>Avg</th>
              <th>Econ</th>
              <th>4/5</th>
          </tr>
          <tr>
              <td>Lasith Malinga</td>
              <td>2009-2013</td>
              <td>73</td>
              <td>103</td>
              <td>5/13</td>
              <td>17.95</td>
              <td>6.54</td>
              <td>2/1</td>
         </div> </tr>
        <tr>
              <td>Amit Mishra</td>
              <td>2008-2013</td>
              <td>76</td>
              <td>95</td>
              <td>5/17</td>
              <td>20.25</td>
              <td>6.93</td>
              <td>2/1</td>
          </tr>
      <tr>
              <td>Rudra Pratap Singh</td>
              <td>2008-2013</td>
              <td>78</td>
              <td>87</td>
              <td>4/22</td>
              <td>25.59</td>
              <td>7.84</td>
              <td>2/0</td>
          </tr>
          <tr>
              <td>Pragyan Ojha</td>
              <td>2008-2013</td>
              <td>79</td>
              <td>85</td>
              <td>3/11</td>
              <td>2.69</td>
              <td>7.18</td>
              <td>0/0</td>
          </tr>
          <tr>
              <td>Vinay Kumar</td>
              <td>2008-2013</td>
              <td>77</td>
              <td>84</td>
              <td>4/40</td>
              <td>25.67</td>
              <td>8.22</td>
              <td>1/0</td>
          </tr>
          <tr>
              <td>Piyush Chawla</td>
              <td>2008-2013</td>
              <td>87</td>
              <td>84</td>
              <td>4/17</td>
              <td>26.63</td>
              <td>7.52</td>
              <td>1/0</td>
          </tr>
          <tr>
              <td>Dwayne Bravo</td>
              <td>2008-2013</td>
              <td>73</td>
              <td>79</td>
              <td>4/42</td>
              <td>23.32</td>
              <td>8.05</td>
              <td>1/0</td>
          </tr>
          <tr>
              <td>Dale Steyn</td>
              <td>2008-2013</td>
              <td>69</td>
              <td>78</td>
              <td>3/8</td>
              <td>21.64</td>
              <td>6.34</td>
              <td>0/0</td>
          </tr>
          <tr>
              <td>Harbhajan Singh</td>
              <td>2008-2013</td>
              <td>82</td>
              <td>78</td>
              <td>5/18</td>
              <td>24.67</td>
              <td>6.76</td>
              <td>1/1</td>
          </tr>
</table>
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
