package problem_solving.Div2;

import java.util.Scanner;

public class EvenOdds {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        long n = in.nextLong();
        long k = in.nextLong();

        long oddCount = (n + 1) / 2;

        if (k <= oddCount) {
            System.out.println(2 * k - 1);
        } else {
            System.out.println(2 * (k - oddCount));
        }
    }
}
