Feature: feature to check if checkbox is checked after one click

Scenario: checkbox reference checked after click
    Given user select preference   
    And user select preference from XML
    And user check on Checkbox Preference
		Then checkbox should be checked