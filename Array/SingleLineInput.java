import java.util.Scanner;

public class SingleLineInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of array:- ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    for(int i:arr){
        System.out.print(i+" ");
    }
    }
}
