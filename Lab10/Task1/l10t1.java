public class l10t1 {
    // Function to construct max heap
    public static void buildMaxHeap(int[] arr) {
        int n = arr.length;

        // Build max heap from the bottom-up approach
        for (int i = (n / 2) - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }

    // Function to heapify a subtree rooted at index i
    public static void heapify(int[] arr, int n, int i) {
        int largest = i; // Initialize largest as root
        int left = 2 * i + 1; // Left child
        int right = 2 * i + 2; // Right child

        // If left child is larger than root
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // If right child is larger than largest so far
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // If largest is not root
        if (largest != i) {
            // Swap arr[i] and arr[largest]
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    // Function to print the heap
    public static void printHeap(int[] arr) {
        System.out.print("Max Heap: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 12, 11, 13, 6, 5, 7 };
        System.out.println("Original array:");
        printHeap(arr);

        buildMaxHeap(arr);

        System.out.println("Max heap after construction:");
        printHeap(arr);
    }
}
