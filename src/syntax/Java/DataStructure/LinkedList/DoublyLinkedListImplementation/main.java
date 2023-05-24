package syntax.Java.DataStructure.LinkedList.DoublyLinkedListImplementation;

public class main {

    public static void main(String[] args) {

        DoublyLinkedList linkedLise = new DoublyLinkedList();

        linkedLise.append(9);
        linkedLise.insertBefore(linkedLise.head, 3);
        linkedLise.insertAfter(linkedLise.head, 1);
        linkedLise.push(11);
        linkedLise.deleteNode(linkedLise.head.next);

        linkedLise.printList();
    }
}
