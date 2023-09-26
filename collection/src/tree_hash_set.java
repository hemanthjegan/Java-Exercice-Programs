import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class tree_hash_set {
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<Integer>();
        HashSet<Integer> h = new HashSet<>();
        t.add(1);
        t.add(2);
        t.add(2);   // won't allow the duplicate...
        h.add(null);
        h.add(null);
        h.add(1);
        h.add(2);
        h.add(3);
        System.out.println(t);
        System.out.println(h);
        System.out.println("--------------------------------------------");
        Set t1 = new TreeSet();
        Set h1 = new HashSet();
        t1.add("4");
        t1.add("vivo");
        t1.add("apple");
        System.out.println(t1);   // not shorted shuffled
        System.out.println("--------------------------------------------");
        h1.add("oppo");
        h1.add("4");
        h1.add("apple");
        System.out.println(h1);  // automatically sorted

    }
}
