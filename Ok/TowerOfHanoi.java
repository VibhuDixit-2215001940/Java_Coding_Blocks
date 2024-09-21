public class TowerOfHanoi {
    static int count = 0;
    public static void main(String[] args) {
        int n = 3;
        toh(n,"A","C","B");
    }
    public static void toh(int n,String src,String helper,String dest){
        if(n==1){
            System.out.println("Moving ring "+n+" from "+src+" to "+dest);
            return ;
        }
        toh(n-1,src,dest,helper);//From A to C using B
        System.out.println("Moving ring "+n+" from "+src+" to "+dest);
        toh(n-1,helper,src,dest);//From C to B using A
    }
}
