package Div3;

import java.util.Scanner;

public class WrongSubtraction {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        long num= in.nextLong();
        long steps= in.nextLong();

        for(int i=0;i<steps;i++){
            long lastNum =num%10;
            if(lastNum>0){
                num--;
            }else {
                num/=10;
            }
        }

        System.out.println(num);
    }
}
