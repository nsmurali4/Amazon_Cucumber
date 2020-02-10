Feature: Login to Amazon.comn 
    
  Scenario Outline: Adding products in to cart
  
  	Given User launch chrome browser and start the application
    When User entered valid "<username>" and valid "<password>"      
    Then User entered into the home page successfully
    Then User entered "<productname>" in the search box and clicks the search button
    Then User selected the first product in the list
		Then User clicked Add to Cart button
		Then User verified the product added in to cart
		Then User clicked Proceed to checkout button
  
Examples:
| username	 |	password		 | productname 			|
| 9940293215 | amazonyliani4 | redmi note 8 pro |