Feature: Login

  #Scenario Outline: Successful login
    #When user opens signin page see login button
    #When user clicks login button a login popup should opens
    #And  user enters <email> and <password> with data below
    #And  clicks login button
    #Then user successfuly logged in and see main page
      #Examples:
        #|email|password|
        #|deneme|sifre|


  Scenario: Successful login
    When user opens signin page see login button
    When user clicks login button a login popup should opens
    And  user enters email to "deneme" and password to "sifre"
    And  clicks login button
    Then user successfuly logged in and see main page