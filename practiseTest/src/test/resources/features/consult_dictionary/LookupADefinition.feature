Feature: start a Bus booking
  

  Scenario: Start Bus Booking
    Given Search bus for given palce
    When Starting area is 'Chennai'
    And Destination area is 'Dehli'
    And Depature Time Set
    Then Get a a list from the screen

  