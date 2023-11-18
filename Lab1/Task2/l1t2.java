import java.util.Scanner;
public class l1t2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int capacityOfArray = 5;
        int arr1[] = new int[capacityOfArray];
        int arr2[] = new int[capacityOfArray];

        int elements = 0;
        for(int i = 0; i < capacityOfArray; i++){
            elements++;
            System.out.print("Enter the element " + elements + " of an array  ");
            arr1[i] = sc.nextInt();
            arr2[i] = arr1[i];
        }

        System.out.print("The elements of copied array are:  ");
        for(int i = 0; i < capacityOfArray; i++){
            System.out.print(arr2[i] + " ");
        }
    }
}
