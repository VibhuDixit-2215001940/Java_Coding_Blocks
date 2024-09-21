import java.util.Stack;

public class StockSpanProblem{
    public static void main(String[] args) {
        int stocks[] = {100,80,60,70,60,85,100};
        int span[] = new int[stocks.length];
        stockSpan(stocks, span);
        for(int i=0;i<span.length;i++){
            System.out.println(span[i]+" ");
        }
    }
    public static void stockSpan(int stocks[],int span[]){
        //Stack here is used to store index to prev high 
        Stack<Integer> st = new Stack<Integer>();
        span[0] = 1;
        st.push(0);
        for(int i=0;i<stocks.length;i++){
            int currStock = stocks[i];
            while(!st.isEmpty() && currStock>=stocks[st.peek()]){
                st.pop();//HAM DELETE JAB TAK KARENGE KI SALA STACK HI KHALI NA HO AND HAMARI CURRENT STOCK BADA NO HO JAYE
            }
            if(st.isEmpty()){
                span[i] = i+1;
            }
            else{
                int preHigh = st.peek();
                span[i] = i-preHigh;
            }
            st.push(i);
        }
    }
}