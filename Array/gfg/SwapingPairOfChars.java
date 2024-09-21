// Swapping Pairs of Characters in a String in Java
// Input: str = “Java”
// Output: aJva

public class SwapingPairOfChars {
    public static String swapPair(String str) { 
        if (str == null || str.isEmpty())         // Checking if string is null or empty then return str
            return str;
        char[] ch = str.toCharArray();         // Converting the given string into a character array 
        for (int i = 0; i < ch.length - 1; i += 2) { 
            char temp = ch[i]; 
            ch[i] = ch[i + 1]; 
            ch[i + 1] = temp; 
        } 
        return new String(ch); 
    } 
  
    public static void main(String args[]) { 
        String str = "GeeksForGeeks"; 
        System.out.println(swapPair(str)); 
    } 
}
