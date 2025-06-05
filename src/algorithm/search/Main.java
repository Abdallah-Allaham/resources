package algorithm.search;

import java.util.Random;

public class Main {
    public static void main(String[] args){

        int[] arr = new int[20];
        for (int i=0;i<20;i++){
            arr[i] = (int)(1+Math.random()*(100));
        }

        System.out.println(Search.linearSearch(arr,30));
        System.out.println(Search.linearSearch(arr,66));

        /// //////////////////////////////////////////////////////////////////

        int[] sortedArray=new int[20];
        int num=5;
        for (int i=0;i<arr.length;i++){
            sortedArray[i] =num+=5;
        }

        System.out.println(Search.binarySearch(sortedArray,55));
        System.out.println(Search.binarySearch(sortedArray,33));
        System.out.println(Search.linearSearch(sortedArray,100));

    }
}
