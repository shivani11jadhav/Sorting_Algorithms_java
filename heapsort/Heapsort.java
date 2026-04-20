public class HeapSort {

    public static void heapify(int arr[], int n, int i) {
        int largest = i;        // root
        int left = 2 * i + 1;   // left child
        int right = 2 * i + 2;  // right child

        // check left child
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // check right child
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // if root is not largest
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }
    }

    public static void heapSort(int arr[]) {
        int n = arr.length;

        // build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // extract elements
        for (int i = n - 1; i > 0; i--) {
            // swap root with last element
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // heapify reduced heap
            heapify(arr, i, 0);
        }
    }

    public static void printArr(int arr[]) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {6, 3, 9, 5, 2, 8};

        heapSort(arr);

        System.out.println("Sorted array:");
        printArr(arr);
    }
}
