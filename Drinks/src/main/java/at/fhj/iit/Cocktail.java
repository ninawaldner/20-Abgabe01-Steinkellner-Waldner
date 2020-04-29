package at.fhj.iit;


import java.util.HashMap;

/**
 * Class represents a cocktail drink liquid which mixes liquids with several other ingredients
 * and makes it pretty with a delicious decoration
 */
public class Cocktail extends Drink{

    /**
     * name of ingredient
     */
    private String ingredient;
    /**
     * amount in milliliters
     */
    private int amountMilliLiters;
    /**
     * name of decoration
     */
    private String decoration;
    /**
     * list of ingredients
     */
    private HashMap<Integer, String> listIngredients;
    /**
     * list of ingredients
     */
    private double


    /**
     * Creates a SimpleDrink object with given age an
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
     * Setter for amount in milliliters
     *
     * @param amountMilliLiters
     */
    public void setAmountMilliLiters(int amountMilliLiters) {
        this.amountMilliLiters = amountMilliLiters;
    }
    /**
     * Getter for decorational item
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
     * Getter for listIngredients
     *
     * @return
     */
    public HashMap<Integer, String> getListIngredients() {
        return listIngredients;
    }
    /**
     * Setter for list of ingredients
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
    public double getVolume() {
        return 0;
    }

    @Override
    /**
     * Calculates and returns the alcohol percentage
     *
     * @return alcohol volume percent (e.g. 50)
     */
    public double getAlcoholPercent(){
        return 0;
    };

    @Override
    /**
     * Gives information if drink is alcoholic or not
     *
     * @return true when alcoholic liquids are present, otherwise false
     */
    public boolean isAlcoholic(){
        return true;
    };




}
