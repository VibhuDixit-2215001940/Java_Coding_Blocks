public class Main {
    public static void main(String[] args) {
        LL ll = new LL();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addFirst(40);
        ll.addLast(00);
        ll.addMiddle(100, 3);
        ll.display();
        System.out.println("First ele deleted:- "+ll.deleteFirst());
        ll.display();
    }
}
