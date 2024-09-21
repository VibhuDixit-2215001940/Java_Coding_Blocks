public class Five {
    public static void main(String[] args) {
        ok(5,1,1);
    }
    public static void ok(int n,int i,int count){
        if(n == 0){
            return;
        }
        System.out.print(i+" ");
        if(i==count){
            System.out.println();
            n -= 1;
            count = 0;
        }
        ok(n,i+1,count+1);
    }
}
