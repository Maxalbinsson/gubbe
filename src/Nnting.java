import java.util.Scanner;

class Hangman {
    private static final String[] words = {"buss", "house", "computer", "dog", "spectacular", "swedish"};
    private static final String word = words[(int) (Math.random() * words.length)];
    private static String asterisk = new String(new char[word.length()]).replace("\0", "*");
    private static int count = 0;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (count(count < 7 && asterisk.contains("*"))) {
            System.out.println("Gissa en bokstav");
            System.out.println(asterisk);
            String guess = sc.next();
            hang(guess);
        }
        sc.close();
    }



    private static boolean count(boolean b) {
        return b;
    }


    public static void hang(String guess) {
        String newasterisk = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess.charAt(0)) {
                newasterisk += guess.charAt(0);
            } else if (asterisk.charAt(i) != '*') {
                newasterisk += word.charAt(i);
            } else {
                newasterisk += "*";
            }
        }
        if (asterisk.equals(newasterisk)) {
            count++;
            hangmanImage();
        } else {
            asterisk = newasterisk;
        }
        if (asterisk.equals(word)) {
            System.out.println("Rätt svar, du van! Ordet var" + word);
        }

    }


    public static void hangmanImage() {
        if (count == 1) {
        System.out.print("fel bokstav, försök igen");
        System.out.print();
        System.out.print();
        System.out.print();
        System.out.print();
        System.out.print("____I____");
        }


        if (count == 2) {
        System.out.print("fel bokstav, försök igen");
        System.out.print();
        System.out.print();
        System.out.print();




        }
    }




}




