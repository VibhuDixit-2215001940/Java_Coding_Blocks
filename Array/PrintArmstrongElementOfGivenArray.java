import java.util.Scanner;

public class PrintArmstrongElementOfGivenArray {
    public static void main(String[] args) {
        /* Initialize array */
        int [] arr;

        int n=0,i=0,temp=0,c=0,r=0,noOfDigits=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number of elements in the array");
        n = sc.nextInt();
        arr=new int[n];
        System.out.println("Enter numbers in array");

        for(i=0;i< n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Elements entered in Given array");

        for(i=0;i< n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        /* printing Armstrong elements in an array */
        System.out.println("Armstrong Elements in an array:");
        for(i=0;i< n;i++)
        {
            c=0;
            temp=arr[i];
            noOfDigits=Integer.toString(temp).length();
            while(temp>0)
            {
                r=temp%10;
                temp=temp/10;
                c=c+(int)(Math.pow(r,noOfDigits));
            }
            if(arr[i]==c)
            {
                System.out.print(arr[i]+" ");
            }
        }

    }
    }
}
