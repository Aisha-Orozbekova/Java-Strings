import java.util.Scanner;
public class Vowels {
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        if (c == 'a' || c == 'o' || c == 'i' || c == 'e' || c == 'u')
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (isVowel(c)) {
                count++;
            }
        }
        System.out.println("Vowels = " + count);
    }
}