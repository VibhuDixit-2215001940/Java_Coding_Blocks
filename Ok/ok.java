import java.util.*;
class HelloWord {
    private static final int[][] lo = {{0, 1}, {1, 1}, {1,0},{1,-1}, {0,-1}, {-1, -1}, {-1,0}, {-1,1}};
    public int ok(int[][] arr) {
        Map<Integer, Integer> pr = new HashMap<>();
        int r = arr.length, c = arr[0].length;
        for (int i=0; i < r; i++) {
            for (int j = 0; j < c; j++){
                for (int[] dir: lo){
                    StringBuilder s = new StringBuilder();
                    int x=i, y=j;
                    while (isV(x, y, r, c)) {
                        s.append(arr[x][y]);
                        int number = Integer.parseInt(s.toString());
                        if (number >10 && is(number)) {
                            pr.put(number, pr.getOrDefault(number, 0)+1);
                        }
                        x += dir[0];
                        y += dir[1];
                    }
                }
            }
        }
        int maxf = 0;
        int maxp =-1;
        for(Map.Entry<Integer,Integer> e : pr.entrySet()){
            int pm = e.getKey();
            int f = e.getValue();
            if(f > maxf || (f == maxf && pm > maxp)){
                maxf = f;
                maxp = pm;
            }
        }
        return maxp;
    }
    private boolean isV(int x,int y,int rows,int cols){
        return x>=0 && x<rows && y>=0 && y<cols;
    }
    private boolean is(int num){
        if(num<2){mostFrequentPrime
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }       
}