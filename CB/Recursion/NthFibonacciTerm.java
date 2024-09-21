public class NthFibonacciTerm {
    public static void main(String[] args) {
        int n= 10;
        System.out.println(fib(n));
    }
    public static int fib(int n){
        if(n==1){
            return 1;
        }
        if(n==0){
            return n;
        }
        int a = fib(n-1);
        int b = fib(n-2);
        return a+b;
    }  
}
 