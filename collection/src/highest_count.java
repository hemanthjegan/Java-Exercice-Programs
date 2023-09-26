import java.util.HashSet;
import java.util.ArrayList;
import java.util.Scanner;
public class highest_count {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i <n ; i++) {
            int val = in.nextInt();
            a.add(val);
        }
        int val =0,max =0;
        HashSet<Integer> b = new HashSet<>();
        b.addAll(a);
        for(int i : b) {
            int count = 0;
            for (int j : a) {
                if (i == j) {
                    count++;
                }
                if(count > max){
                    max = count;
                    val = i;
                }
            }
        }
        System.out.println("The Maximum number of value "+val+" is "+max+" times repaeated.");
    }
}
