public class CountSort {
    public static void countingSort(int[] inputArray) {
        int min = inputArray[0];
        int max = inputArray[0];
        int k = 0;

        for (int j : inputArray) {
            if (j > max)
                max = j;
            if (j < min)
                min = j;
        }

        int[] bucket = new int[max - min + 1];

        for (int value : inputArray) {
            bucket[value - min]++;
        }

        for (int i = 0; i < bucket.length; i++) {
            int count = bucket[i];
            for (int j = 0; j < count; j++) {
                inputArray[k] = i + min;
                k++;
            }
        }
    }
}
