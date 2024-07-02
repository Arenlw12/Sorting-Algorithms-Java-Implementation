public class MergeSort {
    public static void mergeSort(int[] inputArray) {
        if (inputArray.length < 2) {
            return;
        }
        int middle = inputArray.length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[inputArray.length - middle];

        for (int i = 0; i < middle; i++) {
            leftArray[i] = inputArray[i];
        }
        for (int j = middle; j < inputArray.length; j++) {
            rightArray[j - middle] = inputArray[j];
        }

        mergeSort(leftArray);
        mergeSort(rightArray);

        int i = 0, j = 0, k = 0;

        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j]) {
                inputArray[k] = leftArray[i];
                i++;
            } else {
                inputArray[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i < leftArray.length) {
            inputArray[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < rightArray.length) {
            inputArray[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
