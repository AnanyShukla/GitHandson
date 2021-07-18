Feature: To Verify Valid Registration on Basic Contact Form
	Scenario: Registration with valid data
		Given User is on Basic Contact Form Page
		When User clicks on click here link
		And User enters valid name and email
		| abc | abcxyz@gmail.com |
		And User fill other details
		Then User clicks the Submit button
	