import java.util.Arrays;
import java.util.Scanner;

class dup_arr{
    int size;
    void one(int s){
        size = s;
    }
    void two(){
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int a[] = new int[size];
        for (int i = 0; i < a.length ; i++) {
            a[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(a));
    }
}

public class duplicate_arr_count {

    public static void main(String[] args) {
        dup_arr da = new dup_arr();
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        da.one(5);
        da.two();
    }
}
