import java.util.*;
public class SumOfDigit {
    public static void main(String args[]) {
        //Sum of odd placed and even placed digits
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//TAKING INPUT
        int o = 0;//FOR ODD
        int e = 0;//FOR EVEN
        int len=0;
        int rem = 0;
        while (n != 0) {//Finding length of digit inputted
        n /= 10;
        ++len;
        rem = n%10;
        if(len%2==0){
            e=e+rem;
        }
        else{
            o=o+rem;
        }
        }

        System.out.println(o+e);//PRINTINGOUTPUT
        System.out.println(o);
    }
}

