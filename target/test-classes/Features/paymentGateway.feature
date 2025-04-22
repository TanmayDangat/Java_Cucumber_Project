Feature: Payment gateway

  @paymentGateway
  Scenario Outline: User can proceed to payment
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
    Then user can view Billing Details, Order Details, Additional details
    Then user clicks on add coupon code link and add coupon "<coupon>"
    Then user can enter name "<name>", lastname "<lastname>", company name "companyName", email addredd "<email>", phone number "<phNumber>"
    Then select country as "<country>"
    Then user can enter address as "<address>", apartment number as "<aptNum>", city as "<city>"
    Then user select state as "<state>", enter pincode as "<pincode>"
    Then user clicks on cash on delivery
    Then user close the browser

    Examples: 
      | name  | lastname | companyName | email          | phNumber   | country            | address   | aptNum | city | state   | pincode | coupon          |
      | Rahul | Patil    | TCS         | rahul@demo.com | 1234567890 | United States (US) | West Road |     12 | Pune | Alabama |   30000 | krishnasakinala |
