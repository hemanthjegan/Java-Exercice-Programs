import java.util.*;
                                             // sum of the factor of first number = aum of the factors of 2nd number
public class amicable_no {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int n = in.nextInt();
        System.out.println("Eneter the second number : ");
        int n1 = in.nextInt();
        int temp=0, temp1 = 0;
        for (int i = 1; i < n; i++) {
            if(n%i == 0){
                temp +=i;
            }
        }
        for (int i = 1; i < n1; i++) {
            if(n1%i == 0){
                temp1 +=i;
            }
        }
        if(temp == n1 && temp1 == n ){
            System.out.println("Amicable number");
        }else{
            System.out.println("Not a Amicable number");
        }
    }
}
