
  Feature: Homepage test
    @verify_title
    Scenario: Verify page title
      Given User is in 'Myntra' homepage
        Then Title should contains "Myntra"


    @Search_001
     Scenario: Verify Search
       Given User is in 'Myntra' homepage
       When User search for Keyword "Jeans"
       And Click 'Search' button
       Then User should see total number of jeans in Search page
