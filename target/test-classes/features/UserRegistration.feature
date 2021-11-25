Feature: User Registration
 I want to check that the user can register in our ecommerce website.

Scenario Outline: User Registration
Given The user in the homepage
When  I click on register link
And  I entered "<firstname>","<lastname>","<email>","<password>"
Then  the registration page displayed succesfully

Examples:
|firstname|lastname|email|password|
|ahmed|ibrahim|ahmed@gmail.com| 51234564 |
|khaled|omar|komar@gmail.com|09876543|