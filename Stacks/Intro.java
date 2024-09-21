import java.util.Stack;

public class Intro{
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        for(int i=0;i<5;i++){
            st.push(i);
        }
        System.out.println(st.peek());//4
        System.out.println(st.size());//5
        System.out.println(st.isEmpty());//false
        System.out.println(st.empty());
        System.out.println(st.pop());//4
        System.out.println(st.capacity());//The default capacity of stack is 10
        System.out.println(st.contains(1));//true
        // st.clear();//Will clear the stack
        System.out.println(st.peek());
        System.out.println(st.indexOf(1));//1
    }
}