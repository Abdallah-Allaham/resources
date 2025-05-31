package problem_solving.Div2;

import java.util.Scanner;

public class Towers {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n= in.nextInt();
        int[] arr = new int[1001];
        int numOfTowers=0;
        int max=0;

        for (int i=0;i<n;i++){
            arr[in.nextInt()]++;
        }

        for (int i=1;i<arr.length;i++){
            if(arr[i]>0){
                numOfTowers++;
            }

            if(arr[i]>max){
                max=arr[i];
            }
        }

        System.out.println(max + " " + numOfTowers);

    }
}
