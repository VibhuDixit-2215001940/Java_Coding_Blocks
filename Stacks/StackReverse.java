import java.util.Stack;
public class StackReverse {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);//[10, 20, 30, 40, 50]
        pushAtBottom(st,1);
        System.out.println(st);//[1, 10, 20, 30, 40, 50]
        reverseStack(st);
        System.out.println(st);//[50, 40, 30, 20, 10, 1]
    }
    public static void reverseStack(Stack<Integer> st) {
        if(st.isEmpty()){
            return ;
        }
        int item = st.pop();
        reverseStack(st);
        pushAtBottom(st,item);
    }
    public static void pushAtBottom(Stack<Integer> st, int value) {
        if(st.isEmpty()){
            st.push(value);
            return ;
        }
        int item = st.pop();
        pushAtBottom(st, value);
        st.push(item);
    }
}
