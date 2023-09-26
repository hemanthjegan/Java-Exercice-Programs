import java.util.Scanner;

public class harshap_no {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an number :");
        int n = in.nextInt();
        int d,s =0;
        int m = n;
        while(m>0){
            d = m%10;
            s = s+d;
            m = m/10;
        }
        System.out.println(s);
        System.out.println((n%s == 0)?"Given number is harshap number":"Given number is not an harshap number");
    }
}

