import java.util.Scanner;
public class l1t4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int capacityOfArray = 5;
        int arr[] = new int[capacityOfArray];

        int elements = 0;
        for(int i = 0; i < capacityOfArray; i++){
            elements++;
            System.out.print("Enter the element " + elements + " of an array  ");
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for(int i = 1; i < capacityOfArray; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("The minimum integer in the array is:  " + min);
    }
    
}
