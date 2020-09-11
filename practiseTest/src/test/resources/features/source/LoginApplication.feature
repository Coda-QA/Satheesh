Feature: Login To Guvi application
 
  Scenario: Login with valid creadential
    Given the user is on the Guvi home page
    When user enter "smarteye9626@gmail.com" as username
    And user enter "satheesh123" as password
    Then they should able to login
  
  