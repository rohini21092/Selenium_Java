Feature: Testing Actitime login functionality


Scenario: Test Actitime Application with valid user

Given User Open Actitme application url "https://demo.actitime.com/login.do" in chrome browser
When User enter valid user name and password
And click on login button
Then Actitime homepage should be open
