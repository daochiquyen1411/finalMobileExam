Feature: feature to test if 4 "ab" string items display correctly in View/Search/Filter

Scenario: check if 4 "ab" string iteams display correctly
    Given user click on view button
    And user select search view
    And user select filter
		And user type Ab in textbox filter
		Then user should see 4 items