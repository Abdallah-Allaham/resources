package problem_solving.Div3;

import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int row=0;
        int column=0;

        for(int i=0;i<5;i++) {
            for (int j = 0; j < 5; j++) {
                int num = in.nextInt();
                if (num == 1) {
                    row = i;
                    column = j;
                }
            }
        }

        int moves=Math.abs(row-2) + Math.abs(column-2);
        System.out.println(moves);
    }
}



//from me hard code
//        Scanner in = new Scanner(System.in);
//        int[][] matrix = new int[5][5];
//        int row = 0;
//        int column = 0;
//        int move=0;
//
//        for(int i=0 ; i<5;i++){
//            for(int j=0 ; j<5;j++){
//                matrix[i][j]= in.nextInt();
//                if(matrix[i][j] == 1){
//                    row = i;
//                    column = j;
//                }
//            }
//        }
//
//        while (row !=2 || column!=2){
//
//            if(row < 2){
//                row++;
//                move++;
//            }if(row > 2) {
//                row--;
//                move++;
//            }
//
//            if(column < 2) {
//                column++;
//                move++;
//            }if (column > 2) {
//                column--;
//                move++;
//            }
//        }
//
//        System.out.println(move);

// new and semple way
