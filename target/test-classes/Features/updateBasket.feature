Feature: Update basket

	@updateBasket
  Scenario: User can add update the basket
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
    Then user clicks on textbox value under quantity to add or subtract books
    Then user checks after the above change ‘Update Basket’ button will turn into Clickable mode
    Then user clicks on update basket button to reflect the changes
    Then user close the browser
