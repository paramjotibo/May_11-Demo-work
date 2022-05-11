Feature: Credit Application

Scenario: Checking credit options

Given Browser is initiated
When user hovers on credit option
And clicks on improve credit score
When user clicks on how to improve score
Then Credit card tab is populated

@RegTest
Scenario: Credit card options

Given Browser is initiated
When user hovers on credit option
And clicks on view all credit cards
Then new webpage pops up
And user selects Cash back option
And user selects first option
And user click option1
And user selects second option
And user click on add option2
Then user selects third option
Then user selects compare



