Feature: feature to test if counter in my preference page match counter in lauching preference page

Scenario: check if counter in my preference page match counter in lauching preference page
    Given user click on preference
    And user select lauching preference
		And user select lauch preference activity button
   	And user compare the count in lauching preference page with lauch preference activity page
   	And user click on my preference to increase the count 121
   