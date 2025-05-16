package Div3;

import java.util.Scanner;

public class AntonAndDanik {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);

        int numOfGames= in.nextInt();
        String row= in.next().toUpperCase();
        int numOfA=0;
        int numOfD=0;

        for(int i=0;i<row.length();i++){
            if(row.charAt(i) == 'A'){
                numOfA++;
            }else {
                numOfD++;
            }
        }

        if(numOfA>numOfD){
            System.out.println("Anton");
        } else if (numOfA<numOfD) {
            System.out.println("Danik");
        }else {
            System.out.println("Friendship");
        }
    }
}
