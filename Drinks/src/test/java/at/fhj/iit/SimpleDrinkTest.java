package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Testing the implementation of the class Simpledrink that represents a simple drink liquid which can be used in
 * drinks
 * @author: Rosa Steinkellner, Nina Waldner
 */
@DisplayName("Testing Liquid implementation")
class SimpleDrinkTest {

    /**
     * creating two SimpleDrinks
     */
    private SimpleDrink wine;
    private SimpleDrink water;

    /**
     * inits an alcoholic and non alcoholic SimpleDrink for EACH test
     */
    @BeforeEach
    void setup() {
        // SETUP PHASE
        water = new SimpleDrink("Wasser", new Liquid("Wasser", 0.3, 0));
        wine = new SimpleDrink("Wein", new Liquid("Wein", 0.125, 13));
    }

    /**
     * Testing the functionality of the constructor of an alcoholic SimpleDrink by getting name, alcohol percent and volume
     * and comparing them with assertEquals to the actual values
     */
    @Test
    @DisplayName("Testing constructor alcoholic")
    public void testConstructorAlcoholic(){
        assertEquals(wine.name, "Wein");
        assertEquals(wine.getAlcoholPercent(),   13);
        assertEquals(wine.getVolume(), 0.125);
    }

    /**
     * Testing the functionality of the constructor of a non alcoholic SimpleDrink by getting name, alcohol percent and volume
     * and comparing them with assertEquals to the actual values
     */
    @Test
    @DisplayName("Testing constructor non alcoholic")
    public void testConstructorNonAlcoholic(){
        assertEquals(water.name, "Wasser");
        assertEquals(water.getAlcoholPercent(),   0);
        assertEquals(water.getVolume(), 0.3);
    }

    /**
     * Testing the functionality of the volume getter of an alcoholic and non alcoholic SimpleDrink
     * and comparing them with assertEquals to the actual values
     */
    @Test
    @DisplayName("Testing volume getter")
    void testVolumeGetter() {
        assertEquals(wine.getVolume(), 0.125);
        assertEquals(water.getVolume(), 0.3);
    }

    /**
     * Testing the functionality of the alcohol percent getter of an alcoholic and non alcoholic SimpleDrink
     * and comparing them with assertEquals to the actual values
     */
    @Test
    @DisplayName("Testing alcohol percent getter")
    void testAlcoholPercentGetter() {
        assertEquals(wine.getAlcoholPercent(), 13);
        assertEquals(water.getAlcoholPercent(), 0);
    }

    /**
     * Testing the functionality of the is alcoholic drink method of an alcoholic and non alcoholic SimpleDrink
     * and comparing them with assertTrue for alcoholic SimpleDrinks and assertFalse for non alcoholic SimpleDrinks to the actual values
     */
    @Test
    @DisplayName("Testing is alcoholic drink")
    void testIsAlcoholic() {
        assertTrue(wine.isAlcoholic());
        assertFalse(water.isAlcoholic());
    }

}