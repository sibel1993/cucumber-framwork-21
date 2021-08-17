
@google_search @smoke
Feature:Search Functionality
  Background: User is on the google home page
    Given user in on the google page
  Scenario: TC01_Iphone Search
#    Given user in on the google page
    When user search for iPhone
    Then  verify the result has iPhone
    Then close the application

#    right click on test -> new directory->reosurces
#    right click on resorces-> new directory->features
#    right click on feATURES->new file->first _feature_ file.feature

  #to crete another screrio use sceranio:keyword again
  Scenario: TC02_tea pot Search
#   // Given user in on the google page
    And user search for tea pot
    Then  verify the result has tea pot
    Then close the application
     #    To create another scenario use Scenario : keyword again
  Scenario: TC03_flower Search
#    Given user in on the google page
    And user search for flower
    Then verify the result has flower
    Then close the application



