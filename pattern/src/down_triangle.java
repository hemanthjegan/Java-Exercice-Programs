public class down_triangle {
    public static void main(String[] args) {
            pattern(6);
    }
    
    public static void pattern(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <n*2-i*2 ; j++) {
                if(j%2 == 1) {
                    System.out.print("* ");
                }else System.out.print("1 ");
            }
            System.out.println();
        }
    }
}
