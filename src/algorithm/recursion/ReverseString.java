package algorithm.recursion;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter A String To Print it to reverse");
        String name= in.next();
        reverseString(name,name.length()-1);
    }

    public static void reverseString(String name,int length){
        if (length == 0)
            System.out.print(name.charAt(length));
        else {
            System.out.print(name.charAt(length));
            reverseString(name,length-1);
        }
    }
}
