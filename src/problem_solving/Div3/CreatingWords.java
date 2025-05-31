package problem_solving.Div3;

import java.util.Scanner;

public class CreatingWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCase = in.nextInt();

        for (int i = 0; i < testCase; i++) {
            String a = in.next().toLowerCase();
            String b = in.next().toLowerCase();

            char temp = a.charAt(0);
            a = b.charAt(0) + a.substring(1);
            b = temp + b.substring(1);

            System.out.println(a + " " + b);
        }
    }
}
