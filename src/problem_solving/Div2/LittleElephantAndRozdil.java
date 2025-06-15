package problem_solving.Div2;

import java.util.Scanner;

public class LittleElephantAndRozdil{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        long[] arr = new long[n];

        for (int i=0;i<n;i++){
            arr[i] =in.nextLong();
        }

        long min=arr[0];
        int minIndex=0;
        boolean isDoublecat = false;

        for (int i=1;i<n;i++){
            if(min>arr[i]){
                minIndex=i;
                min=arr[i];
                isDoublecat = false;
            }else if (min==arr[i]){
                isDoublecat = true;
            }
        }

        if (isDoublecat){
            System.out.println("Still Rozdil");
        }else {
            System.out.println(minIndex+1);
        }
    }
}
