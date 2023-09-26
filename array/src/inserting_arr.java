//import java.util.Arrays;
//
//public class inserting_arr {
//    public static void main(String[] args) {
//        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int index = 2;
//        int data = 5;
//        for (int i=a.length-1; i >index  ; i--) {
//                a[i] = a[i-1];
//        }
//        a[index] = data;
//        System.out.println(Arrays.toString(a));
//
//    }
//}


import java.util.Arrays;
import java.util.Scanner;

public class inserting_arr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int n = in.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the index number you want to insert : ");
        int index = in.nextInt();
        System.out.println("Enter the element you want to insert : ");
        int value = in.nextInt();
        System.out.println("Enter the elements to an array : ");
        int arr [] = new int[a.length+1];
        int j =0;
        for (int i = 0; i <=a.length-1 ; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
                if(i == index){
                    arr[i] = value;
                }else{
                    arr[i] = a[j];
                    j++;
                }
        }
        System.out.println(Arrays.toString(arr));

    }
}
