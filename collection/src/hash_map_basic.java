import java.util.HashMap;
import java.util.Scanner;

public class hash_map_basic {
    public static void main(String[] args) {
        HashMap <Integer,String> h = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int key=0;
        String value;
        for (int i = 1; i <=n ; i++) {
            key = in.nextInt();
            value = in.next();
            h.put(key, value);
        }
        for(int i : h.keySet()){
            System.out.println(i +"---->"+h.get(i) );
        }
        System.out.println(h.entrySet());
        System.out.println(h.keySet());
        h.values();
    }
}
