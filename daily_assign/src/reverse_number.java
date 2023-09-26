public class reverse_number {
    public static void main(String[] args) {
        reverse(938403000);

    }
    public static void reverse(int n){
        int d,rev = 0;
        for (int i = 0; i <n ; n=n/10) {
            d = n%10;
            rev = rev*10 + d;
        }
        System.out.println(rev);
    }
}
