public class hollow_diamond {
    public static void main(String[] args) {

        half_diamond(10);
    }
    public static void half_diamond(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                if(j <= n-i || j > 2*n-j ){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
