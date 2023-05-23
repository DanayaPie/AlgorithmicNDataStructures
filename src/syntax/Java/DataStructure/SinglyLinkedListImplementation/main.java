package syntax.Java.DataStructure.SinglyLinkedListImplementation;

public class main {

    public static void main(String[] args) {

        SinglyLinkedList linkedList = new SinglyLinkedList();

        linkedList.append(0);
        linkedList.push(5);
        linkedList.insertAfter(0, 3);
        linkedList.deleteWithValue(0);

        linkedList.printList();
    }
}
