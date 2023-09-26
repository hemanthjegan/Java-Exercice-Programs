import java.util.Arrays;
import java.util.Scanner;

public class find_element_between_two_element {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int element = 0;
        System.out.println("Enter the size of an array : ");
        int s = in.nextInt();
        int a[] = new int[s];
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < a.length ; i++) {
            a[i] = in.nextInt();
//            element = a[i+1];
        }
        System.out.println(Arrays.toString(a));
        for (int i = 0; i <a.length ; i++) {
            element = a[i+1];
            System.out.println("Element exists between "+a[i]+" and "+a[i+2]+" : "+element);
        }


    }
}
