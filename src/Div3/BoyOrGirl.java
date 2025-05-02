package Div3;

import java.util.Scanner;

public class BoyOrGirl {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String name=in.next().toLowerCase();
        String newName="";

        for(int i=0;i<name.length();i++){
            if(!newName.contains(String.valueOf(name.charAt(i)))){
                newName += name.charAt(i);
            }
        }

        if(newName.length()%2==0){
            System.out.println("CHAT WITH HER!");
        }else{
            System.out.println("IGNORE HIM!");
        }

    }
}
