import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class unique_ele_list_set {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //HashSet a = new HashSet<>();
        //TreeSet a = new TreeSet();
        ArrayList<Integer> a = new ArrayList<>();
        int n = in.nextInt();
        for (int i = 0; i <n ; i++) {
            int val = in.nextInt();
            a.add(val);
        }
        int dup =0;
        TreeSet<Integer> b = new TreeSet<>();
        b.addAll(a);
        for(int i : b){
            int count =0;
            for(int j : a){
                if(i == j){
                    count++;
                }
            }if(count == 1) {
                System.out.println("Unique elements are :"+i +" ");
                dup = 1;
            }
        }
        if(dup == 0){
            System.out.println("There is no unique element : -1");
        }
    }
}
