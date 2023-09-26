public class armstrong {
    public static void main(String[] args) {
        for (int i = 0; i <=100000 ; i++) {
            int temp,count=0;
            temp = i;
            while (temp > 0) {
                temp = temp/10;
                count++;
            }
            int m= i;
            int d;
            double s=0;
            for (int j = 0; j < m ; m = m/10) {
                d = m%10;
                s = s+Math.pow(d,count);
            }if (s == i) {
                System.out.println(i+" is an Armstrong number ");
            }
        }
    }
}