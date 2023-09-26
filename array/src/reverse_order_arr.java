//import java.util.Arrays;
//import java.util.Scanner;
//
//public class reverse_order_arr {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int rev = 0;
//        System.out.println("Enter the size of an array : ");
//        int size = in.nextInt();
//        int arr[] = new int[size];
//        System.out.println("Enter the elements in an array : ");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//        System.out.println("Before reverse the element : "+ Arrays.toString(arr));
//        for (int i = arr[i]; i < arr.length ; i++) {
//             rev = arr[i];
//        }
//        System.out.println("After reverse the element : "+rev);
//    }
//}


class reverse_order_arr {
    public static void main(String[] args) {
        int arr[] = {34, 5, 7, 24, 65, 12, 2, 24, 98};
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+", ");
        }
        System.out.println("");
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]+", ");
        }
    }
}