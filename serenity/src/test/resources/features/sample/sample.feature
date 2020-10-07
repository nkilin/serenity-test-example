@sample
Feature: Sample feature of the automation framework
  As a user of Google
  I want to search for a word
  So that I am shown search results

  Background: user is on Google
    Given user is on Google

  Scenario: Sample scenario of the automation framework
    When user searches for word 'test'
    Then search results are returned