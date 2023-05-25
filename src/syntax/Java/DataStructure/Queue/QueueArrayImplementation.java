package syntax.Java.DataStructure.Queue;

public class QueueArrayImplementation {

    int[] queue;
    int front;
    int rear;
    int size; // max element in queue

    QueueArrayImplementation(int size) {

        queue = new int[size];
        this.front = 0;
        this.rear = size - 1;
        this.size = 0; // size is now represent num of ele in queue
    }

    public void enqueue(int data) {

        // if rear equal capacity
        if (isFull()) {
            System.out.println("Overflow Error");
            return;
        } else {

            // increment rear to next index then add data
            rear--;
            queue[rear] = data;
            size++;
        }
        return;
    }

    public void dequeue() {

        // if front equal rear
        if (isNull()) {
            System.out.println("Underflow Error");
            return;
        } else {

            // increment front to next index then delete data
            front++;
            int temp = queue[front];
            queue[front] = temp;
            size--;
        }
    }

    public int front() {

        if (isNull()) {
            return Integer.MIN_VALUE;
        }
        return queue[front];
    }

    public int rear() {

        if (isNull()) {
            return Integer.MIN_VALUE;
        }
        return queue[rear];
    }

    public boolean isFull() {
        return (size == rear);
    }

    public boolean isNull() {
        return (size == 0);
    }

    public void print() {

        while (front != rear) {
            System.out.print(queue[front] + " ");
            front++;
        }
    }
}
