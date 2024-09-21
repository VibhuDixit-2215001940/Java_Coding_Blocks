import java.util.Scanner;
public class TakeInputInArray {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of array:- ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
        System.out.print("Enter the value of index ");
        arr[i]=sc.nextInt();
    }
    for(int i:arr){
        System.out.print(i+" ");
    }
}
}
