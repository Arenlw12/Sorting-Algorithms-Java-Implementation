import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(10000);
        }
//        BubbleSort.bubbleSort(arr);
//        SelectionSort.selectionSort(arr);
//        InsertionSort.insertionSort(arr);
        QuickSort.quickSort(arr);
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
