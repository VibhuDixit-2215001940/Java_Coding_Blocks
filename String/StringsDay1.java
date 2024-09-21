public class StringsDay1 {
    public static void main(String[] args) {
        String s = "Sachin";
        // concat() method appends
        // the string at the end
        s.concat(" Tendulkar");
        // This will print Sachin
        // because strings are
        // immutable objects
        System.out.println(s);//Sachin

        String name = "Sachin";
        name = name.concat(" Tendulkar");
        System.out.println(name);//Sachin Tendulkar

        //Note: String objects are stored in a special memory area known as string constant pool.

        byte[] b_arr = {71, 101, 101, 107, 115};
        String s_byte =new String(b_arr); //Geeks

        byte[] b_arr1 = {71, 101, 101, 107, 115};
        // String s1 = new String(b_arr1, "US-ASCII"); //Geeks

        byte[] b_arr2 = {71, 101, 101, 107, 115};
        String s1 = new String(b_arr, 1, 3); // eek
        
    //1. LENGTH
        "GeeksforGeeks".length();  // returns 13

    //2. CHARAT
        "GeeksforGeeks".charAt(3); // returns  ‘k’

    //3. SUBSTRING
        "GeeksforGeeks".substring(3); // returns “ksforGeeks”

    //4. SUBSTRING(,)
        "GeeksforGeeks".substring(2, 5); // returns “eks”

    //5. CONCAT
        String s11 = "Geeks";
        String s21 = "forGeeks";
        String output = s11.concat(s21); // returns “GeeksforGeeks”

    //6. INDEXOF
        String s12 = "Learn Share Learn";
        int output12 = s.indexOf("Share"); // returns 6

    //7. INDEXOF(STR,FROMINDEX)
        String s13 = "Learn Share Learn";
        int output13 = s.indexOf("ea",3);// returns 13

    //8. LASTINDEXOF
        String s14 = "Learn Share Learn";
        int output14 = s.lastIndexOf("a"); // returns 14

    //9. X.EQUALS(Y)
        Boolean out1 = "Geeks".equals("Geeks"); // returns true
        Boolean out2 = "Geeks".equals("geeks"); // returns false

    //10. X.EQUALSIGNOERECASE(Y)
        Boolean out11 = "Geeks".equalsIgnoreCase("Geeks"); // returns true
        Boolean out22 = "Geeks".equalsIgnoreCase("geeks"); // returns true

    //11. TOLOWERCASE()
        String word1 = "HeLLo";
        String word3 = word1.toLowerCase(); // returns “hello"

    //12. TRIM()
        String word11 = " Learn Share Learn ";
        String word2 = word1.trim(); // returns “Learn Share Learn”

    //13. REPLACE
        String s1m = "feeksforfeeks";
        String s2m = s1m.replace('f' ,'g'); // returns “geeksgorgeeks”

    //14. CONTAINS
        String s10="geeksforgeeks";
        String s20="geeks";
        s1.contains(s20); // return true
    //15.
    }
}
