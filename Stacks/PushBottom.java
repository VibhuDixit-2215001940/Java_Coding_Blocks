import java.util.Stack;
public class PushBottom{
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(1);
        st.push(2);
        st.push(3);
        int temp = st.size();
        // pushAtBottom(st,4,1,temp);
        pushAtBottom2(st,4);
        System.out.println(st);
    }
    public static void pushAtBottom(Stack<Integer> st,int x,int index,int temp){
        if(st.isEmpty()){
            return ;
        }
        int item = st.pop();
        pushAtBottom(st, x,index+1,temp);
        if(index==temp){
            st.push(x);
        }
        st.push(item);
    }
    public static void pushAtBottom2(Stack<Integer> st,int x){
        if(st.isEmpty()){
            st.push(x);
            return ;
        }
        int item = st.pop();
        pushAtBottom2(st, x);
        st.push(item);
    }
}