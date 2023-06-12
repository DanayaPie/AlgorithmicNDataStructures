package syntax.Java.DataStructure.LinkedList.DoublyLinkedListImplementation;

public class DoublyLinkedList {

    DoublyLinkedListNode head = null;

    public void push(int data) {

        DoublyLinkedListNode newHead = new DoublyLinkedListNode(data);
        newHead.next = head;

        if (head != null) {
            head.prev = newHead;
        }

        head = newHead;
    }

    public void insertAfter(DoublyLinkedListNode prevNode, int data) {

        // previous node cannot be null
        if (prevNode == null) {
            System.out.println("Given previous node cannot be null");
            return;
        }

        DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);

        newNode.next = prevNode.next;
        prevNode.next = newNode;
        newNode.prev = prevNode;

        if (newNode.next != null) {
            newNode.next.prev = newNode;
        }
    }

    public void insertBefore(DoublyLinkedListNode nextNode, int data) {

        // next node cannot be null
        if (nextNode == null) {
            System.out.println("Given next node cannot be null");
            return;
        }

        DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);

        newNode.prev = nextNode.prev;
        nextNode.prev = newNode;
        newNode.next = nextNode;

        if (newNode.prev != null) {
            newNode.prev.next = newNode;
        } else {
            head = newNode;
        }
    }

    public void append(int data) {

        DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
        DoublyLinkedListNode lastNode = head;

        newNode.next = null; // last node's next point to null

        // if list is empty
        if (head == null) {
            head = new DoublyLinkedListNode(data);
            return;
        }

        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }

        lastNode.next = newNode;
        newNode.prev = lastNode;
    }

    public void deleteNode(DoublyLinkedListNode delNode) {

        if (head == null) {
            head = delNode;
            return;
        }

        // if node to delete is head
        if (delNode == head) {
            head = delNode.next;
        }

        // node to delete is not last node
        if (delNode.next != null) {
            delNode.next.prev = delNode.prev;
        }

        // node to delete is not first node
        if (delNode.prev != null) {
            delNode.prev.next = delNode.next;
        }

        return;
    }

    public void printList() {

        DoublyLinkedListNode headNode = head;

        while (headNode != null) {
            System.out.println(headNode.data);
            headNode = headNode.next;
        }
    }
}
