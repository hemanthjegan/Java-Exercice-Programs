import java.util.Scanner;

public class number_series1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x=0;
        for (int i = 0; i <n ; i++) {
            x = (int) (x+ Math.pow(2,i));
                System.out.println(x);
            }
    }
}
