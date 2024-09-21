import java.util.Scanner;

public class NoOfEvenAndOddElemenets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:- ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }int flag=0,count=0;
        for(int i:arr){
            if(i%2==0){flag++;}
            else{count++;}
        }
        System.out.println("No. of even ele.:- "+flag);
        System.out.println("No. of odd ele.:- "+count);
    }
}
