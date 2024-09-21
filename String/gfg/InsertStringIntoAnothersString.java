//Insert a String into another String in Java

public class InsertStringIntoAnothersString {
    public static void main(String[] args) {
        String str = "Hello";
        String str1 = "World";
        int index = 3;
        String ok = str.substring(0,index+1)+str1+str.substring(index+1);
        System.out.println(ok);
    }
}
// Input: originalString = "GeeksGeeks", 
//               stringToBeInserted = "For", 
//               index = 4
// Output: "GeeksForGeeks"
