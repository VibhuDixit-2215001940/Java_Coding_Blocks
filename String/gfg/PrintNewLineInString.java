public class PrintNewLineInString {
    public static void main(String[] args) {
        // String newline = System.lineSeparator(); 
        // // Printing new line 
        // System.out.println("GFG" + newline + "gfg");
        System.out.println("GFG" + '\n' + "gfg"); 
        String newline = System.getProperty("line.separator"); 
        // Printing new line between two strings 
        System.out.println("GFG" + newline + "gfg");
        System.out.printf("GFG%ngfg"); 
    }
}
