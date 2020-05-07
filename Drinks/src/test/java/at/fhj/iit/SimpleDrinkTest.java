package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testing Liquid implementation")
class SimpleDrinkTest {

    /**
     *
     */
   protected Liquid l, ln;
    private SimpleDrink wine;
    private SimpleDrink water;

    /**
     * inits an alcoholic liquid for EACH test
     */
    @BeforeEach
    void setup() {
        // SETUP PHASE
        l = new Liquid("Wein", 0.125, 13);
        ln = new Liquid("Wasser", 0.3, 0);
        water = new SimpleDrink("Wasser", ln);
        wine = new SimpleDrink("Wein", l);
    }

    @Test
    @DisplayName("Testing constructor alcoholic")
    public void testConstructorAlcoholic(){
        assertEquals(wine.name, "Wein");
        assertEquals(wine.getAlcoholPercent(),   13);
        assertEquals(wine.getVolume(), 0.125);
    }

    @Test
    @DisplayName("Testing constructor non alcoholic")
    public void testConstructorNonAlcoholic(){
        assertEquals(water.name, "Wasser");
        assertEquals(water.getAlcoholPercent(),   0);
        assertEquals(water.getVolume(), 0.3);
    }

    @Test
    @DisplayName("Testing volume getter")
    void testVolumeGetter() {
        assertEquals(wine.getVolume(), 0.125);
    }

    @Test
    @DisplayName("Testing alcohol percent getter")
    void testAlcoholPercentGetter() {
        assertEquals(wine.getAlcoholPercent(), 13);
    }

    @Test
    @DisplayName("Testing is alcoholic drink")
    void testIsAlcoholic() {
        assertTrue(wine.isAlcoholic());
    }
}