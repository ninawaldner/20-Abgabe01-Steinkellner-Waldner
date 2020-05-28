package at.fhj.iit;


import java.util.HashMap;

/**
 * Class represents a cocktail drink liquid which mixes liquids with several other ingredients
 * and makes it pretty with a delicious decoration
 *
 * @author: Rosa Steinkellner, Nina Waldner
 */
public class Cocktail extends Drink {

    /**
     * name of decoration
     */
    private String decoration;
    /**
     * list of ingredients - order of mixed ingredients of type Liquid
     */
    private HashMap<Integer, Liquid> ingredients;

    /**
     * Creates a Cocktail object with name, cocktail decoration and a list of ingredients
     *
     * @param name        Name of the Cocktail
     * @param decoration  Decoration to put in the glass
     * @param ingredients
     */
    public Cocktail(String name, String decoration, HashMap<Integer, Liquid> ingredients) {
        super(name);
        this.decoration = decoration;
        this.ingredients = ingredients;
    }

    /**
     * Getter for name
     *
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter for decoration
     *
     * @return decoration
     */
    public String getDecoration() {
        return decoration;
    }

    /**
     * Setter for decoration
     *
     * @param decoration
     */
    public void setDecoration(String decoration) {
        this.decoration = decoration;
    }

    /**
     * Getter for list of ingredients
     *
     * @return listIngredients
     */
    public HashMap<Integer, Liquid> getIngredients() {
        return ingredients;
    }

    /**
     * Setter for list of ingredients
     *
     * @param ingredients
     */
    public void setIngredients(HashMap<Integer, Liquid> ingredients) {
        this.ingredients = ingredients;
    }

    /**
     * Calculates and returns volume of drink
     *
     * @return the volume of drink in liter
     */
    @Override
    public double getVolume() {
        double volumeIngredients = 0;
        for (Liquid ingredient : ingredients.values()) {
            volumeIngredients += ingredient.getVolume();
        }
        return volumeIngredients;
    }

    @Override
    /**
     * Calculates and returns the alcohol percentage
     *
     * @return alcohol volume percent (e.g. 50)
     */
    public double getAlcoholPercent() {
        double totalAlcoholPercent = 0;
        for (Liquid ingredient : ingredients.values()) {
            totalAlcoholPercent += ingredient.getAlcoholPercent();
        }
        return totalAlcoholPercent;
    }

    @Override
    /**
     * Gives information if drink is alcoholic or not
     *
     * @return true when alcoholic liquids are present, otherwise false
     */
    public boolean isAlcoholic() {
        return getAlcoholPercent() > 0;
    }

    /**
     * Gives information if you're fit to drive home
     *
     * @throws DoNotDriveException
     */
    public String goingHome() throws DoNotDriveException {
        if (getAlcoholPercent() >= 0.3) {
            throw new DoNotDriveException("You're too drunk to drive! Take the bus..");
        } else {
            return "Drive carefully!";
        }
    }
}
