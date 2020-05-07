package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;


@DisplayName("Testing Cocktail implementation")
public class CocktailTest {

    private Cocktail mojito;
    private Cocktail virginMary;
    private HashMap<Integer, Liquid> ingredients1 = new HashMap<>();
    private HashMap<Integer, Liquid> ingredients2 = new HashMap<>();

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
    @DisplayName("Testing the Cocktail Constructor")
    void testCocktailConstructor() {
        assertEquals(virginMary.getName(), "Virgin Mary");
        assertEquals(virginMary.getDecoration(), "Ground pepper");
        assertEquals(virginMary.getIngredients(), ingredients2);
    }

    @Test
    @DisplayName("Testing the Decoration Getter")
    void testDecorationGetter() {
        mojito.setDecoration("Spearmint Sprigs");
        assertEquals(mojito.getDecoration(), "Spearmint Sprigs");
    }

    @Test
    @DisplayName("Testing the Decoration Setter")
    void testDecorationSetter() {
        mojito.setDecoration("Peppermint Sprigs");
        assertEquals(mojito.getDecoration(), "Peppermint Sprigs");
    }

    @Test
    @DisplayName("Testing the Ingredients Getter")
    void testIngredientsGetter() {
        assertEquals(mojito.getIngredients(), ingredients1);
    }

    @Test
    @DisplayName("Testing the Ingredients Setter")
    void testIngredientsSetter() {
        mojito.setIngredients(ingredients1);
        assertEquals(mojito.getIngredients(), ingredients1);
    }

    @Test
    @DisplayName("Testing the Volume Getter")
    void testVolumeGetter() {
        assertEquals(mojito.getVolume(), 0.5);
    }

    @Test
    @DisplayName("Testing the Alcohol Percent Getter")
    void testAlcoholPercentGetter() {
        assertEquals(mojito.getAlcoholPercent(), 0.4);
    }

    @Test
    @DisplayName("Testing the isAlcoholic method")
    void isAlcoholicTest() {
        assertTrue(mojito.isAlcoholic());
    }

    @Test
    @DisplayName("Testing the goingHome method")
    void goingHomeTest() throws DoNotDriveException {
        assertEquals(virginMary.goingHome(), "Drive carefully!");
    }

    @Test
    @DisplayName("Testing, if Exception gets thrown")
    void goingHomeExceptionTest() {
        assertThrows(DoNotDriveException.class, () -> mojito.goingHome());
    }
}
