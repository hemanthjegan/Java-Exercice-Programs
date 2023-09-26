import java.util.Scanner;
import java.util.Arrays;
public class sum_matrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int s = in.nextInt();
        int a[][] = new int[s][s];
        int b[][] = new int[s][s];
        for (int i = 0; i <a.length; i++) {
            for (int j = 0; j <a.length ; j++) {
                a[i][j]= in.nextInt();
                System.out.println(a[i][j]);
            }
        }
        for (int i = 0; i <b.length; i++) {
            for (int j = 0; j <b.length ; j++) {
                a[i][j]= in.nextInt();
                System.out.println(b[i][j]);
                System.out.println(Arrays.toString(a));
                int sum = a[i][j] + b[i][j];
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
