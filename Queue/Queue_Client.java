public class Queue_Client {
    public static void main(String[] args) throws Exception {
        Queue q = new Queue();
        System.out.println(q.size());
        q.Enqueue(10);
        q.Enqueue(20);
        q.Enqueue(30);
        q.Enqueue(40);
        q.Enqueue(50);
        // q.Enqueue(60);
        System.out.println(q.Dequeue());
        System.out.println(q.Dequeue());
        q.Enqueue(70);
        q.Display();
    }
}
