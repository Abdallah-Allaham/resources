package problem_solving.Div2;

import java.util.*;

public class SecondOrderStatistics {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int num= in.nextInt();
        Set<Integer> set = new TreeSet<>();

        for (int i = 0; i < num; i++) {
            set.add(in.nextInt());
        }

        Queue<Integer> queue=new LinkedList<>(set);
        if (queue.size()>=2){
            queue.poll();
            System.out.println(queue.peek());
        }else {
            System.out.println("NO");
        }
    }
}
