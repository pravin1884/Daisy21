Feature: this feature discribes data driven testing in cucumber

Scenario Outline: passing data to gharkin steps

      Given i have a <num1> and <num2>
      
      When i add them 
      
      Then verify if result is prime
      
      
Examples: 
    |row-number|
    |1  |
    |2  |
    |3  |
    |4 |
    |3   |
    |51  |
    |2   |
      
      
      
      
