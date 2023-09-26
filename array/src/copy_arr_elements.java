import java.util.Arrays;

public class copy_arr_elements {
    public static void main(String[] args) {
        int a[] = {34, 5, 7, 24, 65, 12, 2, 24, 98};
        int b[] = new int[a.length];
        for (int i = 0; i <a.length ; i++) {
            b[i] = a[i];
        }
        System.out.println("Element in an first array : "+Arrays.toString(a));
        System.out.println("Element After copying from first array : "+Arrays.toString(b));
    }
}
