package syntax.Java.DataStructure.SinglyLinkedListImplementation;

public class main {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        linkedList.append(0);
        linkedList.append(5);
        linkedList.deleteWithValue(0);

        linkedList.printList();
    }
}
