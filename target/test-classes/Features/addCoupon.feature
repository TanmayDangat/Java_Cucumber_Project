Feature: Can add coupon code

  @coupon
  Scenario Outline: User can be able to add coupon code
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
    Then user enters the coupon code as "<coupon>" to get Rs. Fifty off on total
    Then user clicks on apply coupon button
    Then user clicks on link which navigates to proceed to checkout page
    Then user close the browser

    Examples: 
      | coupon          |
      | krishnasakinala |