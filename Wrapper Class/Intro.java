import java.sql.Wrapper;
import java.util.ArrayList;

public class Intro{
    public static void main(String[] args) {
        //In Java, wrapper classes are used to wrap primitive data types such as int, char, etc. into objects
        //Sometimes you must use wrapper classes, for example when working with Collection objects, such as ArrayList, where primitive types cannot be used

        // ArrayList<int> myNumbers = new ArrayList<int>(); // Invalid
        // ArrayList<Integer> myNumbers = new ArrayList<Integer>(); // Valid

        //Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.
        
        // Primitive Data Type❤️	    Wrapper Class✨(store value in heap)
        // byte	                        Byte
        // short	                    Short
        // int	                        Integer
        // long	                        Long
        // float	                    Float
        // double	                    Double
        // boolean	                    Boolean
        // char	                        Character

        //Autoboxing and Unboxing

        // 1. Autoboxing
        // The automatic conversion of primitive types to the object of their corresponding wrapper classes is known as autoboxing. For     example – conversion of int to Integer, long to Long, double to Double, etc. 
        // int a = 10;
        // Integer b = 20;
        // b = a;
        // System.out.println(b);
        // //example 
        // char ch = 'a';
        // Character c = ch;
        // ArrayList<Integer> arrayList= new ArrayList<Integer>();
        // arrayList.add(25);// Autoboxing because ArrayList stores only objects
        // System.out.println(arrayList.get(0)); // printing the values from object

        // 2. Unboxing
        //It is just the reverse process of autoboxing. Automatically converting an object of a wrapper class to its corresponding primitive type is known as unboxing. For example – conversion of Integer to int, Long to long, Double to double, etc. 
        Integer z = 10;
        Integer z1 = 10;
        Integer z2 = 127;
        Integer z3 = 127;
        Integer z4 = -127;
        Integer z5 = -127;
        Integer z6 = -128;
        Integer z7 = -128;
        Integer z8 = -129;
        Integer z9 = -129;
        //RANGE (-128 to 127)
        //An array is created in heap having the above range if the no. lie in that range than it store in heap and given that address but if the no. exceed the range then the no. is stored in cache memory.
        System.out.println(z == z1);
        System.out.println(z2 == z3);
        System.out.println(z4 == z5);
        System.out.println(z6 == z7);
        System.out.println(z8==z9);
    }
}