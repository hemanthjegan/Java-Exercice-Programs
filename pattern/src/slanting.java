public class slanting {
    public static void main(String[] args) {
        pattern_2(5);
    }

    public static void pattern(int n){         // left to right slanting
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=n ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern_1(int n){       // right to left slanting
        for (int i = 1; i <=n ; i++) {
            for (int j = i; j <n ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=n ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern_2(int n){   // renault logo
        for (int i = 1; i <=n ; i++) {
            for (int j = i; j <n ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=n-2 ; j++) {
                System.out.print("* ");
            }
            for (int j = 2; j <i*2 ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=n-2 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=n-2 ; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <n*2-i*2-1 ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=n-2 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern_3(int n){     // hallow diamond
        for (int i = 1; i <=n ; i++) {
            for (int j = i; j <n ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=n-(n-1) ; j++) {
                System.out.print("* ");
            }
            for (int j = 2; j <i*2-1 ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=n-(n-1) ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=n-(n-1) ; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <n*2-i*2-2 ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=n-(n-1) ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
