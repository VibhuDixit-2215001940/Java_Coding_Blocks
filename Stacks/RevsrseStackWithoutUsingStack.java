import java.util.Stack;

public class RevsrseStackWithoutUsingStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(1);st.push(2);st.push(3);
        rev(st);
        System.out.println(st);
    }
    public static void rev(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int item = st.pop();
        rev(st);
        pushAtBottom(st,item);
    }
    public static void pushAtBottom(Stack<Integer> st,int x){
        if(st.isEmpty()){
            st.push(x);
            return ;
        }
        int item = st.pop();
        pushAtBottom(st, x);
        st.push(item);
    }
}
