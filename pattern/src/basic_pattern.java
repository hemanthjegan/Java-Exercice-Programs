public class basic_pattern {
    public static void main(String[] args) {
        pattern_6(5);
    }

    public static void pattern_1(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern_2(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = i; j <=n ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern_3(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <i ; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <=n ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern_4(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = i; j <n ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern_5(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = i; j <=n-1 ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i*2-1 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern_6(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <=n*2-i*2 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
