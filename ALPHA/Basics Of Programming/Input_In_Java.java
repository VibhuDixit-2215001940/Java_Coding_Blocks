
import java.util.Scanner;   /*Util is a package which contains many class one of theses is Scanner */
public class Input_In_Java {
    public static void main(String[] args) {
        //next     string till space
        //nextLine      string containing space
        //nextInt       for int
        //nextByte      
        //nextFloat
        //nextDouble
        //nextBoolean
        //nextShort
        //nextLong
        // For inputting data we have to use a class called SCANNER
        //And make an Object
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); /*Calling sc object */
        System.out.println(a);
        boolean b = sc.nextBoolean();
        System.out.println(b);
    }
}
