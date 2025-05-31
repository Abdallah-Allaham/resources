package problem_solving.Div2;

import java.util.Scanner;

public class DifferentIsGood {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        if (n > 26) {
            System.out.println(-1);
        } else {

            int[] arr = new int[30];
            String s = in.next().toLowerCase();
            int numOfChanges = 0;

            for (int i = 0; i < s.length(); i++) {
                arr[s.charAt(i) - 'a']++;
            }

            for (int i = 0; i < 26; i++) {
                while (arr[i] > 1) {
                    numOfChanges++;
                    arr[i]--;
                }
            }

            System.out.println(numOfChanges);

        }
    }
}
