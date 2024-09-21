import java.util.ArrayList;

public class ConvertArrayListIntoString {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();//OBJECT OF ARRAY LIST
        arrayList.add("Hello");                        //ADDING ELEMENTS
        arrayList.add("World");
        arrayList.add("!");
        StringBuilder result = new StringBuilder();         //USING STRING BUILDER CLASS
        for (String element : arrayList) {                  //ITERATING EACH ELEMENT
            result.append(element).append(" ");         //APPENDING EACH ELE INTO STRING BUILDER
        }
        result.toString().trim();                           //CONVERTING STRINGBUILDER INTO STRING
        System.out.println(result);
    }
}
