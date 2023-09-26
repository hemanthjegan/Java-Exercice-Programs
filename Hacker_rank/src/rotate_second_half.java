import java.util.*;
                                                      // find the mid-values and rotate the last values in mid first element
public class rotate_second_half {
    public static void main(String[] args) {
        int a[] = {3, 5, 7, 8, 9, 10, 22, 45, 6, 1};
        int temp =0;
        int r = 1;
        int mid = (a.length/2);
        for(int i=0; i<a.length; i++){
            if(a[i] == a[mid]) {
                int val = (a.length-1) - (mid-1);
//                if(val < r){
//                    r = r % val;    // reduce the time complexity
//                }
                for (int j = 1; j <= r; j++) {
                    temp = a[a.length - 1];
                    for (int rotate = 1; rotate <= r;) {
                        for (int k = a.length - 1; k >= mid; k--) {
                            a[k] = a[k - 1];
                        }
                        a[mid] = temp;
                        break;
                    }
                }
//                break;
            }
//            System.out.print(a[i]+" ");
        }
//        System.out.println();
        System.out.println(Arrays.toString(a));
    }
}


//import java.util.*;
//
//public class rotate_second_half {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the size of an array : ");
//        int n = in.nextInt();
//        int a[] = new int[n];
//        System.out.println("Enter the elements to an array : ");
//        for(int i =0; i<a.length; i++){
//            a[i] = in.nextInt();
//        }
//        int temp =0;
//        System.out.println("Enter how many times you want rotate : ");
//        int r = in.nextInt();
//        int mid = (a.length/2);
//        for(int i=0; i<a.length; i++){
//            if(a[i] == a[mid]) {
//                int val = (a.length-1) - (mid-1);
////                if(val < r){
////                    r = r % val;    // reduce the time complexity
////                }
//                for (int j = 1; j <= r; j++) {
//                    temp = a[a.length - 1];
//                    for (int rotate = 1; rotate <= r;) {
//                        for (int k = a.length - 1; k >= mid; k--) {
//                            a[k] = a[k - 1];
//                        }
//                        a[mid] = temp;
//                        break;
//                    }
//                }
////                break;
//            }
////            System.out.print(a[i]+" ");
//        }
////        System.out.println();
//        System.out.println(Arrays.toString(a));
//    }
//}