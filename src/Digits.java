import java.util.Scanner;
public class Digits {
    public static void main (String[] args) {
        Scanner in = new Scanner (System.in);
        String text = in.nextLine();
        int count = 0;
        for(int i = 0; i<text.length(); i++) {
            char c = text.charAt(i);
            if( Character.isDigit(c)) {
                count++;
            }
        }
        System.out.println("There are " + count + " digit.");

    }
}
