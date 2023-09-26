import java.util.*;

public class adam_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int num1 = n*n;
        int temp = n;
        int d, d1, s=0, s1=0;
        while (temp>0){
            d = temp%10;
            s = s*10 +d;
            temp = temp/10;
        }
        int temp1 = s * s;
        while (temp1>0){
            d1 = temp1%10;
            s1 = s1*10 +d1;
            temp1 = temp1/10;
        }
        System.out.println((s1 == num1)?"Adam number":"Not an Adam number");
    }
}
