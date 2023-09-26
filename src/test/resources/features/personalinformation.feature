Feature: login feature

  Scenario: verify login with invalid credentials
    Given user launchs shopwitheg application
    When user clicks on login button
    And user enters invalid username and password
    And user clicks on sign in button
    Given user launches shopwitheg personal information page
	  And user changes first name		
		And user changes second name 
		Then user changes email
		And user clicks on save changes
		Then verify success message

 
