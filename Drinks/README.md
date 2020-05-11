# Drinks Project
***
This project was adapted by Rosa Steinkellner and Nina Waldner.  
#### The original Project contained 4 classes: 
- Drink.java
- Liquid.java
- LiquidTest.java
- SimpleDrinks.java
***
#### We have added the following extension:
- ###### Cocktail.java
This class extends Drink.java and has some additional functionality:
- the variables: 
    - a decorational item
    - a list of ingredients stored in a hashmap
    - getters and setters for all variables
<br>
- the goingHome method:  
    - an exception (DoNotDriveHomeException) is thrown when the alcohol percentage of a cocktail exceeds a certain limit  

#### Unit Testing  
We created two unit test files inspired by LiquidTest.java to achieve 100% test coverage for the classes SimpleDrink and Cocktail: 
- ###### SimpleDrinkTest.java
This class tests the functionality of the constructor, the getters for volume and alcohol percent of a simple drink, as well as the query if the drink is alcoholic.  
<br>
- ###### CocktailTest.java  
This class tests the functionality of the constructor, the getters for volume and alcohol percent of a cocktail, as well as the query if the cocktail is alcoholic. 
In addition the getters and setters for decoration and ingredients are tested. Last but not least the important question if someone is sober enough to drive (goingHome method) and this methods' exception are tested. 