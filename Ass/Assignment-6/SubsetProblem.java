import java.util.Scanner;

class SubsetProblem{
    static int count  = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        ok(0,0,"",target,arr);
        System.out.println();
        System.out.println(count);
    }
    public static void ok(int i,int j,String s,int target,int[] arr){
        if(i==arr.length){
            if(j==target){
                count++;
                System.out.print(s+" ");
            }
            return ;
        }
        ok(i+1,j+arr[i],s+arr[i]+" ",target,arr);
        ok(i+1,j,s,target,arr);
    }
}