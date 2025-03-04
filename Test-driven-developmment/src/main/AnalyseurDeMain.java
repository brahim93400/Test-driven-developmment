import java.util.*;

public class AnalyseurDeMain {
    public static boolean estPaire(List<Carte> main) {
        Map<String, Integer> compteValeurs = new HashMap<>();
        for (Carte carte : main) {
            compteValeurs.put(carte.getValeur(), compteValeurs.getOrDefault(carte.getValeur(), 0) + 1);
        }
        return compteValeurs.containsValue(2);
    }

    public static boolean estBrelan(List<Carte> main) {
        Map<String, Integer> compteValeurs = new HashMap<>();
        for (Carte carte : main) {
            compteValeurs.put(carte.getValeur(), compteValeurs.getOrDefault(carte.getValeur(), 0) + 1);
        }
        return compteValeurs.containsValue(3);
    }

    public static boolean estCarre(List<Carte> main) {
        Map<String, Integer> compteValeurs = new HashMap<>();
        for (Carte carte : main) {
            compteValeurs.put(carte.getValeur(), compteValeurs.getOrDefault(carte.getValeur(), 0) + 1);
        }
        return compteValeurs.containsValue(4);
    }
}
