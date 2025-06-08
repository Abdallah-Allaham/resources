package problem_solving.Div3;

import java.util.Scanner;

public class TheDoors {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] doors = new int[n];
        int totalLeft = 0, totalRight = 0;

        for (int i = 0; i < n; i++) {
            doors[i] = in.nextInt();
            if (doors[i] == 0) totalLeft++;
            else totalRight++;
        }

        int openedLeft = 0, openedRight = 0;

        for (int i = 0; i < n; i++) {
            if (doors[i] == 0) openedLeft++;
            else openedRight++;

            if (openedLeft == totalLeft || openedRight == totalRight) {
                System.out.println(i + 1);
                return;
            }
        }
    }
}
