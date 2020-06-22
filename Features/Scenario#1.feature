@PROJ-01
Feature:
	We need a login screen for authenticated the user that want to use the web site features.
  @Login
  Scenario: TC- Validate the authentication of a valid user.
    Given On Browser I access demo web
    When I click on login icon locate at menu screen
    And Put the credentials
    And We click button login
    Then We reach the home page of a signed user

  Scenario: TC- Validate system deny login of a invalid user.
    Given On Browser I access demo web
    When I click on login icon locate at menu screen
    And Put user invalid credentials
    And We click button login
    Then System show message of invalid user