import java.util.*;
public class reverse_square_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d, s = 0;
        for (int i = 0; i < n; n = n/10) {
            d = n%10;
            System.out.print(d*d);
        }

    }
}
