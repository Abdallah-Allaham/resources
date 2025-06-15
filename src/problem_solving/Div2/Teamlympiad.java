package problem_solving.Div2;

import java.util.ArrayList;
import java.util.Scanner;

public class Teamlympiad {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        ArrayList<Integer> programmers= new ArrayList<>();
        ArrayList<Integer> math= new ArrayList<>();
        ArrayList<Integer> sport= new ArrayList<>();


        for (int i = 1; i <= n; i++) {
            int child= in.nextInt();
            if (child==1){
                programmers.add(i);
            }else if (child==2){
                math.add(i);
            }else {
                sport.add(i);
            }
        }

        int w= Math.min(programmers.size(),Math.min(math.size(),sport.size()));

        System.out.println(w);
        for (int i=0;i<w;i++){
            System.out.println(programmers.get(i)+" "+math.get(i)+" "+sport.get(i));
        }
    }
}
