//0 1 1 6 13 25 44 75 125......

public class number_series2 {
    public static void main(String[] args) {

        num_ser(10);
    }
    static void num_ser(int n){
        int a = 0 , b = 1, c = 1, d = 6, e;
        System.out.print(a+" "+b+" "+c+" "+d+" ");
        for (int i = 0; i < n; i++) {
            e = (c + d)+6;
            System.out.print(e+" ");
            c = d;
            d = e;
        }
    }
}
