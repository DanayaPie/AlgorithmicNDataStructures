package syntax.Java.DataStructure.LinkedList.SinglyLinkedListImplementation;

public class SinglyLinkedList {

    SinglyLinkedListNode head = null;

    public void push(int data) {

        SinglyLinkedListNode newHead = new SinglyLinkedListNode(data);
        newHead.next = head;
        head = newHead;
    }

    public void insertAfter(int previousData, int data) {

        SinglyLinkedListNode currentNode = head;
        SinglyLinkedListNode newNode = new SinglyLinkedListNode((data));

        if (currentNode.data != previousData) {
            currentNode = currentNode.next;
        }

        newNode.next = currentNode.next;
        currentNode.next = newNode;
    }

    public void append(int data) {

        // if linked list is empty
        if (head == null) {
            head = new SinglyLinkedListNode(data);
            return;
        }

        SinglyLinkedListNode currentNode = head;

        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = new SinglyLinkedListNode(data);
    }

    public void deleteWithValue(int data) {

        if (head == null) {
            return;
        }

        SinglyLinkedListNode currentNode = head;

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

        SinglyLinkedListNode headNode = head;

        while (headNode != null) {
            System.out.println(headNode.data);
            headNode = headNode.next;
        }
    }
}
