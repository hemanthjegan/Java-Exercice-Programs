import java.util.Scanner;

public class palindome_no {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an number :");
        int n = in.nextInt();
        int d,s=0;
        int m = n;
        while(m>0){
            d = m%10;
            s = (s*10)+d;
            m = m/10;
        }
        System.out.println((s == n)?"Given number is palindrome":"Given number is not an palindrome");
    }
}

