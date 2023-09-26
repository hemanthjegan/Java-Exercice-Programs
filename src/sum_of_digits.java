import java.util.Scanner;

public class sum_of_digits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an number :");
        int n = in.nextInt();
        for (int i = 100; i <=n ; i++) {
            int d,s=0;
            int m = i;
            while(m>0){
            d = m%10;
            s = s+d;
            m = m/10;
            }
            System.out.println(i+" "+s);
        }
    }
}
