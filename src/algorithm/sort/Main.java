package algorithm.sort;

public class Main {
    public static void main(String[] args){

        System.out.println("Bubble Sort");
        int[] arr = new int[10];
        for (int i=0;i<10;i++){
            arr[i] = (int)(1+Math.random()*(100));
        }

        for (int i=0;i<10;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        Sort.bubbleSort(arr);

        for (int i=0;i<10;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        Sort.bubbleSortDesc(arr);

        for (int i=0;i<10;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        /////////////////////////////////////////////////////////////////////////

        System.out.println("Selection Sort");
        int[] arr2 = new int[10];
        for (int i=0;i<10;i++){
            arr2[i] = (int)(1+Math.random()*(100));
        }

        for (int i=0;i<10;i++){
            System.out.print(arr2[i]+" ");
        }

        System.out.println();
        Sort.selectionSort(arr2);

        for (int i=0;i<10;i++){
            System.out.print(arr2[i]+" ");
        }

        System.out.println();
        Sort.selectionSortDesc(arr2);

        for (int i=0;i<10;i++){
            System.out.print(arr2[i]+" ");
        }

        System.out.println();

        /// ////////////////////////////////////////////////////////////////////////

        System.out.println("Insertion Sort");
        int[] arr3 = new int[10];
        for (int i=0;i<10;i++){
            arr3[i] = (int)(1+Math.random()*(100));
        }

        for (int i=0;i<10;i++){
            System.out.print(arr3[i]+" ");
        }

        System.out.println();
        Sort.insertionSort(arr3);

        for (int i=0;i<10;i++){
            System.out.print(arr3[i]+" ");
        }

        System.out.println();
        Sort.insertionSortDesc(arr3);

        for (int i=0;i<10;i++){
            System.out.print(arr3[i]+" ");
        }

    }
}
