public class QuickSort {

    // Partition function
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];  // last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // place pivot in correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // Quick Sort function
    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);   // left part
            quickSort(arr, pi + 1, high);  // right part
        }
    }

    // Print array
    public static void printArray(int arr[]) {
        for (int x : arr)
            System.out.print(x + " ");
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        int arr[] = {10, 7, 8, 9, 1, 5};

        System.out.println("Before Sorting:");
        printArray(arr);

        quickSort(arr, 0, arr.length - 1);

        System.out.println("After Sorting:");
        printArray(arr);
    }
}
