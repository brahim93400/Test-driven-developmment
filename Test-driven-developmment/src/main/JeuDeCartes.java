import java.util.*;

public class JeuDeCartes {
    private List<Carte> cartes;
    private static final String[] VALEURS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Valet", "Dame", "Roi", "As"};
    private static final String[] COULEURS = {"Cœur", "Carreau", "Trèfle", "Pique"};

    public JeuDeCartes() {
        cartes = new ArrayList<>();
        for (String couleur : COULEURS) {
            for (String valeur : VALEURS) {
                cartes.add(new Carte(valeur, couleur));
            }
        }
        melanger();
    }

    public void melanger() {
        Collections.shuffle(cartes);
    }

    public Carte tirerCarte() {
        return cartes.isEmpty() ? null : cartes.remove(0);
    }
}
