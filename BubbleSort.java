public class BubbleSort {
    public static void bubbleSort(int[] inputArray) {
        int i, j, temp;
        boolean isSwapped;
        for (i = 0; i < inputArray.length - 1; i++) {
            isSwapped = false;
            for (j = 0; j < inputArray.length - i - 1; j++) {
                if (inputArray[j] > inputArray[j + 1]) {
                    temp = inputArray[j];
                    inputArray[j] = inputArray[j + 1];
                    inputArray[j + 1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped)
                break;
        }
    }
}
