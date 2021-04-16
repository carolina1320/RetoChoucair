@Regression
Feature: Form automation demo site the user must be able to enter the required data

  Scenario: Successful completion of the Demo Automation form without any errors
    Given that the actor wants to access the web automation demo site
    When he performs the registration on the page
      | full_name | last_name | address | email                  | phone      | password  | confirm_password |
      | carolina  | Vargas    | ninguno | carovargas@hotmail.com | 3012072287 | Cv876542* | Cv876542*        |
    Then he verifies that the screen is loaded with - Double Click ocn Edit Icon to EDIT the Table Row.

