import java.util.Scanner;
public class number_series3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = 0;
        for (int i = 0; i <=n ; i++) {
            x = x+i;
            System.out.println(x);
        }
    }
}
