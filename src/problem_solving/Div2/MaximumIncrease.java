package problem_solving.Div2;

import java.util.Scanner;

public class MaximumIncrease {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n= in.nextInt();
        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextLong();
        }

        int maxLength=1;
        int currentLength=1;
        int left=0;

        for (int i = 1; i < n; i++) {

            if(arr[i]>arr[left]){
                currentLength++;
            }else {
                currentLength=1;
            }

            left++;

            if (currentLength>maxLength){
                maxLength=currentLength;
            }
        }

        System.out.println(maxLength);
    }
}
