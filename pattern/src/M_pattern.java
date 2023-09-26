public class M_pattern {
    public static void main(String[] args) {
        pattern(5);   // input must be odd number
    }

    public static void pattern(int n){
        int mid = (n/2)+1;
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j == 1 || j == n)
                    System.out.print("* ");
                else if (i == j && i <= mid || i + j == n + 1 && i <= mid) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
