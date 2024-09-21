import java.util.ArrayList; // import the ArrayList class

public class Intro{
    public static void main(String[] args) {
        //It provides us with dynamic arrays in Java. 
        //The ArrayList class is a resizable array, which can be found in the java.util package.

        
        //The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified (if you want to add or remove elements to/from an array, you have to create a new one). 



        //While elements can be added and removed from an ArrayList whenever you want. The syntax is also slightly different:
        ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
        System.out.println(cars);//[]
        //Its a linear structure, with dynamic size where primitive data types can't be stored directly.



        ArrayList<Integer> marks = new ArrayList<Integer>();
        //Internally a arraylist is a normal list, it has some fixed size internally if it exceds internally a new array is formed with double size and all data is copied to it.
    }
}