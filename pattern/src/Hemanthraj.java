public class Hemanthraj {
    public static void main(String[] args) {
        name(7);
    }

    public static void name(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if(j == 1 || j == n || n/2+1 == i){
                    System.out.print("* ");
                }else System.out.print("  ");
            }
            for (int j = 1; j <=2 ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=n ; j++) {
                if(i == 1 || i == n || j == 1 || (n/2)+1 == i){
                    System.out.print("* ");
                }else System.out.print("  ");
            }
            for (int j = 1; j <=2 ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=n ; j++) {
                if(j == 1 || j == n || i == j && i <= n/2+1 || i+j == n+1 && i <= n/2+1){
                    System.out.print("* ");
                }else System.out.print("  ");
            }
            for (int j = 1; j <=2 ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=n ; j++) {
                if(j == 1 || i == 1 || j == n || n/2+1 == i){
                    System.out.print("* ");
                }else System.out.print("  ");
            }
            for (int j = 1; j <=2 ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=n ; j++) {
                if(j == 1 || j == n || i == j){
                    System.out.print("* ");
                }else System.out.print("  ");
            }
            for (int j = 1; j <=2 ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=n ; j++) {
                if(i == 1 || j == n/2+1){
                    System.out.print("* ");
                }else System.out.print("  ");
            }
            for (int j = 1; j <=2 ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=n ; j++) {
                if(j == 1 || j == n || n/2+1 == i){
                    System.out.print("* ");
                }else System.out.print("  ");
            }
            for (int j = 1; j <=2 ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=n ; j++) {
                if(j == 1 || i == 1 || j == n && i <= n/2 || n/2+1 == i || i == j && i > n/2){
                    System.out.print("* ");
                }else System.out.print("  ");
            }
            for (int j = 1; j <=2 ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=n ; j++) {
                if(j == 1 || j == n || i == 1 || i == n/2+1){
                    System.out.print("* ");
                }else System.out.print("  ");
            }
            for (int j = 1; j <=2 ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=n ; j++) {
                if(i == 1 || j == n/2+1 || i == n && j < n/2+1 || j == 1 && i > n/2+1){
                    System.out.print("* ");
                }else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
