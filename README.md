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
    - >Cocktail.java: inherits from class Drink.java<br>
    - >FizzyDrinks.java: inherits from class SimpleDrinks.java<br>
    - >Smoothies.java: inherits from class SimpleDrinks.java<br>
    - > DarryDrinks.java: inherits from class SimpleDrinks.java<br>
    - >BeerMixDrinks.java: inherits from class Drinks.java<br>
2. *Exception*
3. *Collections*<br/> List of ingredients

***
#### ***Final version***

### Decision for Subclass:  <strong>Cocktails</strong> 

#### 2 Variables: 
- > String decoration:<br>
    one decorational item per drink (ananas, cherry,...)
- > HashMap ingredients (Integer, String)<br>
    Liquid ingredient

#### Methods: 
- > Getters and setters for the class variables
- > Getters for volume and alcohol percent of cocktail
- > Method that returns true if a cocktail is alcoholic
- > Method that checks if you are fit to go home by car<br>

#### Exception: DoNotDriveException.java
- > goingHome() --> if you're not fit to drive anymore (alcohol percent >= 3)
- > DoNotDriveException is thrown if the alcohol percentage of the cocktail is too high



***
#### ***Unit testing***

We created two unit test files on the base of LiquidTest.java to fulfill 100% test coverage for the classes SimpleDrink and Cocktail: 
- #### SimpleDrinkTest.java
This class tests the correctness of the constructor, the getters for volume and alcohol percent of a simple drink, as well as the query if the drink is alcoholic.

- #### CocktailTest.java
This class tests the correctness of the constructor, the getters for volume and alcohol percent of a cocktail, as well as the query if the cocktail is alcoholic. 
In addition the getters and setters for decoration and ingredients are being put to the test. Last but not least the query if someone is fit to drive (goingHome method) and this methods' exception is reviewed. 

***
#### ***Code examples***

    /**
     * Gives information if you're fit to drive home
     *
     * @throws DoNotDriveException
     */
    public void goingHome() throws DoNotDriveException{
        try{
            if (getAlcoholPercent() >= 3){
                throw new DoNotDriveException("You're too drunk to drive! Take the bus..");
            } else {
                System.out.println("Drive carefully!");
            }
        }catch (DoNotDriveException e){
        }
    }
