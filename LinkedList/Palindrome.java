import org.w3c.dom.Node;
import java.util.*;
public class Palindrome {
    private class heapmover {
        Node n1;
    }
    private Node head;
    public boolean palindrome() {
        heapmover mover = new heapmover();
        mover.n1 = this.head;
        return palindrome(mover, this.head, 0);
    }
    public boolean palindrome(heapmover mover, Node n2, int cnt) {
        if (n2 == null) return true;
        boolean b = palindrome(mover, n2.next, cnt + 1);
        if (n2 != null && cnt > this.size / 2) {
            if (mover.n1.data != n2.data) return false;
        }
        mover.n1 = mover.n1.next;
        return b;
    }
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(1);
        System.out.println();
    }
}
