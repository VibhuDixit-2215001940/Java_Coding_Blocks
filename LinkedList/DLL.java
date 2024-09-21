public class DLL {
    Node head;
    private class Node{
        int val;
        Node next;
        Node prev;
        public Node(int val){
            this.val = val;
        }
        public Node(int val,Node next,Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
    public void addFirst(int val){
        Node node = new Node(val);
        node.next = head;
        if(head != null){
            head.prev = node;
        }
        head = node;
        node.prev = null;
    }
    public void addLast(int val){
        Node node = new Node(val);
        Node last = head;
        if(head == null){
            node.prev = null;
            head = node;
            return ;
        }
        while(last.next != null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;

    }
    public void addAfter(int after,int index){
        Node temp = head;

    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}
