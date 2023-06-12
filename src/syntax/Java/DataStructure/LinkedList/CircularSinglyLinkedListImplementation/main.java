package syntax.Java.DataStructure.LinkedList.CircularSinglyLinkedListImplementation;

public class main {

    public static void main(String[] args) {

        CircularSinglyLinkedList linkedList = new CircularSinglyLinkedList();
        linkedList.push(0);
        linkedList.deleteValue(2);
        linkedList.append(1);
        linkedList.append(2);
        linkedList.insertAtIndex(3, 5);
        linkedList.deleteAtIndex(1);

        System.out.println("Size: " + linkedList.size());
        linkedList.printList();
    }
}
