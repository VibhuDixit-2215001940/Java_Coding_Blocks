public class PowerOfNo {
    public static void main(String[] args) {
        int n = 2;
        int m = 5;
        System.out.println(power(n,m));
    }
    public static int power(int n,int m){
        if(m==0){
            return 1;
        }
        return n*power(n,m-1);
    }
}
