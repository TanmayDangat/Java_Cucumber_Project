Feature: Image arrivals navigation

	@imgNav
  Scenario: Images in the home page should navigate
    Given user launch the browser
    Then opens the URL "https://practice.automationtesting.in/"
    Then clicks on shop menu
    Then click on home menu
    Then tests whether home page has three arrivals only
    Then click on the image in the arrivals
    Then user should be navigated to the next page where the user can add that book in the basket
    Then user close the browser
