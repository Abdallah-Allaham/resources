package problem_solving.Div2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lecture {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n= in.nextInt();
        int m= in.nextInt();
        Map<String,String> map= new HashMap<>();

        for (int i = 0; i < m; i++) {
            String word1=in.next();
            String word2=in.next();

            map.put(word1,word2);
        }

        String allWord="";
        for (int i = 0; i < n; i++) {
            String word=in.next();
            String value=map.get(word);

            if (word.length()<=value.length()){
                allWord += word+" ";
            }else {
                allWord +=value+" ";
            }
        }

        System.out.println(allWord);

    }
}


//            if (wrod2.length()<word1.length()){
//                map.put(word1,wrod2);
//            }else {
//                map.put(word1,word1);
//            }