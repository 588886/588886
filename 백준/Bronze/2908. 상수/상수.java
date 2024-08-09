
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();
        String num2 = sc.next();
        for (int i = 2; i >= 0; i--) {
            if (num1.charAt(i) > num2.charAt(i)) {
                System.out.println((num1.charAt(2) + "") + (num1.charAt(1) + "") + (num1.charAt(0) + ""));
                break;
            } else if (num1.charAt(i) < num2.charAt(i)) {
                System.out.println((num2.charAt(2) + "") + (num2.charAt(1) + "") + (num2.charAt(0) + ""));
                break;
            }
        }


        sc.close();

    }
}

