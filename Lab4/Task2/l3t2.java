//package Lab4.Task2;

public class l3t2 {
    static int maxSize = 8;
    static String[] stack = new String[10];
    static int top = -1;

    public static boolean isEmpty() {
        if (top == -1) {
            return true;
        } else
            return false;
    }

    public static boolean isFull() {
        if (top == maxSize) {
            return true;
        } else {
            return false;
        }
    }

    public static String peek() {
        return stack[top];
    }

    public static String pop() {
        String data = "";
        if (!isEmpty()) {
            data = stack[top];
            top = top - 1;
            return data;
        } else {
            System.out.println("Could not retrieve data, Stack is empty");
        }
        return data;
    }

    public static void push(String data) {
        if (!isFull()) {
            top = top + 1;
            stack[top] = data;
            System.out.println(data + " Entered successfully into the stack");
        } else {
            System.out.println("Could not insert data, Stack is full");
        }
    }

    public static void main(String[] args) {
        push("Ahtesham");
        push("Mansoor");
        push("Abbas");
        push("Anas");
        push("Taimoor");
        push("Altamash");
        push("Kashif");
        push("Muaz");
        push("Hasan");
        push("Amir");

    }
}
