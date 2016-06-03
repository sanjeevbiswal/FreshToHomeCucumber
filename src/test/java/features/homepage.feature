
  Feature: Homepage test
    @verify_title
    Scenario: Verify page title
      Given User is in 'Myntra' homepage
        Then Title should contains "Myntra"


    @Search_001
     Scenario Outline: Verify Search
       Given User is in 'Myntra' homepage
       When User search for Keyword "<Item>"
       And Click 'Search' button
       Then User should see only "<Item>" in Search page

      Examples:
      |Item|
      |Jeans|
      |Kurtis|
      |Salwars|