Feature: Login to account
	Existing stackoverflow user should be able to login into account using correct credentials
	
Scenario: Login into account with correct details
	Given User navigates to stackoverflow website 
	And User clicks on the login button on homepage
	Then User should be taken to the login window  