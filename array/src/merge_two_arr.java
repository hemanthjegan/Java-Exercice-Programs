import java.util.Arrays;

public class merge_two_arr {
    public static void main(String[] args) {
    int a[] = {7,38,34,15,8,23,44,24,65};
    int b[] = {35,89,76,4,32,45};
    int c[] = new int[a.length+b.length];
        for (int i = 0; i <a.length ; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[i+a.length] = b[i];
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
    }
}
