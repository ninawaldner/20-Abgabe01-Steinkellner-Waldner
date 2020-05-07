package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;


@DisplayName("Testing Cocktail implementation")
public class CocktailTest {

    private Cocktail mojito, virginMary;
    private HashMap<Integer, Liquid> ingredients1 = new HashMap<>();
    private HashMap<Integer, Liquid> ingredients2 =new HashMap<>();

    /**
     *
     */
    @BeforeEach
    void setup() {

        ingredients1.put(1, new Liquid("White Rum", 0.2, 0.4));
        ingredients1.put(2, new Liquid("Soda Water", 0.3, 0.0));
        ingredients2.put(1, new Liquid("Tomato juice", 0.3, 0.0));
        ingredients2.put(2, new Liquid("Soda Water", 0.5, 0.0));

        mojito = new Cocktail("Mojito", "Mint Sprigs", ingredients1);
        virginMary = new Cocktail("Virgin Mary", "Ground pepper", ingredients2);
    }

    @Test
    void testCocktailConstructor() {
        assertEquals(virginMary.getName(), "Virgin Mary");
        assertEquals(virginMary.getDecoration(), "Ground pepper");
        assertEquals(virginMary.getIngredients(), ingredients2);
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
    void goingHomeTest() throws DoNotDriveException {
        assertEquals(mojito.goingHome(), "Take the bus!");
        assertEquals(virginMary.goingHome(), "Drive carefully!");

    }

    @Test
    void goingHomeExceptionTest() {
        assertThrows(DoNotDriveException.class, () -> mojito.goingHome());
    }
}
