public class x_pattern {
    public static void main(String[] args) {
        pattern_1(10);
    }

    public static void pattern_1(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if(i+j == n+1 || i == j){
                    System.out.print("  ");
                }else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
