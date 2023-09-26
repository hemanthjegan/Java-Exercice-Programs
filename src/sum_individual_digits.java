import java.util.Scanner;

public class sum_individual_digits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an number :");
        int n = in.nextInt();
        int d,s =0;
        while(n>0){
            d = n%10;
            s = s+d;
            n = n/10;
        }
        System.out.println(s);
    }
}
