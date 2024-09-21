public class ll {
    class Node{
        int val;
        Node next;
    }
    private static Node head;
    private static Node tail;
    private static int size;
    public static void addFirst(int item){
        Node nn = new Node();//step1 - create new node
        nn.val = item;
        if(head == null){
            head = tail = nn;
            size++;
        }
        else{
            nn.next = head;
            head = nn;
            size++;
        }
    }
    public static void display(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.val+"-->");
            temp = temp.next;
        }
        System.out.println(".");
    }
}