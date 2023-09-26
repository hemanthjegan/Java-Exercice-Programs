//import java.util.*;
//public class sum_of_mobile_digits {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter Your Mobile number : ");
//        long n = in.nextLong();
//        int d,sum =0;
//        for (int i = 0; i <n ; i++) {
//            d = (int) (n%10);
//            sum = sum +d;
//            n = n/10;
//        }
//        System.out.println("Sum of mobile numbers using for-loop : "+sum);
//    }
//}

public class sum_of_mobile_digits {
    public static void main(String[] args) {
        long n = 9345368392L;
        int d, sum =0;
        for (int i = 0; i < n ; n =n/10 ) {
            d = (int) (n%10);
            sum = sum + d;
        }
        System.out.println(sum);
    }
}