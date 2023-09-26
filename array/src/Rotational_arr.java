import java.util.Arrays;

public class Rotational_arr {
    public static void main(String[] args) {
        int a[] = {4,5,1,2,3};
        int b[] = new int[a.length];
        int r = 2;
        System.out.println("Before Rotating : "+Arrays.toString(a));
        System.out.println("Number of elements to be Rotated : " + r);
        int i,j,k;
        for (k=0, i= r; i <a.length; k++,i++) {
            b[k] = a[i];
        }
        for (j=k, i=0; i <r; i++, j++) {
            b[j] = a[i];
        }
        System.out.println("After Rotating : "+Arrays.toString(b));
    }
}


//import java.util.*;
//class Rotational_arr {
//    public static void main(String[] args) {
//        int a[] = {4, 5, 1, 2, 3};
//        int b[] = new int[a.length];
//        int r = 2;
//        int i, j, k;
//        for (i = r, k = 0 ; i <a.length ; i++, k++) {
//            b[k] = a[i];
//        }
//        for ( i= 0, j=k;  i<r ; i++, j++) {
//            b[j] = a[i];
//        }
//        System.out.println(Arrays.toString(b));
//    }
//}
