Feature: site login Feature

Scenario: user able to login to akamai

Given user is on site page
Then title of the page is akamai
Then  user enters username
Then user enters password 
Then user click on submit button
Then user validates title page is Home
Then close browser