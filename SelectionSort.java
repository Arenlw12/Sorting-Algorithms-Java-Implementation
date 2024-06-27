public class SelectionSort {
    public static void selectionSort(int[] inputArray) {
        for (int i = 0; i < inputArray.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[minIndex] > inputArray[j]) {
                    minIndex = j;
                }
            }
            int temp = inputArray[minIndex];
            inputArray[minIndex] = inputArray[i];
            inputArray[i] = temp;
        }
    }
}
