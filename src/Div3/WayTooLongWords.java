package Div3;

import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int line = in.nextInt();

        String[] words = new String[line];

        for (int i = 0; i < line; i++) {
            words[i] = in.next().toLowerCase();
        }

        for (int i = 0; i < line; i++) {
            if (words[i].length() > 10) {
                System.out.println(
                        words[i].charAt(0) + "" +
                        (words[i].length() - 2) +
                        words[i].charAt(words[i].length() - 1));
            } else {
                System.out.println(words[i]);
            }
        }
    }
}
