Feature: buy Physics book
Scenario: a user is must be able to buy book in amazon
Given a user is in home page of amazon
When Type 'physics books' in the search box and then select 3rd option from the drop-down
And select fourstars & up rating
And  select  first book
And  Click 'Add to Cart' button
And Verify the text - 'Added to Cart' is displayed
And click on Go to cart
And Click on 'Proceed to Buy' button
Then Verify user is on the Sign in page he able to purchase the book successfully



