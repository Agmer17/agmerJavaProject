import java.util.Scanner;
import java.util.Random;

public class MainApp {

    public static void main(String[] args) {
        Scanner userGuess = new Scanner(System.in);
        Random randomWord = new Random();
        String[] namaWaifu = {
                "Anya", "Yor", "Marin", "Kaguya", "Chika",
                "Rem", "Ram", "Emilia", "Asuna", "Kirino",
        };
        String word = namaWaifu[randomWord.nextInt(namaWaifu.length)].toLowerCase();
        String guess = "";

        System.out.println("_ ".repeat(word.length()));
        while (true) {
            // System.out.print("\nMasukan nama waifu : ");
            // guess = userGuess.nextLine().toLowerCase();
            while (true) {
                System.out.print("\nMasukan tebakan kata : ");
                guess = userGuess.nextLine();
                if (guess.length() == word.length()) {
                    break;
                }
                System.out.printf("\nmasukan kata dengan jumlah huruf : %d", word.length());
            }

            if (word.equals(guess)) {
                System.out.println("tebakan kamu benar!");
                break;
            }

            String sameWord = new String(checkAnswer(word, guess));
            System.out.println(sameWord);
            guess = "";
            // break;

        }
        userGuess.close();

    }

    public static char[] checkAnswer(String word, String guess) {
        char[] sameString = new char[word.length()];

        for (int i = 0; i < sameString.length; i++) {
            sameString[i] = '_';
        }

        for (int i = 0; i < guess.length(); i++) {
            char x = guess.charAt(i);

            // if (!word.contains(contains)) {
            // System.out.println("di skip");
            // continue;
            // }

            // hiura
            for (int j = 0; j < word.length(); j++) {
                if (x == word.charAt(j)) {
                    sameString[j] = x;
                    break;
                }
            }

        }

        return sameString;

    }

}
