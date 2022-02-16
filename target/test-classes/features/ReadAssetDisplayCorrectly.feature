Feature: feature to test if content of Read asset displays correctly

Scenario: check the Read asset displays correctly
    Given user open API demo app   
    And user click content button
		And user click asset button
   	And user click read asset button
   	Then user will see the read asset content display correctly