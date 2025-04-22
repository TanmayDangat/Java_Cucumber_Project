Feature: Sliders

	@slide
  Scenario: Validate whether the home page is having three sliders only
    Given user launch the browser
    Then opens the URL "https://practice.automationtesting.in/"
    Then clicks on shop menu
    Then click on home menu
    Then tests whether home page has three sliders only
    Then click on the slider
    Then user close the browser

	