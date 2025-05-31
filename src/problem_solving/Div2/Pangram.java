package problem_solving.Div2;

import java.util.Scanner;

public class Pangram {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n =in.nextInt();
        String word= in.next().toLowerCase();

        int[] frequencyArray=new int[30];

        for (int i=0;i<word.length();i++){
            frequencyArray[word.charAt(i)-'a']++;
        }

        for(int i=0;i<26;i++){
            if(frequencyArray[i] == 0){
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}
