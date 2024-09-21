public class NumericUnderscores{
    public static void main(String[] args) {
        //To enhance readability of large integers.
        //Java allows inserting underscores b|w the int values
        int a = 1_0_0;
        System.out.println(a);//100

        //Floating point no. are treadted as double precision quantities.
        //To force them for single precision we append f or F to the no.
        float b= 0.5f;
        System.out.println(b);//0.5
    }

}