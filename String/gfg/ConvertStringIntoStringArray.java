public class ConvertStringIntoStringArray {
    public static void main(String[] args) {
        String str = "Geeks for Geeks";
 
        String strArray[] = str.split(" ");
 
        System.out.println("String : " + str);
        System.out.println("String array : [ ");
 
        // Iterating over the string
        for (int i = 0; i < strArray.length; i++) {
            // Printing the elements of String array
            System.out.print(strArray[i] + ", ");
        }
 
        System.out.print("]");
    }
}
// Input:  String : "Geeks for Geeks"
// Output: String[]: [Geeks for Geeks]
