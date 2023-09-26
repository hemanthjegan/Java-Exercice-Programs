import java.util.Scanner;

class model {
    int number;
    public int palindrome(int n) {
        number = n;
        int rev = 0;
        int d,s=0;
        while(n>0){
            d = n%10;
            s = (s*10)+d;
            n = n/10;
            rev = s;
        }
        return rev;
    }
}

public class palindrome_no {
    public static void main(String[] args) {
        model m = new model();
        Scanner in = new Scanner(System.in);
        m.number= in.nextInt();
        m.palindrome(m.number);
        int result = m.palindrome(m.number);
        System.out.println((result == m.number)?"Given number is palindrome":"Given number is not an palindrome");
    }
}
