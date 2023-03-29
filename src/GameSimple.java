import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameSimple extends Game {
    @Override
    public Gamer createGamer(String nom, String prenom, int score) {
        return new SimpleGamer(nom, prenom, score);
    }

    @Override
    public Boolean Play() {
        Scanner scanner = new Scanner(System.in);
        char[] guessedLetters = new char[Keyword.length()]; //creer un tableu de char evec taille de le mot cle
        for (int i = 0; i < guessedLetters.length; i++) {
            guessedLetters[i] = '_';
        }
        int numGuesses = 0;
        int numGuessesFals;
        String motGuess;
        List<Integer> lstNonGuessed;
        while (true) {
            System.out.println("Guess the Keyword: " + String.valueOf(guessedLetters));
            System.out.print("Saisir Le mot cle: ");
            motGuess = scanner.nextLine().toLowerCase();
            numGuessesFals = 0;
            lstNonGuessed = new ArrayList<>();
            if (motGuess.length() != Keyword.length()) {
                System.out.println("Merci de coisir un mot composer de " + Keyword.length() + " Character !!");
            } else {
                for (int i = 0; i < Keyword.length(); i++) {
                    if (Keyword.charAt(i) == motGuess.charAt(i)) {
                        guessedLetters[i] = Keyword.charAt(i);
                    } else
                        lstNonGuessed.add(i);
                }
                for (int posi : lstNonGuessed) {
                    for (int posiK : lstNonGuessed) {
                        if (motGuess.charAt(posiK) == Keyword.charAt(posi)) {
                            numGuessesFals++;
                        }
                    }
                }
                numGuesses++;
                if (String.valueOf(guessedLetters).equals(Keyword)) {
                    System.out.println("You win! Le mot cle est  " + Keyword + ".");
                    return true;
                } else if (numGuesses >= 10) {
                    System.out.println("You lose! Le mot cle est " + Keyword + ".");
                    return false;
                } else {
                    if (numGuessesFals > 0)
                        System.out.println("Incorrect guess. You have " + (10 - numGuesses) + " guesses left and you Guessed " + numGuessesFals + " in incorrect Position");
                    else
                        System.out.println("Incorrect guess. You have " + (10 - numGuesses) + " guesses left.");
                }
            }
        }

    }
    //scanner.close();


}
