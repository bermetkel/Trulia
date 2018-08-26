Feature: Creating new user
#bermet tupoy

  @test1
  Scenario: Create new account
    Given user is on trulia webpage
    When user clicks on signIn button
    Then registration popup should be displayed 
    And user enters valid email
    And clicks submit button
    Then password popup should be displayed
    And user enters valid password
    And user clicks submit button
    And userpage should be loaded and username should be displayed on right upper corner 


