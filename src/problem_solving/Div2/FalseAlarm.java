package problem_solving.Div2;

import java.util.Scanner;

public class FalseAlarm {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int t= in.nextInt();
        int n,k;
        int[] arr ;
        boolean isOk;

        while (t-->0){
            n= in.nextInt();
            k= in.nextInt();
            arr = new int[n];
            int index=0;
            isOk=true;

            for (int i=0;i<n;i++){
                arr[i] = in.nextInt();
            }

            for (int i=0;i<n;i++){
                if(arr[i] == 1){
                    index=i;
                    break;
                }
            }

            for (int i=index+k;i<n;i++){
                if(arr[i] == 1){
                    isOk = false;
                }
            }

            if (isOk){
                System.out.println("YES");
            }else {
                System.out.println("NO");

            }
        }
    }
}
