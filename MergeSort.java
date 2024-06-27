public class MergeSort {
    public static void mergeSort(int[] inputArray) {
        if (inputArray.length > 1) {
            int middle = inputArray.length / 2;
            int[] leftArray = new int[middle - 1];
            int[] rightArray = new int[inputArray.length - middle];


            mergeSort(leftArray);
            mergeSort(rightArray);

            int i = 0,j = 0,k = 0;
            
            while(i < leftArray.length && j < rightArray.length) {
                if (leftArray[i] < rightArray[j]) {
                    inputArray[k] = leftArray[i];
                    i++;
                }else {
                    inputArray[k] = leftArray[j];
                    j++;
                }
                k++;
            }
            while(i < leftArray.length) {
                inputArray[k] = leftArray[i];
                i++;
                k++;
            }
            while(j < rightArray.length) {
                inputArray[k] = leftArray[j];
                j++;
                k++;
            }
        }
    }
}
