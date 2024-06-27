public class QuickSort {
    public static void quickSort(int[] inputArray, int low, int high) {
        if (low < high) {
           int partitionIndex = partition(inputArray, low, high);
           quickSort(inputArray,low,partitionIndex - 1);
           quickSort(inputArray,partitionIndex + 1, high);
        }
    }
    public static void quickSort(int[] inputArray) {
        quickSort(inputArray, 0, inputArray.length - 1);
    }
    private static int partition(int[] inputArray, int low, int high) {
        int i = low - 1;
        int pivot = inputArray[high];

        for (int j = low; j < high; j++) {
            if (inputArray[j] < pivot) {
                i++;
                int temp = inputArray[i];
                inputArray[i] = inputArray[j];
                inputArray[j] = temp;
            }
        }
        int temp = inputArray[i + 1];
        inputArray[i + 1] = inputArray[high];
        inputArray[high] = temp;
        return i + 1;
    }
}
