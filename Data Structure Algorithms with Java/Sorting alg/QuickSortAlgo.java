class QuickSortAlgo
{
    public static void main(String[] args)
    {
        // Input array to sort
        int[] arr = {15, 9, 7, 13, 12, 16, 4, 18, 11};
        int len = arr.length;
        // Create object to access non-static methods
        QuickSortAlgo qsm = new QuickSortAlgo();
        // Call QuickSort for entire array
        qsm.quickSortRecursion(arr, 0, len - 1);
        // Print the sorted array
        qsm.printArray(arr);
    }
    // partition(): chooses pivot and rearranges elements
    int partition(int[] arr, int low, int high)
    {
        // Pivot is the middle element
        int pivot = arr[(low + high) / 2];

        // Continue until low index crosses high index
        while (low <= high)
        {
            // Move low pointer forward until value >= pivot
            while (arr[low] < pivot)
            {
                low++;
            }
            // Move high pointer backward until value <= pivot
            while (arr[high] > pivot)
            {
                high--;
            }
            // If low <= high, swap the values
            if (low <= high)
            {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;

                // Move both pointers towards center
                low++;
                high--;
            }
        }
        // Return the partition index (new low)
        return low;
    }
    // quickSortRecursion(): Recursively sorts left + right partitions
    void quickSortRecursion(int[] arr, int low, int high)
    {
        // Get partition index based on pivot
        int pi = partition(arr, low, high);
        // Sort left side of pivot
        if (low < pi - 1)
        {
            quickSortRecursion(arr, low, pi - 1);
        }
        // Sort right side of pivot
        if (pi < high)
        {
            quickSortRecursion(arr, pi, high);
        }
    }
    // printArray(): prints the array
    void printArray(int[] arr)
    {
        for (int i : arr)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
