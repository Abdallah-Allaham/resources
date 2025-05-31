package data_structure.array_list_ds;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDs {

    public static void main(String[] args){
        ArrayList arrayList = new ArrayList();
        System.out.println(arrayList.size());

        arrayList.add("Abood");
        arrayList.add(5);
        arrayList.add(true);
        System.out.println(arrayList);

        String name = (String)arrayList.get(0);
        System.out.println(arrayList.get(1));



        ArrayList<Integer> integers = new ArrayList<>();
        for (int i=10;i>=1;i--){
            integers.add(i);
        }
        System.out.println(integers);


        arrayList.addAll(integers);
        System.out.println(arrayList);
        arrayList.removeAll(integers);
        System.out.println(arrayList);
        System.out.println(integers.subList(2,5));


        Collections.sort(integers);
        System.out.println(integers);
        System.out.println(Collections.binarySearch(integers,3));
        System.out.println(Collections.max(integers));
        Collections.reverse(integers);
        System.out.println(integers);
        System.out.println(Collections.min(integers));
        integers.clear();
        arrayList.clear();
        System.out.println(integers);
    }
}
