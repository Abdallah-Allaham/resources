package Div3;

import java.util.Scanner;

public class Games {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        int[][] teams = new int[test][2];

        for (int i = 0; i < test; i++) {
            for (int j = 0; j < 2; j++) {
                teams[i][j] = in.nextInt();
            }
        }

        int count = 0;
        for (int i = 0; i < test; i++) {
            for (int j = 0; j < test; j++) {
                if (teams[i][0] == teams[j][1]) {
                    count++;
                }
            }
        }

        System.out.println(count);


    }
}
