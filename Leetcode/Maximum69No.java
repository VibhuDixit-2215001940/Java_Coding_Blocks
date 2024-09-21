// import java.util.Arrays;
import java.util.Scanner;

public class Maximum69No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(maximum69Number(x));
    }
    public static int maximum69Number(int num) {
            String s=Integer.toString(num); //converting integer to string
            StringBuilder sb=new StringBuilder(s); //using stringbuilder to replace character as string is immutable
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)=='6')
                    {sb.replace(i,i+1,"9");  
                     break;}
            }
            s=sb.toString(); //converting stringbuilder to string
            int res=Integer.parseInt(s); //converting string to integer
            return res;
    }
}
