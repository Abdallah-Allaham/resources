package problem_solving.Div2;

import java.util.Scanner;

public class LectureSleep {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n=in.nextInt();
        int k= in.nextInt();
        int[] numOfTheory = new int[n];
        int[] wake = new int[n];
        int sum=0;

        for (int i=0;i<n;i++){
            numOfTheory[i] = in.nextInt();
        }

        for (int i=0;i<n;i++){
            wake[i]= in.nextInt();
            if(wake[i] == 1){
                sum+=numOfTheory[i];
                numOfTheory[i]=0;
            }
        }

        int[] prefix = new int[n];

        prefix[0] =numOfTheory[0];
        for (int i=1;i<n;i++){
            prefix[i] = prefix[i-1] + numOfTheory[i];
        }

        int max=0;
        for (int i=0;i<=n-k;i++){
            int right=i+k-1 ;
            if(i == 0){
                max=Math.max(max,prefix[right]);
            }else {
                max=Math.max(max,(prefix[right]-prefix[i-1]));
            }
        }

        System.out.println(sum+max);

    }
}
