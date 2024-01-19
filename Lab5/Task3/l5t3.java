public class l5t3 {
    public static void BinarySort(int[] arr) {
        int tempVar = 0;
        int counterForSwapping = 0;
        for (int j = 0; counterForSwapping == 0; j++) {
            counterForSwapping = 1;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    counterForSwapping = 0;
                    tempVar = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tempVar;
                }
            }
        }

        System.out.println("The sorted array is ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 9, 8, 7, 6, 5, 4, 1, 3, 0, 2 };
        BinarySort(arr);
    }
}
