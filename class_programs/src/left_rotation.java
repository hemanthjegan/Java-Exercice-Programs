import java.util.Arrays;

public class left_rotation {
    public static void main(String[] args) {
        int a[] = new int[]{1,2,3,4,5};
        int b[] = new int[a.length+1];
        int r = 2;
        for (int i = 0; i <=r-1 ; i++) {
                        for (int j =0 ; j <a.length ; j++) {
                            b[b.length-2-j] = a[i];
                        }

//                    else if (r > 1) {
//                        for (int j = 1; j <b.length ; j++) {
//                            b[b.length-j] = a[i];
//                        }
//
//                    }
            for (int j = 0; j <a.length-1 ; j++) {
                a[j] = a[j+1];
                b[j] = a[j];
            }
        }

        System.out.println(Arrays.toString(b));

    }
}
