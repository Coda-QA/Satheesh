Feature: Lookup a Gobigo page
  
  Scenario: Book the destitnation
    Given userwant to seach bus
    When serach palce from 'Chennai'
    And serach palce from 'dhli'
    And Set a depature time
    Then get the result
