Feature: User login gamail

  Scenario Outline: User login bulk of email and passwords
    Given User launch the browser and maximize the window
    When User launch the url of gmail website
    And user give the email in "<Username>" username field
    And user click the login button
    Then user check whether status

    Examples: 
      | Username               |
      | dhanabalan             |
      | dhanabalankd           |
      | dhanabalankd@gmail.com |
