@db_read
Feature: Read_database_data
  Scenario: Read_hotel_reservations
    Given user connects to the database
    #Price =column  table name =HOTELROOM
    #NOTE: column and table name must be accurate
    #SCHEMA has all information about the database .so we use schema to write the correct names
    And user gets "Price" from "tHOTELROOM" table
#    And user gets "Name" from "tHOTEL" table
#    And user gets "Price" from "HOTEL" table
#    And user gets "Notes" from "tHOTELROOMRESERVATION" table

    And user reads all rows in the "Price" column
#  And user reads all rows in the "Name" column
#    And user reads all rows in the "Notes" column
# create a new stepdefinition to do assert for this line
    And users gets the value in row 5 in "Price" column and verifies the value is "470.0000"
