public class l6t2 {

    static int maxSize = 10;

    static int front = -1, rear = -1;
    static int[] queue = new int[maxSize];

    public static boolean isFull() {
        if (rear >= maxSize - 1) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isEmpty() {
        if (front == -1 && rear == -1) {
            return true;
        } else {
            return false;
        }
    }

    public static int peek() {
        if (front >= 0) {
            return queue[front];
        } else {
            return 404;
        }
    }

    public static void enqueue(int element) {
        if (isFull()) {
            System.out.println("Cannot Enqueue the element,the Queue is full.\n");
        } else {
            if (front == -1 && rear == -1) {
                front = 0;
                rear = 0;
                queue[front] = element;
                System.out.println(element + " entered successfully!");
            } else {
                rear++;
                queue[rear] = element;
                System.out.println(element + " entered successfully!");
            }
        }
    }

    public static void ascendingPriorityDequeue() {
        int smallest = queue[0];
        if (isEmpty()) {
            System.out.println("Cannot dequeue the element, the Queue is empty.");
        } else {
            for (int i = 0; i < queue.length; i++) {
                if (queue[i] < smallest) {
                    smallest = queue[i];
                }

            }
            System.out.println(smallest + " have been dequeued!");
        }
    }

    public static void descendingPriorityDequeue() {
        int largest = queue[0];
        if (isEmpty()) {
            System.out.println("Cannot dequeue the element, the Queue is empty.");
        } else {
            for (int i = 0; i < queue.length; i++) {
                if (queue[i] > largest) {
                    largest = queue[i];
                }
            }
            front++;
            System.out.println(largest + " have been dequeued!");
        }
    }

    public static void main(String[] args) {
        for (int i = 0, j = 2; i < queue.length; i++, j += 2) {
            enqueue(j);
            System.out.println("Front is " + peek());
        }
        ascendingPriorityDequeue();
        System.out.println("Front is " + peek());
        /*
         * for (int i = 0, j = 2; i <= queue.length; i++, j += 2) {
         * descendingPriorityDequeue();
         * System.out.println("Front is " + peek());
         * }
         */
    }
}
