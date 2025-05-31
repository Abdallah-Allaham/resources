package problem_solving.Div2;

import java.util.Scanner;

public class WhereIsTheBishop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        in.nextLine();
        while (t-- > 0) {

            while (in.hasNextLine()) {
                String empty = in.nextLine();
                if (!empty.isEmpty()) {

                    char[][] board = new char[8][8];
                    for (int i = 0; i < 8; i++) {
                        if (i > 0) empty = in.nextLine();
                        for (int j = 0; j < 8; j++) {
                            board[i][j] = empty.charAt(j);
                        }
                    }

                    for (int i = 1; i < 7; i++) {
                        for (int j = 1; j < 7; j++) {
                            if (board[i][j] == '#' &&
                                    board[i - 1][j - 1] == '#' &&
                                    board[i - 1][j + 1] == '#' &&
                                    board[i + 1][j - 1] == '#' &&
                                    board[i + 1][j + 1] == '#') {
                                System.out.println((i + 1) + " " + (j + 1));
                            }
                        }
                    }

                    break;
                }
            }
        }
    }
}
