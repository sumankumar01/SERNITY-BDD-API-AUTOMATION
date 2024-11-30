Feature: reqres api for user

  @green
  Scenario: validating the list of user api
    Given hitting the rest api of user
    When validating the aoi response
    Then validating the api status