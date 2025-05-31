package problem_solving.Div2;

import java.util.Scanner;

public class DoggoRecoloring {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        String letter = in.next().toLowerCase();

        int[] arr = new int[30];

        for (int i = 0; i < letter.length(); i++) {
            arr[letter.charAt(i) - 'a']++;
        }

        if (n != 1) {
            for (int i = 0; i < 26; i++) {
                if (arr[i] >= 2) {
                    System.out.println("YES");
                    return;
                }
            }

            System.out.println("NO");
        }else {
            System.out.println("YES");
        }
    }
}
