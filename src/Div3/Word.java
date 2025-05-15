package Div3;

import java.util.Scanner;

public class Word {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);

        String word=in.next();
        long numOfLower=0;
        long numOfUpper=0;

        for(int i=0;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i))){
                numOfUpper++;
            }else {
                numOfLower++;
            }
        }

        if(numOfUpper>numOfLower){
            System.out.println(word.toUpperCase());
        }else {
            System.out.println(word.toLowerCase());
        }
    }
}
