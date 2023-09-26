import java.util.*;

public class left_right_triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 1; i<=n; i++){

            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            for(int j =0; j<2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
