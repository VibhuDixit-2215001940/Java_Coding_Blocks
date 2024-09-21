public class TowerOfHanoi {
    public static void main(String[] args) {
        int n = 3;
        String src = "A";
        String hlp = "B";
        String des = "C";
        toh(n,src,hlp,des);
    }
    public static void toh(int n,String src,String hlp,String des){
        if(n == 0){
            return ;
        }
        toh(n-1,src,des,hlp);
        System.out.println("Move "+n+"th disc from"+src+" to "+des);
        toh(n-1,hlp,src,des);

    }
}
// Move 1th disc fromA to C
// Move 2th disc fromA to B
// Move 1th disc fromC to B
// Move 3th disc fromA to C
// Move 1th disc fromB to A
// Move 2th disc fromB to C
// Move 1th disc fromA to C