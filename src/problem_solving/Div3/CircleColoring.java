package problem_solving.Div3;

import java.util.Scanner;

public class CircleColoring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int testCase = in.nextInt();

        int[] a, b, c, p;

        for (int i = 0; i < testCase; i++) {
            int numOfElement = in.nextInt();
            a = new int[numOfElement];
            b = new int[numOfElement];
            c = new int[numOfElement];
            p = new int[numOfElement];

            for (int j = 0; j < numOfElement; j++) {
                a[j] = in.nextInt();
            }
            for (int j = 0; j < numOfElement; j++) {
                b[j] = in.nextInt();
            }
            for (int j = 0; j < numOfElement; j++) {
                c[j] = in.nextInt();
            }

            p[0] = a[0];

            for (int j = 1; j < numOfElement - 1; j++) {
                if (a[j] != p[j - 1]) p[j] = a[j];
                else if (b[j] != p[j - 1]) p[j] = b[j];
                else p[j] = c[j];
            }

            if (a[numOfElement - 1] != p[numOfElement - 2] && a[numOfElement - 1] != p[0])
                p[numOfElement - 1] = a[numOfElement - 1];
            else if (b[numOfElement - 1] != p[numOfElement - 2] && b[numOfElement - 1] != p[0])
                p[numOfElement - 1] = b[numOfElement - 1];
            else p[numOfElement - 1] = c[numOfElement - 1];

            for (int j=0;j<numOfElement;j++){
                System.out.print(p[j]+" ");
            }
            System.out.println();
        }
    }
}
