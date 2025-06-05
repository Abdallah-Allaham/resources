package algorithm.sort;

public class Sort {

    //O(n^2) for both
    public static void bubbleSort(int[] arr){
        int temp;
        for (int i=0;i<arr.length;i++){
            for (int j=1;j<arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void bubbleSortDesc(int[] arr){
        int temp;
        for (int i=0;i<arr.length;i++){
            for (int j=1;j<arr.length-i;j++){
                if(arr[j-1]<arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    //O(n^2) for both
    public static void selectionSort(int[] arr){
        int temp;
        for (int i=0;i<arr.length;i++){
            int minIndex=i;
            for (int j=i+1;j<arr.length;j++){
                if(arr[minIndex]>arr[j]){
                    minIndex=j;
                }
            }
            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void selectionSortDesc(int[] arr){
        int temp;
        for (int i=0;i<arr.length;i++){
            int maxIndex=i;
            for (int j=i+1;j<arr.length;j++){
                if(arr[maxIndex]<arr[j]){
                    maxIndex=j;
                }
            }
            temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }
    }

    //O(n^2) for worst case  &&  O(n) for best case
    public static void insertionSort(int[] arr){
        for (int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;

            while ((j>-1) && (arr[j] > key)){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    public static void insertionSortDesc(int[] arr){
        for (int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;

            while ((j>-1) && (arr[j] < key)){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}
