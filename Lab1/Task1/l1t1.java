import java.util.Scanner;

class l1t1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Initializing an Array consisting of 15 elements
        int capacityOfArray = 15;
        int arr[] = new int[capacityOfArray];

        // Taking 15 elements as Input
        int elements = 0;
        int sum = 0;
        for (int i = 0; i < capacityOfArray; i++) {
            elements++;
            System.out.print("Enter the element " + elements + " of an array  ");
            arr[i] = sc.nextInt();
            // Calculating the Sum
            sum += arr[i];
        }

        // Calculating the Average & desplaying result
        double average = Double.valueOf(sum) / Double.valueOf(capacityOfArray);
        System.out.println("The sum of all the element is:  " + sum + "\nThe Average is:  " + average);
    }
}