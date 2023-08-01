package syntax.Java.DataStructure.LinkedList.CircularLinkedListFromArrayImplementation;

public class CircularLinkedListFromArray {

    public static void main(String[] args) {

        int[] nums = {0, 1, 2, 3, 4};

        CircularLinkedListFromArrayNode head = createCircularLinkedList(nums);

        printList(head);
    }

    public static CircularLinkedListFromArrayNode createCircularLinkedList(int[] nums) {

        CircularLinkedListFromArrayNode head = new CircularLinkedListFromArrayNode(nums[0]);
        CircularLinkedListFromArrayNode currentNode = head;

        for (int i = 1; i < nums.length; i++) {

            CircularLinkedListFromArrayNode newNode = new CircularLinkedListFromArrayNode(nums[i]);
            currentNode.next = newNode;
            currentNode = newNode;
        }

        currentNode.next = head;

        return head;
    }

    public static void printList(CircularLinkedListFromArrayNode head) {

        CircularLinkedListFromArrayNode headNode = head;

        if (head != null) {

            do {

                System.out.print(headNode.data + " -> ");
                headNode = headNode.next;
            } while (headNode != head);
        }

        System.out.println();
    }
}
