package at.fhj.iit;


import java.util.HashMap;


/**
 * Class represents a cocktail drink liquid which mixes liquids with several other ingredients
 * and makes it pretty with a delicious decoration
 */
public class Cocktail extends Drink{


    private String ingredient;
    private int amountMilliLiters;
    private String decoration;
    private HashMap<Integer, String> listIngredients;


    /**
     * Constructor
     *
     * @param name, ingredient, amountMilliLiters, decoration, listIngredients
     */
    public Cocktail(String name, String ingredient, int amountMilliLiters, String decoration, HashMap<Integer, String> listIngredients) {
        super(name);
        this.ingredient = ingredient;
        this.amountMilliLiters = amountMilliLiters;
        this.decoration = decoration;
        this.listIngredients = listIngredients;
    }

    /**
     * Getter for
     *
     * @return ingredient
     */
    public String getIngredient() {
        return ingredient;
    }
    /**
     * Setter for
     *
     * @param ingredient
     */
    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }
    /**
     * Getter for
     *
     * @return amountMilliLiters
     */
    public int getAmountMilliLiters() {
        return amountMilliLiters;
    }
    /**
     * Setter for
     *
     * @param amountMilliLiters
     */
    public void setAmountMilliLiters(int amountMilliLiters) {
        this.amountMilliLiters = amountMilliLiters;
    }
    /**
     * Getter for getDecoration
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
     * Getter for
     *
     * @return
     */
    public HashMap<Integer, String> getListIngredients() {
        return listIngredients;
    }
    /**
     * Setter for
     *
     * @param
     */
    public void setListIngredients(HashMap<Integer, String> listIngredients) {
        this.listIngredients = listIngredients;
    }

    @Override
    /**
     *
     * Calculates and returns volume of drink
     *
     * @return the volume of drink in liter
     */
    public abstract double getVolume();

    @Override
    /**
     * Calculates and returns the alcohol percentage
     *
     * @return alcohol volume percent (e.g. 50)
     */
    public abstract double getAlcoholPercent();

    @Override
    /**
     * Gives information if drink is alcoholic or not
     *
     * @return true when alcoholic liquids are present, otherwise false
     */
    public abstract boolean isAlcoholic();




}
