# 20-Abgabe01-Steinkellner-Waldner

This is a project created by Rosa Steinkellner and Nina Waldner

The purpose of this project is to get familiar with JavaDoc, Github and Junit-testing.
An existing Java-Project named "Drinks" will be extended.
The project "Drinks" already contains:
- Drink.java
- Liquid.java
- LiquidTest.java
- SimpleDrinks.java (extends class Drink.java)
All classes contain constructors, getters & setters and JavaDoc. 
Tests using junit5 are also already implemented.
******
***Planned Extensions:***

1. *Subclasses* <br/> Cocktail.java: inherits from class Drink.java <br/> FizzyDrinks.java: inherits from class SimpleDrinks.java<br/>Smoothies.java: inherits from class SimpleDrinks.java<br/> DarryDrinks.java: inherits from class SimpleDrinks.java<br/>BeerMixDrinks.java: inherits from class Drinks.java
2. *Exception*
3. *Collections*<br/> List of ingredients

***Next version***
Collections: 
1. Map:  
- String ingredient
- Integer amount in milliliters

2. Decorations: one decorational item per drink (ananas, cherry, ..)
String decoration

    or   
    - List of an order of Cocktails

Exception: DoNotDriveException
- drivingCar () --> now you can't drive a car anymore (alcohol level)
