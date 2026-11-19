import java.util.Scanner;
public class SumofNum {
    public static void main (String[] args) {
        Scanner in = new Scanner (System.in);
        String s = in.nextLine();
        int sum = 0;
        int number = 0;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c >= '0' && c <= '9') {
                number = number * 10 + (c - '0');
            } else {
                sum += number;
                number = 0;
            }
        }
        sum += number;
        System.out.println(sum);
    }
}
