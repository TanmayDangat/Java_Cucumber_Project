Feature: Image description

	@imgDesc
  Scenario: Description of the image should be visible
    Given user launch the browser
    Then opens the URL "https://practice.automationtesting.in/"
    Then clicks on shop menu
    Then click on home menu
    Then tests whether home page has three arrivals only
    Then click on the image in the arrivals
    Then user should be navigated to the next page where the user can add that book in the basket
    Then user clicks on the description tab
    Then user should be able to see the description regarding the book
    Then user close the browser
