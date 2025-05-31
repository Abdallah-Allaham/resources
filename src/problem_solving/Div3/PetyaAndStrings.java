package problem_solving.Div3;

import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s1=in.next().toLowerCase();
        String s2= in.next().toLowerCase();

        if(!s1.equals(s2)){
            for(int i=0;i<s1.length();i++){
                if(s1.charAt(i)>s2.charAt(i)){
                    System.out.println(1);
                    break;
                }else if(s1.charAt(i)<s2.charAt(i)){
                    System.out.println(-1);
                    break;
                }
            }
        }else
            System.out.println(0);
    }
}
