package at.fhj.iit;


import java.util.HashMap;

/**
 * Class represents a cocktail drink liquid which mixes liquids with several other ingredients
 * and makes it pretty with a delicious decoration
 */
public class Cocktail extends Drink{

    /**
     * name of decoration
     */
    private String decoration;
    /**
     * list of ingredients
     */
    private HashMap<Double, Liquid> listIngredients;


    /**
     * Creates a Cocktail object with name, ingredient, amount in milliliters, cocktail decoration and a list of ingredients
     *
     * @param name, ingredient, amountMilliLiters, decoration, listIngredients
     */
    public Cocktail(String name, String decoration, HashMap<Double, Liquid> listIngredients) {
        super(name);
        this.decoration = decoration;
        this.listIngredients = listIngredients;
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

    public HashMap<Double, Liquid> getListIngredients() {
        return listIngredients;
    }
    /**
     * Setter for list of ingredients
     *
     * @param listIngredients
     */
    public void setListIngredients(HashMap<Double, Liquid> listIngredients) {
        this.listIngredients = listIngredients;
    }


    /**
     * Calculates and returns volume of drink
     *
     * @return the volume of drink in liter
     */
    @Override
    public double getVolume() {
        double volumeIngredients = 0;
        for (double volume: listIngredients.keySet()){
            volumeIngredients +=  volume;
        }
        return volumeIngredients;
    }

    @Override
    /**
     * Calculates and returns the alcohol percentage
     *
     * @return alcohol volume percent (e.g. 50)
     */
    public double getAlcoholPercent(){
        double totalAlcoholPercent = 0;
        for (Liquid ingredient: listIngredients.values()){
           totalAlcoholPercent +=  ingredient.getAlcoholPercent();
        }
        return totalAlcoholPercent;
    }

    @Override
    /**
     * Gives information if drink is alcoholic or not
     *
     * @return true when alcoholic liquids are present, otherwise false
     */
    public boolean isAlcoholic(){
        if (getAlcoholPercent() > 0){
            return true;
        } else {
            return false;
        }
    }

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
}
