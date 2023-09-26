public class Diamond {
    public static void main(String[] args) {
        Pattern_5(5);
    }
    public static void Pattern_1(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = i; j<=n-1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            for (int j = 2; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <=n-1 ; j++) {
                System.out.print("* ");
            }
            for (int j = i; j <=n-2 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void Pattern_2(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <=n ; i++) {
            for (int j = i; j <=n-1 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void Pattern_3(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <=2*(n-i) ; j++) {

                System.out.print("  ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <=n ; i++) {
            for (int j = i; j <=n-1 ; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <=i*2 ; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <n ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void Pattern_4(int n) {
        for (int i = 1; i <= 2 * n; i++) {
            if (i <= n) {
                for (int j = 1; j <= n * 2 - 1; j++) {

                    if (j <= i || j >= (2 * n) - i) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            } else {
                for (int j = 2 * n - 1; j >= 1; j = j--) {
                    if (j <= i - 2 || i <= (2 * n) - i) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }

                }
            }
            System.out.println();
        }
    }
    public static void Pattern_5(int n){
        for (int i = 1; i <n ; i++) {
            for (int j = i; j <n ; j++) {
                System.out.print("  ");
            }
            for (int j =1 ; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
