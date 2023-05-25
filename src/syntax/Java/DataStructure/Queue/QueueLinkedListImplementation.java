package syntax.Java.DataStructure.Queue;

public class QueueLinkedListImplementation {

    QueueNode front;
    QueueNode rear;
    int size;

    public QueueLinkedListImplementation() {
        this.front = null;
        this.rear = null;
    }

    void enqueue(int data) {

        QueueNode temp = new QueueNode(data);

        if (rear == null) {
            front = temp;
            rear = temp;
            size++;
        } else {
            rear.next = temp;
            rear = temp;
            size++;
        }
    }

    void dequeue() {

        if (front == null) {

            System.out.println("Underflow Error");
            return;
        }

        QueueNode temp = front;
        front = front.next;

        if (front == null) {
            rear = null;
        }
        size--;
    }

    int front() {
        if (front == null) {
            return -1;
        }
        return front.data;
    }

    int rear() {
        if (rear == null) {
            return -1;
        }
        return rear.data;
    }

    boolean isEmpty() {
        return (front == null && rear == null);
    }

    void print() {

        while (front != rear) {
            System.out.print(front.data + " ");
            front = front.next;
        }
    }
}

class QueueNode {

    int data;
    QueueNode next;

    public QueueNode(int data) {
        this.data = data;
        this.next = null;
    }
}
