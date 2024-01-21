public class l6t1 {
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

    public static void dequeue() {
        if (isEmpty()) {
            System.out.println("Cannot dequeue the element, the Queue is empty.");
        } else {
            System.out.println(queue[front] + " have been dequeued!");
            front++;
        }
        if (front > rear) {
            front = rear = -1;
        }
    }

    public static void main(String[] args) {
        for (int i = 0, j = 2; i <= queue.length; i++, j += 2) {
            enqueue(j);
            System.out.println("Front is " + peek());
        }
        for (int i = 0, j = 2; i <= queue.length; i++, j += 2) {
            dequeue();
            System.out.println("Front is " + peek());
        }
        /*
         * enqueue(2);
         * System.out.println("Front is " + peek());
         * dequeue();
         * System.out.println("Front is " + peek());
         * dequeue();
         * System.out.println("Front is " + peek());
         */
    }
}
