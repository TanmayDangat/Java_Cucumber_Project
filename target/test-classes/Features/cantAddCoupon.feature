Feature: Cant add coupon code
	
	@cantAddCoupon
  Scenario Outline: User cannot be able to add coupon code
    Given user launch the browser
    Then opens the URL "https://practice.automationtesting.in/"
    Then clicks on shop menu
    Then click on home menu
    Then tests whether home page has three arrivals only
    Then click on the image in the arrivals whose price is less than five hundred
    Then user should be navigated to the next page where the user can add that book in the basket with another book
    Then user clicks on add to basket button
    Then user clicks on view basket button
    Then user should be able to view that Book in the Menu item with price
    Then user enters the coupon code as "<coupon>" to get Rs. Fifty off on total
    Then user clicks on apply coupon button
    Then user gets a warning "<warning>" that the coupon is applicable for the book price > fout hundred fifty rps
    Then user close the browser

    Examples: 
      | coupon          | warning                                       |
      | krishnasakinala | The minimum spend for this coupon is ₹450.00. |
