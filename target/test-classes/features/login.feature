Feature: login feature


	@invalidlogin			@Login
  Scenario: verify login with invalid credentials
    Given user launchs shopwitheg application
    When user clicks on login button
    And user enters invalid username and password
    And user clicks on sign in button
    Then verify the error messages
	
	
	@validlogin				@Login
  Scenario: verify login with invalid credentials
    Given user launchs shopwitheg application
    When user clicks on login button
    And user enters valid username and password
    And user clicks on sign in button
    Then verify the user successfully logged in
