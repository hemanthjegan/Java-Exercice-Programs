import java.util.Scanner;

public class posi_nega_zero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        find(in.nextInt());
    }

    public static void find(int n){
        if(n == 0){
            System.out.println("The given number is zero");
        }else if(n > 0){
            System.out.println("The given number is positive");
        }else if(n < 0) {
            System.out.println("The given number is Negative");
        }
    }
}
