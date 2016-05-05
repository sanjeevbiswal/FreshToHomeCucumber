@HomepageTest_001
  Feature: Homepage test
    @HomepageTest_verify
    Scenario: Verify page title
      Given User is in homepage
      Then Title should contains "FreshToHome"
