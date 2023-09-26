import java.util.HashMap;
import java.util.Scanner;

//public class hash_map_split_length {
//    public static void main(String[] args) {
//        HashMap<Integer,String> h = new HashMap<>();
//        Scanner in = new Scanner(System.in);
////        String s = in.nextLine();
//        String s = "mahendra engineering college namakkal hemanthrajeganathan";
//        int max = 0;
//        String[] a = s.split(" ");
//        for (int i = 0; i <s.length() ; i++) {
////            if(s.charAt(i) == 32){
////                i++;
//                System.out.println(a[i]+"--->"+ a[i].length());
//                if(max < a[i].length()){
//                    max = a[i].length();
//                }else continue;
//            System.out.println(max);
////            }
//        }
//    }
//}


public class hash_map_split_length {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int key = 0;
        HashMap<String,Integer> h = new HashMap<>();
        int n = in.nextInt();
        String value = null;
//            String[] a = value.split(" ");
        for (int i = 0; i <n ; i++) {
            value = in.next();
            key = value.length();
            h.put(value, key);
        }
//        for(String i : value){
//
//        }
    }
}
