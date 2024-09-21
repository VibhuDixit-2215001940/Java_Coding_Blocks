public class Day4 {
    public static void main(String[] args) {
        //TYPE CONVERSION
        //1. Implicite
        //2. Explicite



        //IMPLICITE TYPE CONVERSION
        int num1 = 10;
        byte num2 = 20;

        num1 = num2;//Implicite conversion..... num2 automatically get converted into int
        //Compiler does int num1 = (int) num2 internally which we can't see

        long a = 1000000000;//10 values get stored
        long b = 1000000000000000000L;//19 value get stored
        // long c = 1000000000000000000l;

        //EXPLICITE TYPE CONVERSION
        double d = 100.04;
        // Explicit type casting by forcefully getting
        // data from long datatype to integer type
        long l = (long)d;
        // Explicit type casting
        int i = (int)l;
        // Print statements
        System.out.println("Double value " + d);
        // While printing we will see that
        // fractional part lost
        System.out.println("Long value " + l);
        // While printing we will see that
        // fractional part lost
        System.out.println("Int value " + i);
    }
}
