import java.util.Scanner;

class recursion{
    public static int fibanocci(int n){
        if(n == 1 ){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        return fibanocci(n-1)+fibanocci(n-2);
    }
}

public class fibanocci_recur {
    public static void main(String[] args) {
        recursion re = new recursion();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers : ");
        int n = in.nextInt();
        int result = re.fibanocci(n);
        System.out.println("Fibanocci number of "+n+" is : "+result);
    }
}
