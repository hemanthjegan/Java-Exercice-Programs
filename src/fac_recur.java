import java.util.Scanner;

class fact{
    static int factorial(int n){
        int number = n;
        if(n == 1){
          return 1;
        }
       return n* factorial(n-1);
    }
}
public class fac_recur {
    public static void main(String[] args) {
    fact f = new fact();
    Scanner in =new Scanner(System.in);
        System.out.println("Enter the Number : ");
    int n;
    n = in.nextInt();
    int result= f.factorial(n);
        System.out.println("Factorial of"+n+"is : "+result);
    }
}
