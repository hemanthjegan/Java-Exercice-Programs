
// 5 7 12 25.....
public class numuber_series_1 {
    public static void main(String[] args) {
        num_series(10);
    }

    public static void num_series(int n){
        int a=5,b=7,c;
        System.out.print(a+" "+b+" ");
        for (int i = 0; i < n; i++) {
            c = a + b;
            System.out.print(c+" ");
            b = b+2;
            c = c+2;
            a = b;
            b = c;
        }
    }
}