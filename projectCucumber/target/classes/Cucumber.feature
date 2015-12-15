 
 Feature: Login
As a user 
I want to loginto orange HRM
so that i can access the HRM application


 
Scenario: Leave Type 
Given After Login
Given I am should be on leave entitlement and usage report page
When I enter leave type"FMLA US " for all the Job Title
And In all the location
Then I should see the usage entitlement table

 