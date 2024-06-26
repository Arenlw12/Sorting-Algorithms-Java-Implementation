import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(10000);
        }
        BubbleSort.bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
