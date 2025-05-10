package Div3;

import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String word=in.next();

        String c= String.valueOf(word.charAt(0)).toUpperCase();
        word = c+word.substring(1);
        System.out.println(word);
    }
}
