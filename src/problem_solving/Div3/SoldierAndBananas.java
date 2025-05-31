package problem_solving.Div3;

import java.util.Scanner;

public class SoldierAndBananas {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);

        long k= in.nextLong();
        long n= in.nextLong();
        long w= in.nextLong();

        long sum=0;
        long borrow=0;

        for (int i=1;i<=w;i++){
            sum+=i*k;
        }

        if(n>=sum){
            System.out.println(0);
        }else {
            borrow=Math.abs(n-sum);
            System.out.println(borrow);
        }
    }
}
