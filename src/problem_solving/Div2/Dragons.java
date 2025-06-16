package problem_solving.Div2;

import java.util.*;

public class Dragons {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int s= in.nextInt();
        int n= in.nextInt();
        List<Pair<Integer,Integer>> dragons=new ArrayList<>();

        for (int i = 0; i < n; i++) {
            dragons.add(new Pair<>(in.nextInt(), in.nextInt()));
        }

        dragons.sort(Comparator.comparingInt(Pair::getFirst));

        for (int i = 0; i < n; i++) {
            if(s>dragons.get(i).getFirst()){
                s+=dragons.get(i).getSecond();
            }else {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");

    }
}

class Pair<K,V>{
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getFirst() {
        return key;
    }

    public V getSecond() {
        return value;
    }
}
