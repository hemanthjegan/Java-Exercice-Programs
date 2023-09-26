import java.util.Scanner;

public class neon_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an number :");
        int n = in.nextInt();
        int sr = n*n;
        int d,s=0;
        while(sr>0){
            d = sr%10;
            s = s+d;
            sr = sr/10;
        }
        System.out.println((s == n)?"Given number is neon number":"Given number is not an neon number");
    }
}
