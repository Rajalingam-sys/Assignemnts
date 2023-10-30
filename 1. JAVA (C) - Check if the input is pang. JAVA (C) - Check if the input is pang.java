import java.util.Scanner;

public class PangramChecker {
    public static boolean isPangram(String s) {
        boolean[] alphabet = new boolean[26];
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                alphabet[Character.toLowerCase(c) - 'a'] = true;
            }
        }

        for (boolean letter : alphabet) {
            if (!letter) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        scanner.close();

        boolean isPangram = isPangram(sentence);
        System.out.println("Is the sentence a pangram? " + isPangram);
    }
}