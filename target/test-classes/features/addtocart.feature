Feature: login feature

  Scenario: verify personal information is verified
    Given user launchs shopwitheg application
    When user clicks on login button
    And user enters invalid username and password
    And user clicks on sign in button
    Then user clicks on men
	  And user select the product
	  And user select size
	  And user select colour
	  Then user clicks add to cart
	  Then verify product is added successfully