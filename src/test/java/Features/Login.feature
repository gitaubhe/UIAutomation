Feature: Application login

Scenario: Application login validation
Given initialize the browser with chrome
And navigate to QAClickAcademy site
And click on login link in home page 
When enter username as "test99@gmail.com" and password as "123456"
Then verify that user is successfully login

