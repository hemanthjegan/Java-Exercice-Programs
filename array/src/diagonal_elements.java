import java.util.Scanner;

public class diagonal_elements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int s = in.nextInt();
        int a[][] = new int[s][s];
        System.out.println("Enter the elements of an array : ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i == j ){
                    System.out.print(a[i][j] + " ");
                }
            }
        }
    }
}

