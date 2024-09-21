public class IntersectionOfALinkedList {
    public static void main(String[] args) {
        
    }
    public ListNode getIntersectionNode(ListNode a, ListNode b) {
        if(a == null || b == null) return null;
        ListNode s = a;ListNode f = b;
        while(s!= f){
            if(f == null || f.next == null) return null;
            s = s.next;
            f = f.next;
        }
        return s;
    }
}
