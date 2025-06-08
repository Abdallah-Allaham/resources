package problem_solving.Div2;

import java.util.Scanner;

public class VanyaAndCubes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int cubes= in.nextInt();
        int maxLength=50;
        int[] levelCubes=new int[maxLength];
        int[] prefix=new int[maxLength];
        int currentSum=0;

        for (int i=1;i<maxLength;i++){
            currentSum+=i;
            levelCubes[i] = currentSum;

            prefix[i] =prefix[i-1] + levelCubes[i];
        }

        int max=0;
        for (int i=1;i<maxLength;i++){
            if (prefix[i] <= cubes){
                max=i;
            }else {
                break;
            }
        }

        System.out.println(max);
    }
}
