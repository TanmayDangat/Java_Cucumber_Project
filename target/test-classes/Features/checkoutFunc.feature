Feature: checkout functionality

	@checkoutFunc
  Scenario: User can navigate to chechout page
    Given user launch the browser
    Then opens the URL "https://practice.automationtesting.in/"
    Then clicks on shop menu
    Then click on home menu
    Then tests whether home page has three arrivals only
    Then click on the image in the arrivals
    Then user should be navigated to the next page where the user can add that book in the basket
    Then user clicks on add to basket button
    Then user clicks on view basket button
    Then user should be able to view that Book in the Menu item with price
    Then user verifies whether the total always < subtotal because taxes are added in the subtotal
    Then user clicks on checkout button
    Then user close the browser
