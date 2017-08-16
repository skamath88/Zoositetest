Feature: Adopt an animal from the zoo site

@Smoke
Scenario: Adopt an animal
Given I am on the home page of Zoo site
When I goto Adoption page and check for unavailability
Then I should see the error message "sorry, animal not available"