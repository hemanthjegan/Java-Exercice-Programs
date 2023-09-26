import java.util.Scanner;

public class fibonacci_series {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the fibpnacci number : ");
        int n = in.nextInt();
        int a =-1, b =1, c;
        for (int i = 0; i < n; i++) {
            c=a+b;
            System.out.print(c+" ");
            a = b;
            b = c;
        }
    }
}
