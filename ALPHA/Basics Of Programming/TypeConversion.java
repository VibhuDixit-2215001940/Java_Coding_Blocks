import java.util.Scanner;
public class TypeConversion {
    public static void main(String[] args) {
        //Conversion can only be happen when:
                //a.type compatible
                //b.destination type>source type
            //ex. long can't be type cast to int.............This conversion is called LOSYY CONVERSION
        Scanner sc = new Scanner(System.in);
        float a = sc.nextInt();
        System.out.println(a);//The ans will convert into float
    }
}
