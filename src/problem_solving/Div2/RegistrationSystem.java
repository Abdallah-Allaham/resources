package problem_solving.Div2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RegistrationSystem {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        Map<String,Integer> names = new HashMap<>();

        for (int i=0;i<n;i++){
            String name= in.next();
            if (names.containsKey(name)){
                int count=names.get(name);
                System.out.println(name+count);
                names.put(name,count+1);
            }else {
                names.put(name,1);
                System.out.println("OK");
            }
        }
    }
}
