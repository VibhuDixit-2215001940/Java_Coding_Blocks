import java.util.Scanner;
import java.util.Stack;
public class RevsreseANo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<Integer>();
        Stack<Integer> he = new Stack<Integer>();
        int n = sc.nextInt();//123
        Push(st,n);
        rev(st,he,0);
        System.out.println(stackToInt(st,0));
    }
    public static void Push(Stack<Integer> st,int n){//[3, 2, 1]
        if(n<=0){
            return ;
        }
        st.push(n%10);
        Push(st,n/10);
    }
    public static void rev(Stack<Integer> st,Stack<Integer> he,int index){//[1, 2, 3]
        if(st.isEmpty()){
            return ;
        }
        int item =(int) st.pop();
        rev(st,he,index+1);
        he.push(item);
        if(index==0){
            while (!he.isEmpty()){
                st.push(he.pop());
            }
        }
    }
    public static int stackToInt(Stack<Integer> st,int temp){//321
        if(st.isEmpty()){
            return temp;
        }
        int item =(int) st.pop();
        return stackToInt(st, temp*10+item);
    }
}
