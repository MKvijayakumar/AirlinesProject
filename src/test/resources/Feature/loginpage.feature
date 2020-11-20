Feature:  Check the Airlines Page
Scenario Outline: chk the login page
Given User is on Login Page
And   Enter the "<Username>" and "<Password>"
When  Click the login button	
Then  User is navigate on home page

Examples:
   |Username|Password|
   |Vijay M | Kumar  |
   |Praveen | Kitcha |
   
Scenario: check the login page
Given User is Login Page
And   Enter the valid Username and Password
|Lochan|Keerthika|	
Then  User is navigate home page  

Scenario: chk the login page
Given User is on Login URL
And   Enter the invalid Username and Password	
Then  User is on navigate  home page  

