package problem_solving.Div2;

import java.util.Scanner;

public class SerejaAndDima {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n= in.nextInt();
        int[] arr= new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int maxSereja=0;
        int maxDima=0;
        int left=0;
        int right =n-1;
        boolean isSereja=true;

        for (int i = 0; i < n; i++) {
            if (isSereja){

                if (arr[left] > arr[right]){
                    maxSereja+=arr[left];
                    left=left+1;
                }else {
                    maxSereja+=arr[right];
                    right=right-1;
                }

                isSereja = false;
            }else {
                if (arr[left] > arr[right]){
                    maxDima+=arr[left];
                    left=left+1;
                }else {
                    maxDima+=arr[right];
                    right=right-1;
                }

                isSereja = true;
            }
        }

        System.out.println(maxSereja+" "+maxDima);
    }
}
