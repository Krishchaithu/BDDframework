Feature: site login Feature

Scenario: 1 user able to login to a website with correct credentials

Given user is on site page
Then title of the page is akamai
Then  user enters username
Then user enters password 
Then user click on submit button
Then user validates title page is Home
Then close browser

Scenario: 2 user not able to login to a website with incorrect credentials
Given user is on site page
Then title of the page is akamai
Then  user enters username
Then user enters password 
Then user click on submit button
Then user validates title page is Home
Then close browser
