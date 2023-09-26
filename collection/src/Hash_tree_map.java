import java.util.HashMap;
public class Hash_tree_map {
    public static void main(String[] args) {
        HashMap<Integer,String> h = new HashMap<>();
//        TreeMap<Integer,String> h = new TreeMap<>();
        h.put(1,"hemanth");
        h.put(2,"rajesh");
        h.put(3,null);
        h.put(4,"Bharathi");
        h.put(4,"Tensing");
        h.put(null, "karthik");   // null pointer exception in tree map... hash map allows null
        h.put(null, "karthi");
        h.put(5,null);
        h.putIfAbsent(5, "Raja");
        h.replace(4,"Tensing raja");
        h.remove(2);   // remove the element through keys
        h.put(6, "kaja");
        System.out.println(h);
        System.out.println(h.containsKey(6));
        System.out.println(h.containsValue("rajesh"));
        System.out.println(h.get(1));
        System.out.println(h.getOrDefault(9,"Key is not available.."));

        System.out.println("--------------------------------------------");

        System.out.println(h.keySet());    // [ key ]
        System.out.println(h.values());    // [ values ]
        System.out.println(h.entrySet());  //  [ key - values ]
    }
}
