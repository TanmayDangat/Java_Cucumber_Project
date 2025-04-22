Feature: Arrivals
	
	@arrive
  Scenario: Validate whether the home page is having three arrivals only
    Given user launch the browser
    Then opens the URL "https://practice.automationtesting.in/"
    Then clicks on shop menu
    Then click on home menu
    Then tests whether home page has three arrivals only
    Then user close the browser
