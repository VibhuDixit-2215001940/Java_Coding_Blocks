public class Stack_Client{
    public static void main(String[] args) throws Exception{
        Stack st = new Stack();
        System.out.println(st.isEmpty());
        st.push(10);st.push(20);st.push(30);st.push(40);st.push(40);st.push(40);
        System.out.println(st.size());
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.capacity());
        System.out.println(st.size());
        st.display();
        // st.clear();
        System.out.println(st.isEmpty());
    }
}