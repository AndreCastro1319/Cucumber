Feature: Review for students batch 11

  Background:
    Given user is navigated to mercury tours application

  @regression
  Scenario: Login scenario for registering on mercury tours
    When user enters values for registering the user
    And user clicks on submit button
    Then user is able to see message successful registration

    @smoke
    Scenario Outline: Registering user with examples table
      When user enters "<firstName>" "<lastName>" "<phone>" "<email>" "<address>" "<city>" "<state>" "<postalcode>" "<username>" "<country>" "<password>" "<confirmpassword>"   for registering the user
      And user clicks on submit button
      Then user is able to see message successful registration
      Examples:
      |firstName|lastName|phone|email|address|city|state|postalcode|username|country|password|confirmpassword|
      |jimmy     |hasim   |123456|test@123.com|brooklyn|wayne|PA|01416|test123|NIUE  |Test123 |Test123        |
      |mateo     |hasim1   |1234567|test@1234.com|brooklyn|wayne|PA|01416|test123|NIUE  |Test123 |Test123        |
      |seba     |hasim2   |1234567|test@1235.com|brooklyn|wayne|PA|01416|test123|NIUE  |Test123 |Test123        |
      |caro     |hasim3   |1234569|test@1236.com|brooklyn|wayne|PA|01416|test123|NIUE  |Test123 |Test123        |