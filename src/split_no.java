import java.util.Scanner;
public class split_no {
    public static void main(String[] args)
    {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
        int m= n;
        int d;
        int s=0;
        while (m > 0) {
            d = m%10;
            s = s+d;
            m = m/10;
        }
        System.out.println(s);
}
}
