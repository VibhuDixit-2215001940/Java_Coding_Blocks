public class Two {
    public static void main(String[] args) {
        int N = 40585;
        long lund = ok(N,0);
        if(lund == N){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
    public static long ok(long n,long ans){
        if(n == 0){
            return ans;
        }
        long rem = n % 10;
        long factOne = fact(rem);
        return ok(n/10,ans+factOne);
    }
    public static long fact(long rem){
        if(rem == 0 || rem == 1){
            return rem;
        }
        return rem*fact(rem-1);
    }
}
