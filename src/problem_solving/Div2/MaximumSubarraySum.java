package problem_solving.Div2;

import java.util.Scanner;

public class MaximumSubarraySum {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int size= in.nextInt();
        int[] arr=new int[size];

        for (int i=0;i<size;i++){
            arr[i]=in.nextInt();
        }

        long maxSum = arr[0];
        long currentSum = arr[0];

        for (int i = 1; i < size; i++) {
            if(arr[i]<currentSum+arr[i]){
                currentSum=currentSum+arr[i];
            }else {
                currentSum=arr[i];
            }

            if(currentSum>maxSum){
                maxSum=currentSum;
            }
        }

        System.out.println(maxSum);
    }
}
