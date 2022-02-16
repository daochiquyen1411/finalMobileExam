Feature: feature to test if new message show correctly after click LogTextBox add function

Scenario: check if after click LogTextBox add function show message corrrectly
    Given user click on text button
    And user click LogTextBox button
		And user click on add button
		Then user should see the message