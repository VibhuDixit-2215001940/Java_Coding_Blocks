import java.util.Stack;
public class ReverseStack{
    public static void main(String[] args){
        Stack st = new Stack();
        Stack he = new Stack();
        for(int i=1;i<=5;i++){
            st.push(i*10);
        }
        System.out.println(st);
        reverseStack(st,he,0);
        System.out.println(st);
    }
    // @SuppressWarnings("unchecked")
    public static void reverseStack(Stack st,Stack he,int index){
        if(st.isEmpty()){
            return;
        }
        int item = (int) st.pop();
        reverseStack(st, he, index+1);
        he.push(item);
        if(index==0){
            while(!he.isEmpty()){
                st.push(he.pop());
            }
        }
    }
}