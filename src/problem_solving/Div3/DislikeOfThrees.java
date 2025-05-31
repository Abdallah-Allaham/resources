package problem_solving.Div3;

import java.util.Scanner;

public class DislikeOfThrees {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int test= in.nextInt();
        int[] k=new int[1000];
        int allNum=1;
        int count=0;

        while (count<k.length){
            int lastNum=allNum%10;
            if(allNum % 3 != 0 && lastNum != 3){
                k[count]=allNum;
                count++;
            }
            allNum++;
        }

        while (test>0){
            int num= in.nextInt();
            System.out.println(k[num-1]);
            test--;
        }
    }
}
