Feature: Login into Application
 
 Scenario Outline: Positive test validating login
Given Intililize the browser with chrome
And  Navigate to "http://www.qaclickacademy.com/"  site
And  Click on login link in home page to land on sign in page
When User enters <username> and  <password> and log in
Then Verify that user login successfully
And Close browsers

Examples: 
|username                |password     |
|anasssattis@gmail.com   |Amro@2015        |

