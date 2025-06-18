package problem_solving.Div2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AndryushaAndSocks {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        Set<Integer> socks = new HashSet<>();
        int max = 0;

        for (int i = 0; i < 2 * n; i++) {
            int sock = in.nextInt();
            if (socks.contains(sock)) {
                socks.remove(sock);
            } else {
                socks.add(sock);
            }

            if (socks.size() > max) {
                max = socks.size();
            }
        }

        System.out.println(max);
    }
}

/*        int[] socks=new int[n+1];
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
*/