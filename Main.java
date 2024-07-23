import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100);
        }
//        BubbleSort.bubbleSort(arr);
//        SelectionSort.selectionSort(arr);
//        InsertionSort.insertionSort(arr);
//        QuickSort.quickSort(arr);
//        MergeSort.mergeSort(arr);
        CountSort.countingSort(arr);
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
