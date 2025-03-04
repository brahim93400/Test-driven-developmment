import java.util.*;

public class MainDePoker {
    private List<Carte> main;

    public MainDePoker(JeuDeCartes jeu) {
        main = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            main.add(jeu.tirerCarte());
        }
    }

    public List<Carte> getMain() {
        return main;
    }

    public void afficherMain() {
        for (Carte carte : main) {
            System.out.println(carte);
        }
    }
}
