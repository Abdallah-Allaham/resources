package Div2;

import java.util.Scanner;

public class AndryushaAndSocks {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] socks=new int[n+1];
        int maxNum=1;
        int currentNum=1;


        for(int i=0;i<2*n;i++){
            int input= in.nextInt();
            socks[input]++;
            if(i>0){
                if(socks[input] == 2){
                    currentNum--;
                }
                else {
                    currentNum++;
                }
            }

            if(currentNum>maxNum){
                maxNum=currentNum;
            }
        }

        System.out.println(maxNum);

    }
}
