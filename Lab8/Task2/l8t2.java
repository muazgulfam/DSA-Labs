import java.util.Scanner;

public class l8t2 {
    public static int binarySearch(int[] arr, int target, int low, int high) {
        if (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (target < arr[mid]) {
                return binarySearch(arr, target, low, mid - 1);
            } else {
                return binarySearch(arr, target, mid + 1, high);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };

        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println("}");

        System.out.print("Enter the element to search for: ");
        int target = scanner.nextInt();

        int index = binarySearch(arr, target, 0, arr.length - 1);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }

        scanner.close();
    }
}
