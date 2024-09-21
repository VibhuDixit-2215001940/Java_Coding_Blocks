public class CycleInLinkedList {
    public static void main(String[] args) {
        CycleInLinkedList cl = new CycleInLinkedList();
        cl.add(1);
        cl.add(2);
        cl.add(3);
        cl.add(4);
        cl.add(5);
        cl.add(6);
        cl.add(7);
        cl.add(8);
        cl.add(9);
        cl.add(10);
        cl.display();  //10-->9-->8-->7-->6-->5-->4-->3-->2-->1-->NULL
    }
    private class Node {
        int val;
        Node next;
    }
    private Node head;
    private Node tail;
    private int size;
    public void add(int item) {
        Node nn = new Node();
        nn.val = item;
        if (this.size == 0) {
            head = nn;
            tail = nn;
            size++;
        } else {
            nn.next = head;
            head = nn;
            size++;
        }
    }
    public void addlast(int item) {
        if (size == 0) {
            add(item);
        } else {
                Node nn = new Node();
                nn.val = item;
                tail.next = nn;
                tail = nn;
                size++;
            }
        }
        public int getFirst() {
            return head.val;
        }
        public int getlast() {
            return tail.val;
        }
        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + "-->");
                temp = temp.next;
            }
            System.out.println("NULL");
        }
        private Node GetNode(int k) throws Exception {
            if (k < 0 || k >= size) {
                throw new Exception("BkLOL k out of Range hai ");
            }
            Node temp = head;
            for (int i = 1; i <= k; i++) {
                temp = temp.next;
            }
            return temp;
        }
        public void createCycle() throws Exception{
            Node nn = GetNode(2);
            tail.next = nn;
        }
    }
