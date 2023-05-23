package syntax.Java.DataStructure.SinglyLinkedListImplementation;

public class LinkedList {

    Node head = null;

    public void push(int data) {

        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    public void insertAfter(int previousData, int data) {

        Node currentNode = head;
        Node newNode = new Node((data));

        if (currentNode.data != previousData) {
            currentNode = currentNode.next;
        }

        newNode.next = currentNode.next;
        currentNode.next = newNode;
    }

    public void append(int data) {

        Node currentNode = head;

        // if linked list is empty
        if (head == null) {
            head = new Node(data);
            return;
        }

        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = new Node(data);
    }

    public void deleteWithValue(int data) {

        Node currentNode = head;

        if (head == null) {
            return;
        }

        // if head data is the one to delete
        if (head.data == data) {
            head = head.next;
            return;
        }

        while (currentNode.next != null) {

            // next value is the one to delete
            if (currentNode.next.data == data) {
                currentNode.next = currentNode.next.next;
                return;
            }

            currentNode = currentNode.next;
        }
    }

    public void printList() {

        Node headNode = head;

        while (headNode != null) {
            System.out.println(headNode.data);
            headNode = headNode.next;
        }
    }
}
