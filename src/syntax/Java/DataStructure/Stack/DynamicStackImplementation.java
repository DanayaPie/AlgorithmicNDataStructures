package syntax.Java.DataStructure.Stack;

public class DynamicStackImplementation {

    StackNode top;

    public void push(int data) {

        StackNode newTop = new StackNode(data);

        if (top == null) {
            top = newTop;
        } else {

            top.next = top;
            top = newTop;
        }
    }

    public int pop() {

        int popped = Integer.MIN_VALUE;

        if (top == null) {
            System.out.println("Stack Underflow");
        } else {
            popped = top.data;
            top = top.next;
        }

        return popped;
    }

    public int peek() {

        if (top == null) {
            System.out.println("Stack Underflow");
            return Integer.MIN_VALUE;
        } else {
            return top.data;
        }
    }

    public boolean isEmpty() {

        if (top == null) {
            return true;
        } else {
            return false;
        }
    }

    public void print() {

        StackNode topNode = top;

        while (topNode != null) {
            System.out.println(topNode.data);
            topNode = topNode.next;
        }
    }

}

class StackNode {

    int data;
    StackNode next;

    public StackNode(int data) {
        this.data = data;
        this.next = null;
    }

}
