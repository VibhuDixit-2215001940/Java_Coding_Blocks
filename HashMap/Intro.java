//----------------------------------------------------HashMap returns unordered collection -------------------------
// import java.util.*;
// public class Intro{
//     public static void main(String[] args) {
//         HashMap<String,Integer> hh = new HashMap<>();
//         hh.put("Apple", 10);
//         hh.put("Banana", 20);
//         hh.put("Cherry", 30);
//         System.out.println(hh);
//         System.out.println(hh.get("Apple"));//10
//         System.out.println(hh.get("Madhav"));//null
//         System.out.println(hh.remove("Apple"));//10
//         System.out.println(hh);
//         System.out.println(hh.containsKey("Apple"));//false
//         System.out.println(hh.containsValue(20));//true
//         System.out.println(hh.isEmpty());//false
//         System.out.println(hh.replace("Banana",400));//returns the old value i.e 20
//         System.out.println(hh);//{Cherry=30, Banana=400}
//         System.out.println(hh.put("Lol", null));//null as a value can be used as many as wanted
//         System.out.println(hh.put("Okk", null));
//         System.out.println(hh.put(null, null));
//         // System.out.println(hh.put(null, null));
//         System.out.println(hh);
//     }
// }
//------------------------------------------TreeMap returns data key wise sorted ------------------------------------------------
//------------------------------------------Red black tree is used to make the tree map -----
//------------------------------------------No null value can be inserted in it --------------------------------
// import java.util.*;
// public class Intro{
//     public static void main(String[] args) {
//         TreeMap<String,Integer> hh = new TreeMap<>();
//         hh.put("Apple", 10);
//         hh.put("Banana", 20);
//         hh.put("Aherry", 30);
//         System.out.println(hh);//{Aherry=30, Apple=10, Banana=20}
//     }
// }
//----------------------------------------------Insertion order is preserved --------------------------------
//----------------------------------------------Implemented using doubly linked list ------------------------
//----------------------------------------------O(n)
// import java.util.*;
// public class Intro{
//     public static void main(String[] args) {
//         LinkedHashMap<String,Integer> hh = new LinkedHashMap<>();
//         hh.put("Apple", 10);
//         hh.put("Banana", 20);
//         hh.put("Aherry", 30);
//         System.out.println(hh);//{Apple=10, Banana=20, Aherry=30}
            // Set<String> s = map.keySet();
            // for (String s : s){
            //     System.out.print(s + " "+hh.get(s));
            // }
//     }
// }

//----------------------------------------------Set Stores only unique data --------------------------------
//--------------------------Implement using -->HashSet, TreeSet, LinkedHashSet------------------------------
//--------------------------Just like arraylist the only diff. is stores unique data------------------------
//----------------------------------------------O(1) no order is preserved --------------------------------
// import java.util.*;
// public class Intro{
//     public static void main(String[] args) {
//         Set<Integer> hh = new HashSet<>();
//         hh.add(10);
//         hh.add(20);
//         hh.add(40);
//         System.out.println(hh);//[20, 10, 30]
//         System.out.println(hh.contains(20));//true
//         System.out.println(hh.hashCode());//70 adds all elements
//         System.out.println(hh.size());//3
//         // System.out.println(hh.removeAll(hh));//true
//         System.out.println(hh);//[]
//         for(int x:hh){
//             System.out.print(x+" ");
//         }
//         System.out.println();
//     }
// }
//--------------------------------------------LinkedHashSet preserves order --------------------------------
// import java.util.*;
// public class Intro{
//     public static void main(String[] args) {
//         LinkedHashSet<Integer> hh = new LinkedHashSet<>();
//         hh.add(10);
//         hh.add(20);
//         hh.add(40);
//         System.out.println(hh);//[20, 10, 30]
//         System.out.println(hh.contains(20));//true
//         System.out.println(hh.hashCode());//70 adds all elements
//         System.out.println(hh.size());//3
//         System.out.println(hh.removeAll(hh));//true
//         System.out.println(hh);//[]
//         for(int x:hh){
//             System.out.print(x+" ");
//         }
//         System.out.println();
//     }
// }
//
//--------------------------------------------LinkedHashSet preserves order --------------------------------
// import java.util.*;
// public class Intro{
//     public static void main(String[] args) {
//         Hashtable<Integer> hh = new Hashtable<>();
//         hh.add(10);
//         hh.add(20);
//         hh.add(40);
//         System.out.println(hh);
//     }
// }