import java.util.Scanner;

public class armstrong_no2 {
    public static void main(String[] args) {
        for (int i = 200; i <400 ; i++) {
            int temp,count=0;
            temp = i;
            while (temp > 0) {
                temp = temp/10;
                count++;
            }
            int m= i;
            int d;
            double s=0;
            while (m > 0) {
                d = m%10;
                s = s+Math.pow(d,count);
                m = m/10;
            }
            if (s == i) {
                System.out.println(i+" is an Armstrong number ");
            }
        }
    }
}
