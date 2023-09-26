import java.util.Arrays;
import java.util.Scanner;

public class unique_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int a[] = new int[n];
        int a[] = {1,2,3,4,2,3,5,6};
        int b[] = new int[a.length];
//        for (int i = 0; i <a.length ; i++) {
//            a[i] = in.nextInt();
//        }
        for (int i = 0; i <a.length ; i++) {
            for (int j = i+1; j <a.length ; j++) {
                if(a[i] == a[j]){
                    b[i] = a[i];
                }
            }
        }
        for (int i = 0; i <a.length ; i++) {
            if(a[i] == b[i]){
                a[i] =0;
            }
        }
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <b.length ; j++) {
                if(a[i] == b[j]){
                    a[i] = 0;
                }
            }
        }

        for (int i = 0; i <a.length ; i++) {
            if(a[i] != 0){
                System.out.println("Unique elements are : "+a[i]+" ");
            }
        }

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
