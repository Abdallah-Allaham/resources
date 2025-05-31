package problem_solving.Div3;

import java.util.Scanner;

public class NearlyLuckyNumber {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String num=in.next();
        int numOfLucky=0;

        for (int i=0;i<num.length();i++){
            if(num.charAt(i) == '4' || num.charAt(i) == '7'){
                numOfLucky++;
            }
        }

        boolean isLucky=true;

        String numToString=Integer.toString(numOfLucky);

        for(int i=0;i<numToString.length();i++){
           if(numToString.charAt(i) !='4' && numToString.charAt(i)!='7'){
               isLucky=false;
               break;
           }
        }

        if(isLucky){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }
}
