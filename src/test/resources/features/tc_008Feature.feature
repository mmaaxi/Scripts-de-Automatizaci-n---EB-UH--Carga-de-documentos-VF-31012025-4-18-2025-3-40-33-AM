Feature: Validate document upload field reset after an error

  Scenario: Validate reset of upload field after an error
    Given I am on the document upload page
    When I trigger an error while uploading the document
    Then I should see an error message
    And the upload field should be cleared

  Scenario: Retry document upload
    Given I am on the document upload page
    And the upload field is cleared
    When I attempt to upload the document again
    Then the upload should proceed successfully