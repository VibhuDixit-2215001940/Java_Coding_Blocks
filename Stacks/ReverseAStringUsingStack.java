import java.util.Scanner;
import java.util.Stack;
public class ReverseAStringUsingStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> st = new Stack<Character>();
        Stack<Character> he = new Stack<Character>();
        String str = sc.next();
        stringToStack(str,st);//kal
        System.out.println(st);//[k,a,l]
        System.out.println(stackToString(st,""));//lak
    }
    public static void stringToStack(String str,Stack<Character> st){
        if(str.length()==0){
            return ;
        }
        st.push(str.charAt(0));
        stringToStack(str.substring(1),st);
    }
    public static String stackToString(Stack<Character> st,String x){
        if(st.isEmpty()){
            return x;
        }
        return stackToString(st,x+st.pop());
    }
}
