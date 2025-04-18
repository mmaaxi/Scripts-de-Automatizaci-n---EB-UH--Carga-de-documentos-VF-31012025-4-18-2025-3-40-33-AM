Feature: Validate error message on unstable network

  Scenario: Display error message when network is unstable
    Given I navigate to the application
    When I simulate an unstable network
    Then I should see an error message related to network connection

  Scenario: Retry loading document on stable network
    Given I see an error message related to network connection
    When I stabilize the network and retry loading the document
    Then the document should load successfully