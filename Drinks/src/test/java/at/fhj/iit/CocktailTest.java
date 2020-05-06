package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;


@DisplayName("Testing Cocktail implementation")
public class CocktailTest {

    private Cocktail mojito, cosmopolitan;
    private HashMap<Integer, Liquid> ingredients1 = new HashMap<>();

    /**
     *
     */
    @BeforeEach
    void setup(){

        ingredients1.put(1, new Liquid("White Rum", 0.2, 0.4));
        ingredients1.put(2, new Liquid("Soda Water", 0.3, 0.0));

        mojito = new Cocktail("Mojito", "Mint Sprigs", ingredients1);
    }

    @Test
    void testDecorationGetter() {
        mojito.setDecoration("Spearmint Sprigs");
        assertEquals(mojito.getDecoration(), "Spearmint Sprigs");
    }

    @Test
    void testDecorationSetter() {
        mojito.setDecoration("Peppermint Sprigs");
        assertEquals(mojito.getDecoration(), "Peppermint Sprigs");
    }

    @Test
    void testIngredientsGetter() {
        assertEquals(mojito.getIngredients(), ingredients1);
    }

    @Test
    void testIngredientsSetter() {
        mojito.setIngredients(ingredients1);
        assertEquals(mojito.getIngredients(), ingredients1);
    }

    @Test
    void testVolumeGetter() {
        assertEquals(mojito.getVolume(), 0.5);
    }

    @Test
    void testAlcoholPercentGetter() {
        assertEquals(mojito.getAlcoholPercent(), 0.4);
    }

    @Test
    void isAlcoholicTest() {
        assertTrue(mojito.isAlcoholic());
    }

    @Test
    void goingHomeTest() {
        Throwable exception = assertThrows(DoNotDriveException.class, () ->{
        throw new DoNotDriveException("You're too drunk to drive! Take the bus...");});
    }



}
