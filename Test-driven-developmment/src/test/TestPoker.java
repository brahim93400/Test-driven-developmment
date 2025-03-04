import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class TestPoker {
    @Test
    void testCreationCarte() {
        Carte carte = new Carte("As", "Cœur");
        assertEquals("As", carte.getValeur());
        assertEquals("Cœur", carte.getCouleur());
    }

    @Test
    void testFlush() {
        List<Carte> cartes = List.of(
            new Carte("10", "Cœur"), new Carte("Valet", "Cœur"),
            new Carte("Dame", "Cœur"), new Carte("Roi", "Cœur"),
            new Carte("As", "Cœur")
        );
        assertTrue(AnalyseurDeMain.estFlush(cartes));
    }
}
