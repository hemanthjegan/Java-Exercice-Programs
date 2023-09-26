import java.util.Scanner;

public class binary_no_till_0 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int res = binaryNumber(number);
        System.out.println(res);
    }

    public static int binaryNumber(int n){
        int rem = 0, sum = 0, temp = n, count = 0, iteration = 0;
        while(temp>0) {temp = temp/10; count++; }
        while(n>0){
            for (int i = 0; i <=count; i++) {
                rem = n%10;
                sum += rem * Math.pow(2, i);
                n = n/10;
            }
        }
        return iteration(sum);
    }

    public static int iteration(int sum){
        int iter = 0;
        while(sum > 0) {
            if (sum % 2 == 1) {
                sum -= 1;
                iter++;
            } else {
                sum /= 2;
                iter++;
            }
        }
        return iter;
    }
}
