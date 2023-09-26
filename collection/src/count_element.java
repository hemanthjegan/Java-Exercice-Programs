import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class count_element {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //HashSet a = new HashSet<>();
        //TreeSet a = new TreeSet();
        ArrayList<Integer> a = new ArrayList<>();
//        int n = in.nextInt();
//        for (int i = 0; i <n ; i++) {
//            int val = in.nextInt();
//            a.add(val);
//        }
        a.add(1);
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(3);
        a.add(5);
        a.add(6);
        a.add(6);
        a.add(4);
        a.add(8);
//        for (int i = 0; i <a.size() ; i++) {
//            int count = 0;
//            for (int j = i+1; j <a.size() ; j++) {
//
//                if(a.get(i) == a.get(j) || i != j){
//                    count++;
//                }
//                System.out.println(a.get(i)+" : "+count);
//            }

//        ArrayList<Integer> a = new ArrayList<>();
//        int n = in.nextInt();
//        for (int i = 0; i <n ; i++) {
//            int val = in.nextInt();
//            a.add(val);
//        }
//        int dup =0;
        HashSet<Integer> b = new HashSet<>();
        b.addAll(a);
        for(int i : b){
            int count =0;
            for(int j : a){
                if(i == j){
                    count++;
                }
            }
            System.out.println(i+" : "+count);
        }

    }
}
