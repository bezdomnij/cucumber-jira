Feature: Login to Jira
  Everybody wants to log in to Jira

  Scenario: Log in to Jira with valid credentials
    Given I have login credentials and open jira
    When I give username and password
    Then I should be logged in, no problemo

