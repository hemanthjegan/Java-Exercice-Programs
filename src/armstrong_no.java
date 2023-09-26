import java.util.Scanner;

public class armstrong_no {
    public static void main(String[] args) {
        int temp,count=0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        temp = n;
        while (temp > 0) {
            temp = temp/10;
            count++;
        }
        System.out.println("count of the given number : "+count);
        int m= n;
        int d;
        double s=0;
        while (m > 0) {
            d = m%10;
            s = s+Math.pow(d,count);
            m = m/10;
        }
        System.out.println((s == n)? "Given number is armstrong":"Given number is not an armstrong");
    }
}
