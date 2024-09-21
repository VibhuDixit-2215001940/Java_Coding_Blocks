public class NQueen{
    public static void main(String[] args) {
        int n = 4;
        boolean [] board = new boolean[n];
        int tq = 2;
        Permutation(board,tq,0,"");
    }
    public static void Permutation(boolean[] board,int tq,int qpsf,String ans){
        if(tq == qpsf){
            System.out.println(ans);
            return ;
        }
        for(int i=0;i<board.length;i++){
            if(board[i]==false){        //CHECKING IF QUEEN IS PLACED ALREADY OR NOT
                board[i] = true;        //PLACED QUEEN
                Permutation(board,tq,qpsf+1,ans+"b"+i+"Q"+qpsf);
                board[i] = false;//removw queen undo
            }
        }
    }
}
// b0Q0b1Q1
// b0Q0b2Q1
// b0Q0b3Q1
// b1Q0b0Q1
// b1Q0b2Q1
// b1Q0b3Q1
// b2Q0b0Q1
// b2Q0b1Q1
// b2Q0b3Q1
// b3Q0b0Q1
// b3Q0b1Q1
// b3Q0b2Q1