Feature: To test contact form works

Scenario: Check form is validated

Given I am on my zoo website
When I click on the contact link
And populate the contact form
Then I should be on the contact confirmation page