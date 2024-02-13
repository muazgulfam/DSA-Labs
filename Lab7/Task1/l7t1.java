public class l7t1 {
    Node head;

    // Creation
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;

        }
    }

    public void insertion(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("Operation can not be performed, the list is empty");
        } else {
            head = head.next;
        }
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("Operation can not be performed, the list is empty");
        } else if (head.next == null) {
            head = null;
        } else {
            Node secondLastNode = head;
            Node lastNode = head.next;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
                secondLastNode = secondLastNode.next;
            }
            secondLastNode.next = null;
        }
    }

    // Traversing
    public void printList() {
        if (head == null) {
            System.out.println("Operation can not be performed, the list is empty");
        } else {
            Node traversingNode = head;
            while (traversingNode != null) {
                System.out.print(traversingNode.data + " -> ");
                traversingNode = traversingNode.next;
            }
            System.out.print("NULL");
        }
    }

    public static void main(String[] args) {
        l7t1 list = new l7t1();
        list.insertion("A");
        list.insertion("B");
        list.insertion("C");
        list.insertion("D");
        list.printList();
        list.deleteLast();
        System.out.println("");
        list.printList();
        list.deleteFirst();
        System.out.println("");
        list.printList();
    }
}
