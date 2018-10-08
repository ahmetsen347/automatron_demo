Feature: Automatron Test Suite Scenarios

  Scenario: Successfully Login on Login Popup 1
    When user opens signin page see login button 1
    When user clicks login button a login popup should opens 1
    And  user enters email to "deneme" and password to "sifre" 1
    And  clicks login button 1
    Then user successfuly logged in and see main page 1

  Scenario: Close Login Popup
    Given user clicks login popup close button