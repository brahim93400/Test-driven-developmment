import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

public class TestAnalyseurDeMain {
    @Test
    public void testEstPaire() {
        List<Carte> main = Arrays.asList(
            new Carte("10", "Cœur"),
            new Carte("10", "Carreau"),
            new Carte("5", "Trèfle"),
            new Carte("2", "Pique"),
            new Carte("8", "Cœur")
        );
        assertTrue(AnalyseurDeMain.estPaire(main));
    }

    @Test
    public void testEstBrelan() {
        List<Carte> main = Arrays.asList(
            new Carte("7", "Cœur"),
            new Carte("7", "Carreau"),
            new Carte("7", "Trèfle"),
            new Carte("9", "Pique"),
            new Carte("3", "Cœur")
        );
        assertTrue(AnalyseurDeMain.estBrelan(main));
    }

    @Test
    public void testEstCarre() {
        List<Carte> main = Arrays.asList(
            new Carte("4", "Cœur"),
            new Carte("4", "Carreau"),
            new Carte("4", "Trèfle"),
            new Carte("4", "Pique"),
            new Carte("9", "Cœur")
        );
        assertTrue(AnalyseurDeMain.estCarre(main));
    }
}
