package problem_solving.Div3;

import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String sum=in.next();
        String[] num=sum.split("\\+");

        int numOfA=0,numOfB=0,numOfC=0;

        for(int i=0;i<sum.length();i++){
            switch (sum.charAt(i)){
                case '1':
                    numOfA++;
                    break;
                case '2':
                    numOfB++;
                    break;
                case '3':
                    numOfC++;
                    break;
            }
        }

        String newSum="";
        for (int i=0;i<numOfA;i++){
            newSum += "1+";
        }

        for (int i=0;i<numOfB;i++){
            newSum += "2+";
        }

        for (int i=0;i<numOfC;i++){
            newSum += "3+";
        }

        newSum = newSum.substring(0,newSum.length()-1);

        System.out.println(newSum);

    }
}
