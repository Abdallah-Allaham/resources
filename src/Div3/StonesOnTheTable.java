package Div3;

import java.util.Scanner;

public class StonesOnTheTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String value = in.next().toUpperCase();

        int count = 0;

        for (int i = 0; i < value.length() - 1; i++) {
            if (value.charAt(i) == value.charAt(i + 1)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
