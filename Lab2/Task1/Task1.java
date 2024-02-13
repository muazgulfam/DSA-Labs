//package Lab2.Task1;
//package Lab2;

public class Task1 {

    public static void main(String[] args) {
        String firstName = "Muaz ";
        System.out.println("First Name: " + firstName);
        String lastName = "Gulfam";
        System.out.println("Last Name: " + lastName);
        String fullName = firstName + lastName;

        System.out.print("Is first name equal to the last name => ");
        System.out.println(firstName.equals(lastName));
        System.out.print("Is Fullname equal to the concatenated string of first and last name => ");
        System.out.print(fullName.equals(firstName + lastName));
    }
}