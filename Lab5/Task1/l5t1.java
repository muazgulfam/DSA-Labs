public class l5t1 {
    public static void main(String[] args) {

        int[] list = { 10, 55, 0, 4, 60, 35, 78, 31, 6, 3 };

        if (list.length > 1) {
            int pivot = list[0];
            /*
             * for (int i = list[1], j = list[list.length - 1]; indexOf(list, i) <
             * indexOf(list, j); i++, j--) {
             * 
             * }
             */
            int i = list[indexOf(list, pivot) + 1], j = list[list.length - 1];
            while (indexOf(list, i) < indexOf(list, j)) {
                do {
                    i++;
                } while (list[i] < pivot);
                do {
                    j--;
                } while (list[j] > pivot);
                int tempVar = j;
                list[j] = list[i];
                list[i] = tempVar;

                for (i = 0, j = 10; i <= 10; i++, j--) {
                    System.out.println("hi");
                }
            }

            for (int k = 0; k < list.length; k++) {
                System.out.println(list[k] + "  ");
            }
        } else {
            System.out.println("The items in the list consist of only one Element,hence it cannot be sorted");
        }
    }

    public static int indexOf(int[] arr, int element) {
        boolean isElementFound = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                isElementFound = true;
                return i;
            }
        }
        if (isElementFound == false) {
            System.out.println("The element does not exist in the List");
        }
        return 404;
    }
}