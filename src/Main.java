import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        remplirKeyWord();

        Scanner s = new Scanner(System.in);
        Game game = null;
        switch (GameChoose()) {
            case 1:
                game = new GameSimple();
                break;
            case 2:
                game = new GameAdvanced();
                break;
        }
        Gamer gamer;
        System.out.println("********************************** Gamer Player *********************************");
        String nom = "";
        String prenom = "";
        do {
            System.out.println("Saisir le Nom ?");
            nom = s.nextLine();
            System.out.println("Saisir le Prenom ?");
            prenom = s.nextLine();
            if (nom.isEmpty() || nom.isBlank() || prenom.isBlank() || prenom.isEmpty())
                System.out.println("Remplir tous les champs SVP");
        } while (nom.isEmpty() || nom.isBlank() || prenom.isBlank() || prenom.isEmpty());
        gamer = game.createGamer(nom, prenom, 0);

        PlayGame(game,gamer);


        System.out.println("Fin Jeux");
        s.close();

    }

    private static void PlayGame(Game game,Gamer gamer){
        Scanner s = new Scanner(System.in);
        String ContOrNo = "";
        do {
            int typGame = Gametype(gamer);
            switch (typGame) {
                case 1:
                    game.setStratigie(StratigieNumber.getInstance());
                    gamer.augmentScor(game.Play());
                    break;
                case 2:
                    game.setStratigie(StratigieLettre.getInstance());
                    gamer.augmentScor(game.Play());
                    break;
                case 3:
                    break;
            }
            System.out.println("Voulez-vous joueu un autre fois ?(1/0)");
            ContOrNo = s.nextLine();
        } while (ContOrNo.equals("1"));
    }
    private static int Gametype(Gamer gamer) {
        int GameCh;
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("_".repeat(150));
            System.out.println("|" + " ".repeat(70) + "Choose a Type Game " + gamer.nom + " " + gamer.prenom);
            System.out.println("|" + " ".repeat(67) + "1. Number Game");
            System.out.println("|" + " ".repeat(67) + "2. Lettre Game");
            System.out.println("_".repeat(150));
            GameCh = Integer.parseInt(s.nextLine());
            if (GameCh < 0 || GameCh > 2)
                System.out.println(gamer.nom + " Choose a Number 1 or 2");
        } while (GameCh < 0 || GameCh > 2);
        return GameCh;
    }
    private static int GameChoose() {
        int GameCh;
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("_".repeat(150));
            System.out.println("|" + " ".repeat(65) + "deffuculte of Game" + " ".repeat(65) + "|");
            System.out.println("|" + " ".repeat(67) + "1. Simple Game" + " ".repeat(67) + "|");
            System.out.println("|" + " ".repeat(67) + "2. Advanced Game" + " ".repeat(65) + "|");
            System.out.println("_".repeat(150));
            GameCh = Integer.parseInt(s.nextLine());
            if (GameCh < 0 || GameCh > 2)
                System.out.println("Choose a Number 1 or 2");
        } while (GameCh < 0 || GameCh > 2);
        return GameCh;
    }
    private static void remplirKeyWord() {
        StratigieLettre TG = StratigieLettre.getInstance();
        TG.addCode("test");
        TG.addCode("ahmed");
        TG.addCode("rachid");
        TG.addCode("program");
        TG.addCode("django");
        TG.addCode("younes");
        TG.addCode("hakim");
        TG.addCode("amine");
        TG.addCode("nouhaila");
        TG.addCode("hafsa");
        TG.addCode("hiba");
        TG.addCode("mohammed");
    }
}