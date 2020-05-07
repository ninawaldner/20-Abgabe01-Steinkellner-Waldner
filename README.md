## 20-Abgabe01-Steinkellner-Waldner

This is a project created by *Rosa Steinkellner* and *Nina Waldner*

The purpose of this project is to get familiar with JavaDoc, Github and Junit-testing.
An existing Java-Project named "Drinks" will be extended.
The project "Drinks" already contains:
- Drink.java (abstract class)
- Liquid.java
- LiquidTest.java
- SimpleDrinks.java (extends class Drink.java)

All classes contain constructors, getters & setters and JavaDoc. 
Tests using JUnit 5 are also already implemented.
******
#### ***Planned Extensions:***

1. *Ideas for Subclasses* 
    >Cocktail.java: inherits from class Drink.java
    FizzyDrinks.java: inherits from class SimpleDrinks.java
    Smoothies.java: inherits from class SimpleDrinks.java
    DarryDrinks.java: inherits from class SimpleDrinks.java
    BeerMixDrinks.java: inherits from class Drinks.java
2. *Exception*
3. *Collections*<br/> List of ingredients
***
#### ***Next version***

Decision for Subclass:  <strong>Cocktails</strong> 


1. ###### Collections: HashMap ingredients:  
- Liquid ingredient
- Integer for ordered ingredients in list

2. ###### Decorations: one decorational item per drink (ananas, cherry,...)
- String decoration

    or   
- List of an order of Cocktails

3. ###### Exception: DoNotDriveException
- drivingCar () --> now you can't drive a car anymore (alcohol percent > 3)


***
#### ***Final adapted version***

##### Cocktails.java

2 Variables: 
> String decoration
HashMap ingredients (Integer, String)

Methods: 
- > Getters and setters for the class variables
- > Getters for volume and alcohol percent of cocktail
- > Method that returns true if a cocktail is alcoholic
- > Method that checks if you are fit to go home by car.
DoNotDriveException is thrown if the the alcohol percentage of the cocktail is too high


***
#### ***Unit testing***

We created two unit test files on the base of LiquidTest.java to fulfill 100% test coverage for the classes SimpleDrink and Cocktail: 
- ###### SimpleDrinkTest.java
This class tests the correctness of the constructor, the getters for volume and alcohol percent of a simple drink, as well as the query if the drink is alcoholic.

- ###### CocktailTest.java
This class tests the correctness of the constructor, the getters for volume and alcohol percent of a cocktail, as well as the query if the cocktail is alcoholic. 
In addition the getters and setters for decoration and ingredients are being put to the test. Last but not least the query if someone is fit to drive (goingHome method) and this methods' exception is reviewed. 

***
#### ***Code examples***
![**DoNotDriveException**](exception.jpg)  
![**DoNotDriveException**](exceptiontest.jpg)  
![**DoNotDriveException**](testsetup.jpg)  