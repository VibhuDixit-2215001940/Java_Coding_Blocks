public class DiceProblem {
    // public static void main(String[] args) {    //FOR 3 FACES FIXED
    //     int n = 4;
    //     PrintPath(n, 0, "");
    // }
    // public static void PrintPath(int n,int curr,String str){
    //     if(curr == n){
    //         System.out.println(str);
    //         return ;
    //     }
    //     if(curr > n){
    //         return ;
    //     }
    //     //DICE HAS ONLY 3 FACES
    //     PrintPath(n, curr+1, str+1);
    //     PrintPath(n, curr+2, str+2);
    //     PrintPath(n, curr+3, str+3);
    // }


    public static void main(String[] args) {   
        int n = 3;
        PrintPath(n, 0, "");
    }
    public static void PrintPath(int n,int curr,String str){
        if(curr == n){
            System.out.println(str);
            return ;
        }
        if(curr > n){
            return ;
        }
        for(int i=1;i<=3;i++){
            PrintPath(n, curr+i, str+i);
        }
    }
}
