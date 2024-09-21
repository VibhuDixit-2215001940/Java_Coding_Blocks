public class Four {
    public static void main(String[] args) {
        long N = 18486;
        long x = ok(N,1,1);
        System.out.println(x);
    }
    public static long ok(long n, long temp,long max){
        if(n == temp){
            return max;
        }
        if((temp*temp*temp) <= n){
            max = temp;
        }
        return ok(n,temp+1,max);
    }
}
