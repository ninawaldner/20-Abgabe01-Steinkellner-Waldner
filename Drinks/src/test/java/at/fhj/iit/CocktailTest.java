package at.fhj.iit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import static org.junit.jupiter.api.Assertions.*;

/**
 * This is a test class for the Cocktail class, which tests the functionality of every method.
 * @author: Rosa Steinkellner, Nina Waldner
 */
@DisplayName("Testing Cocktail implementation")
public class CocktailTest {

    /**
     * Setting up the Cocktails and ingredient Lists needed for testing
     */

    private Cocktail mojito;
    private Cocktail virginMary;
    private HashMap<Integer, Liquid> ingredients1 = new HashMap<>();
    private HashMap<Integer, Liquid> ingredients2 = new HashMap<>();

    /**
     * The setup: Filling the ingredients list with data and constructing Cocktails before EACH test
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

    /**
     * Tests if the constructor of the Cocktail class works properly by using
     * the assertEquals() method.
     */
    @Test
    @DisplayName("Testing the Cocktail Constructor")
    void testCocktailConstructor() {
        assertEquals(virginMary.getName(), "Virgin Mary");
        assertEquals(virginMary.getDecoration(), "Ground pepper");
        assertEquals(virginMary.getIngredients(), ingredients2);
    }

    /**
     * Tests if the Decoration Getter does what it should do by using the assertEquals() method
     */
    @Test
    @DisplayName("Testing the Decoration Getter")
    void testDecorationGetter() {
        mojito.setDecoration("Spearmint Sprigs");
        assertEquals(mojito.getDecoration(), "Spearmint Sprigs");
    }

    /**
     * Tests if the Decoration Setter does what it should do by using the assertEquals() method
     */
    @Test
    @DisplayName("Testing the Decoration Setter")
    void testDecorationSetter() {
        mojito.setDecoration("Peppermint Sprigs");
        assertEquals(mojito.getDecoration(), "Peppermint Sprigs");
    }

    /**
     * Tests if the Ingredients Getter does what it should do by using the assertEquals() method
     */
    @Test
    @DisplayName("Testing the Ingredients Getter")
    void testIngredientsGetter() {
        assertEquals(mojito.getIngredients(), ingredients1);
    }

    /**
     *  Tests if the Ingredients Getter does what it should do by using the assertEquals() method
     */
    @Test
    @DisplayName("Testing the Ingredients Setter")
    void testIngredientsSetter() {
        mojito.setIngredients(ingredients1);
        assertEquals(mojito.getIngredients(), ingredients1);
    }

    /**
     *  Tests if the Volume Getter does what it should do by using the assertEquals() method
     */
    @Test
    @DisplayName("Testing the Volume Getter")
    void testVolumeGetter() {
        assertEquals(mojito.getVolume(), 0.5);
    }

    /**
     *  Tests if the Alcohol Percent Getter does what it should do by using the assertEquals() method
     */
    @Test
    @DisplayName("Testing the Alcohol Percent Getter")
    void testAlcoholPercentGetter() {
        assertEquals(mojito.getAlcoholPercent(), 0.4);
    }

    /**
     * Tests if a cocktail is alcoholic by using assertTrue() and assertFalse()
     */
    @Test
    @DisplayName("Testing the isAlcoholic method")
    void isAlcoholicTest() {
        assertTrue(mojito.isAlcoholic());
        assertFalse(virginMary.isAlcoholic());
    }

    /**
     * Tests if the goingHome() method returns the proper answer for a non-alcoholic cocktail
     * @throws DoNotDriveException
     */
    @Test
    @DisplayName("Testing the goingHome method")
    void goingHomeTest1() throws DoNotDriveException {
            assertEquals(virginMary.goingHome(), "Drive carefully!");
    }

    /**
     * Tests if the goingHome() method throws the DoNotDrive Exception for an alcoholic cocktail
     */
    @Test
    @DisplayName("Testing, if Exception gets thrown")
    void goingHomeExceptionTest1() {
        assertThrows(DoNotDriveException.class, () -> mojito.goingHome());
    }
}
