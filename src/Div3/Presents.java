package Div3;

import java.util.Scanner;

public class Presents {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] friends = new int[num];

        for (int i = 0; i < num; i++) {
            friends[i] = in.nextInt();
        }


        for (int i = 0; i < friends.length; i++) {
            for (int j = 0; j < friends.length; j++) {
                if (friends[j] == i+1) {
                    System.out.print((j + 1)+" ");
                    break;
                }
            }
        }
    }
}
