public class Multiplication_table {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.printf("%4d", i*j);
            }
            System.out.println();
        }
    }
}
