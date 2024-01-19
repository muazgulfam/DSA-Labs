public class l1t1 {
    static int maxSize = 8;
    static String[] stack = new String[maxSize];
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
        } else {
            System.out.println("Could not insert data, Stack is full");
        }
    }

    public static void main(String[] args) {
        push("Ateeq");
        push("Anas");
        push("Abeer");
        push("Mohideen");
        push("Taimoor");
        push("Rutba");
        peek();
        pop();
        peek();
        pop();
        peek();
        pop();
        peek();
        pop();
        peek();
        pop();
        peek();
        pop();
        peek();
    }
}
