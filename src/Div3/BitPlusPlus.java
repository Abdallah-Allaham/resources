package Div3;

import java.util.Scanner;

public class BitPlusPlus {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int x=0;
        String operation;

        int count= in.nextInt();
        for(int i=0;i<count;i++){
            operation= in.next();
            if(operation.contains("++") && operation.contains("X")){
                x++;
            }else if(operation.contains("--") && operation.contains("X")){
                x--;
            }
        }
        System.out.println(x);
    }
}
