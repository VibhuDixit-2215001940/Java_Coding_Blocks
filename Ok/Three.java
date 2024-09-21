public class Three {
    public static void main(String[] args) {
        int n = 155;
        int x = ok(n,0);
        if(n == x){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    public static int ok(int n,int ans){
        if(n == 0){
            return ans;
        }
        int rem = n % 10;
        int power = no(rem,3);
        return ok(n/10,ans+power);
    }
    public static int no(int rem,int temp){
        if(temp == 0){
            return 1;
        }
        return rem*no(rem,temp-1);
    }
}
