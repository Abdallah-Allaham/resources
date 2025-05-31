package problem_solving.Div3;

import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int line = in.nextInt();

        for (int i = 0; i < line; i++) {
            String word= in.next().toLowerCase();
            if (word.length() > 10) {
                System.out.println(
                        word.charAt(0) + "" +
                        (word.length() - 2) +
                        word.charAt(word.length() - 1));
            } else {
                System.out.println(word);
            }
        }
    }
}
