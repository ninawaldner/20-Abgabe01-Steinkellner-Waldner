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
   protected Liquid l;
    private SimpleDrink wine;

    /**
     * inits an alcoholic liquid for EACH test
     */
    @BeforeEach
    void setup() {
        // SETUP PHASE
        l = new Liquid("Wein", 0.125, 13);
       wine = new SimpleDrink("Wein", l);
    }

    @Test
    @DisplayName("Testing constructor non alcoholic")
    public void testConstructorNonAlcoholic(){
        assertEquals(wine.l.getName(), "Wein");
        assertEquals(wine.l.getAlcoholPercent(),   13);
        assertEquals(wine.l.getVolume(), 0.125);
    }

    @Test
    @DisplayName("Testing volume getter")
    void getVolume() {

    }

    @Test
    @DisplayName("Testing volume getter")
    void getAlcoholPercent() {
    }

    @Test
    @DisplayName("Testing volume setter")
    void isAlcoholic() {
    }
}