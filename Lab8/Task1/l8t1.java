import java.util.Scanner;

public class l8t1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[20];

        System.out.println("Enter 20 integer elements for the array:");
        for (int i = 0; i < 20; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to search:");
        int key = sc.nextInt();

        int index = linearSearch(arr, key);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }

        sc.close();
    }

    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
