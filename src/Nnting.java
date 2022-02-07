import java.util.Scanner;

class Hangman {
    private static final String[] words = {"buss", "house", "computer", "dog", "spectacular", "swedish"};
    private static final String word = words[(int) (Math.random() * words.length)];
    private static final String asterisk = new String(new char[word.length()]).replace("\0", "*");
    private static final int count = 0;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (count(count < 7 && asterisk.contains("*"))) {
            System.out.println("Guess any letter in the word");
            System.out.println(asterisk);
            String guess = sc.next();
            hang(guess);
        }
        sc.close();
    }

    private static boolean count(boolean b) {
        return b;
    }

    private static void hang(String guess) {
        String newasterisk = "";
        for (int i = 0; i < word.length(); i++) {
        }
    }
}




