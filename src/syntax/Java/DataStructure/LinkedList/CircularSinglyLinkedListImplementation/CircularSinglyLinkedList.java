package syntax.Java.DataStructure.LinkedList.CircularSinglyLinkedListImplementation;

public class CircularSinglyLinkedList {

    CircularSinglyLinkedListNode head = null;
    CircularSinglyLinkedListNode tail = null;

    public void push(int data) {

        CircularSinglyLinkedListNode newNode = new CircularSinglyLinkedListNode(data);

        // if linked list is empty
        if (head == null) {

            head = newNode;
            tail = newNode;
            newNode.next = head;

            // if linked list is not empty
        } else {

            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
    }

    public void append(int data) {

        CircularSinglyLinkedListNode newNode = new CircularSinglyLinkedListNode(data);

        // if linked list is empty
        if (head == null) {

            head = newNode;
            tail = newNode;
            newNode.next = head;

            // if linked list is not empty
        } else {

            newNode.next = head;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void insertAtIndex(int index, int data) {

        if (index <= 0) {
            push(data);
            return;
        }

        int size = size();

        if (index == size) {
            append(data);
            return;
        }

        if (index > size - 1) {

            System.out.println("Given index is larger than size of linked list");
            return;
        }

        int count = 0;
        CircularSinglyLinkedListNode currentNode = head;
        CircularSinglyLinkedListNode newNode = new CircularSinglyLinkedListNode(data);

        while (size > 0) {

            if (count == index - 1) {

                newNode.next = currentNode.next;
                currentNode.next = newNode;

            }

            currentNode = currentNode.next;
            count++;
            size--;
        }
    }

    int size() {

        int size = 0;
        if (head != null) {

            CircularSinglyLinkedListNode node = head;

            while (node.next != head) {
                node = node.next;
                size++;
            }

            size++;
        }

        return size;
    }

    public void printList() {

        CircularSinglyLinkedListNode headNode = head;

        if (head != null) {

            do {

                System.out.print(headNode.data + " -> ");
                headNode = headNode.next;
            } while (headNode != head);
        }

        System.out.println();
    }

    public void deleteFirst() {

        if (head == null) {
            return;
        } else {

            if (head != tail) {
                head = head.next;
                tail.next = head;
            } else {
                head = null;
                tail = null;
            }
        }
    }

    public void deleteLast() {

        if (head == null) {
            return;
        } else {

            if (head != tail) {

                CircularSinglyLinkedListNode currentNode = head;
                while (currentNode.next != tail) {

                    currentNode = currentNode.next;
                }

                tail = currentNode;
                tail.next = head;

            } else {

                head = null;
                tail = null;
            }
        }
    }

    public void deleteAtIndex(int index) {

        if (head == null || index < 0) {
            return;
        }

        if (index == 0) {
            deleteFirst();
            return;
        }

        int size = size();

        if (index == size - 1) {
            deleteLast();
            return;
        }

        if (index > size - 1) {

            System.out.println("Given index is larger than size of linked list");
            return;
        }

        int count = 1;
        CircularSinglyLinkedListNode currentNode = head.next;
        CircularSinglyLinkedListNode prev = head;

        while (size > 0) {

            if (index == count) {
                prev.next = currentNode.next;
                return;
            } else {

                prev = currentNode;
                currentNode = currentNode.next;

                count++;
                size--;
            }
        }
    }

    public void deleteValue(int data) {

        if (head == null) {
            return;
        }

        if (data == head.data) {
            deleteFirst();
            return;
        }

        if (data == tail.data) {
            deleteLast();
            return;
        }

        CircularSinglyLinkedListNode currentNode = head;

        while (currentNode.next != head) {

            if (currentNode.next.data == data) {
                currentNode.next = currentNode.next.next;
                return;
            }

            currentNode = currentNode.next;
        }

        System.out.println("No element with value of " + data);
    }
}
