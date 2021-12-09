Feature: This feature discribes parameterization in cucumber 

Scenario: Passing single numeric parameters to gherkin steps

Given i have 14 and 45
When i make sum of  them
Then print result

Scenario: Passing String parameters to gherkin steps

Given I have "India" and "China"
Then  print them in alphabeatical order	

Scenario: passing list parameters to gherkin steps
Given i have following list
   |10|
   |12|
   |15|
   |16|
   |17|
   |108|
   |19|
Then i print it

Scenario: passing table parameters to gherkin steps
Given i have following table
 |first|12|10|14|16|17|
 |second|16|19|18|23|43|
 Then i print table



