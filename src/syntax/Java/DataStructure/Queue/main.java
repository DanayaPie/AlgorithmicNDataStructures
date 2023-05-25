package syntax.Java.DataStructure.Queue;

public class main {

    public static void main(String[] args) {

        QueueArrayImplementation queue = new QueueArrayImplementation(2);
        System.out.println(queue.isNull());
        queue.enqueue(5);
//        queue.enqueue(3);
//        queue.enqueue(1);
//        queue.dequeue();
        queue.print();
    }
}
