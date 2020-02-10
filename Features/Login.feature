  Feature: Login to Amazon.comn 
    
  Scenario Outline: Login successful with valid credentials
  
  	Given User launch chrome browser and start the application
    When User entered valid "<username>" and valid "<password>"      
    Then User entered into the home page successfully

  
Examples:
| username	 |	password		 |
| 9940293215 | amazonyliani4 |