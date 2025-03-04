public class Main {
    public static void main(String[] args) {
        JeuDeCartes jeu = new JeuDeCartes();
        MainDePoker mainJoueur = new MainDePoker(jeu);

        System.out.println("Main du joueur : ");
        mainJoueur.afficherMain();

        if (AnalyseurDeMain.estCarre(mainJoueur.getMain())) {
            System.out.println("→ Carré !");
        } else if (AnalyseurDeMain.estBrelan(mainJoueur.getMain())) {
            System.out.println("→ Brelan !");
        } else if (AnalyseurDeMain.estPaire(mainJoueur.getMain())) {
            System.out.println("→ Paire !");
        } else {
            System.out.println("→ Carte haute.");
        }
    }
}
