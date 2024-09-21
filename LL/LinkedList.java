public class LinkedList{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){        
        Node newNode = new Node(data);//step1 - create new node
        size++;
        if(head == null){
            head = tail = newNode;
            return ;
        }
        newNode.next = head;//step2-address is stored in next       
        head = newNode;//step3 - head = newNode       
    }
    public void addMid(int idx,int data){
        if(idx == 0){
            addFirst(data);
            return ;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;//i=idx-1 temp -> prev
        temp.next = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);//step1 - create new node
        size++;
        if(head == null){
            head = tail = newNode;
            return ;
        }
        tail.next = newNode;//step2-address is stored in
        tail = newNode;
    }
    public int removeFirst(){
        if(size==0){
            System.out.println("LL is empty...");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public void print(){//O(n)
        if(head == null){
            System.out.println("LL is empty...");
            return ;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println();
    }
    public int removeLast(){ 
        if(size==0){
            System.out.println("LL is empty...");
            return Integer.MAX_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node temp = head;
        while(temp.next.next!=null){
            temp = temp.next;
        }
        int val = temp.next.data;
        temp.next = null;
        size--;
        return val;
    }
    public int search(int key){
        Node temp = head;
        int i = 0;
        while(temp!=null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;//Key not found
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.print();
        ll.addMid(0, 5);
        ll.print();
        System.out.println(ll.size);
        System.out.println();
        System.out.println(ll.removeFirst());
        System.out.println();
        System.out.println(ll.removeLast());
        System.out.println();
        System.out.println(ll.search(3));
    }
}