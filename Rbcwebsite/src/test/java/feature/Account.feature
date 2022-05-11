Feature: Account options

@RegTest
Scenario: Checking chequing link
Given user is on homepage
And user hovers on Account option
When user click on chequing option
Then Chequing tab is open

@SmokeTest
Scenario: checking savings link
Given user is on homepage
And user hovers on Account option
When user click on Savings option
Then Savings tab is open

@SmokeTest
Scenario: Enter location
Given user is on homepage
And user hovers on Account option
When user click on Savings option
Then Savings tab is open
When user clicks on branch button
And Enters the postal code
And Clicks on Search
Then location tab opens up

@RegTest
Scenario: Link check
Given user is on homepage
And user hovers on Account option
When user click on Savings option
Then Savings tab is open
When user clicks on compare accounts
Then New tab is populated