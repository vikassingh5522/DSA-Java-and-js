public class MergeSortAlg {

    private int[] array;
    private int[] tempMergArr;
    private int length;

    // Entry method to start sorting
    public void sort(int[] inputArr) {
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergArr = new int[length];
        divideArray(0, length - 1);
    }

    // Recursively divide the array
    private void divideArray(int lowerIndex, int higherIndex) {
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;

            // Divide left half
            divideArray(lowerIndex, middle);

            // Divide right half
            divideArray(middle + 1, higherIndex);

            // Merge the two halves
            mergeArray(lowerIndex, middle, higherIndex);
        }
    }

    // Merge two sorted halves
    private void mergeArray(int lowerIndex, int middle, int higherIndex) {
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
        }

        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;

        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from left half (if any)
        while (i <= middle) {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }
    }

    public static void main(String[] args) {
        int inputArr[] = { 40, 36, 13, 89, 12, 5, 8, 10, 30, 40, 50, 60, 70, 58, 88, 99, 45 };

        MergeSortAlg ms = new MergeSortAlg();
        ms.sort(inputArr);

        System.out.println("Sorted array:");
        for (int num : inputArr) {
            System.out.print(num + " ");
        }
    }
}
