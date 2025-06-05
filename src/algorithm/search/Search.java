package algorithm.search;

public class Search {

    public static int x=0;
    //O(n)
    public static int linearSearch(int[] arr , int key){
        for (int i=0; i<arr.length;i++){
            if (arr[i] == key) return i;
        }

        return -1;
    }

    //O(log n) && the array must be sorted
    public static int binarySearch(int[] arr , int key){
        int first=0 , last=arr.length-1;
        int mid ;

        while (first<=last){
            mid = (first+last)/2;
            if (arr[mid] == key) return mid;
            else if (arr[mid] > key) last = mid-1;
            else first = mid+1;
        }
        return -1;
    }
}
