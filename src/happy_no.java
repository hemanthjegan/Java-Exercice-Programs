import java.util.Scanner;

public class happy_no {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an number :");
        int n = in.nextInt();
        int d,d2,result = 0, s = 0;
        int m = n;
        while (m > 0) {
            d = m % 10;
            s = s + (d * d);
            m = m / 10;
        }
        System.out.println(s);
        if(s<9){
            System.out.println((s==1)?"Given number is happy number":"Given number is not an happy number");
//            while (s > 0) {
//                d = s % 10;
//                s = s + (d * d);
//                s = s / 10;
//            }
        }else{
            while (s > 0) {
                d2 = s % 10;
                s = s + (d2 * d2);
                result = result / 10;
              }
            System.out.println((s==1)?"Given number is happy number":"Given number is not an happy number");
        }
    }
}