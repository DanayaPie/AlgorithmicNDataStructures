package syntax.Java.DataStructure.Stack;

public class FixedSizeStackImplementation {

    // stack array with max of 500 elements
    int[] stackArr = new int[500];

    int top = -1;

    public boolean push(int data) {

        if (top >= stackArr.length - 1) {
            System.out.println("Stack Overflow");
            return false;
        } else {

            top++;
            stackArr[top] = data;
            return true;
        }
    }

    public int pop() {

        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {

            int data = stackArr[top];
            top--;
            return data;
        }
    }

    public int peek() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            return stackArr[top];
        }
    }

    public int top() {
        return stackArr[top];
    }

    public boolean isEmpty() {

        return (top < 0);
    }

    public void print() {

        for (int i = top; i > -1; i--) {
            System.out.print(stackArr[i] + " ");
        }
    }
}
