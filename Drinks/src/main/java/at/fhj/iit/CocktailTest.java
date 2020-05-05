package at.fhj.iit;
import static org.junit.jupiter.api.Assertions.assertEquals;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;


import java.util.HashMap;


@DisplayName("Testing Cocktail implementation")
public class CocktailTest {

    private Cocktail mojito, cosmopolitan;

    /**
     *
     */
    @BeforeEach
    void setup(){
        HashMap<Integer, Liquid> ingredients1 = new HashMap<>();
        ingredients1.put(1, new Liquid("White Rum", 0.2, 0.1));
        ingredients1.put(2, new Liquid("Soda Water", 0.3, 0.0));


        mojito = new Cocktail("Mojito", "Mint Sprigs", ingredients1);
    }
}
