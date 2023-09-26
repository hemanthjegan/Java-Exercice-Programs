import java.util.Scanner;

public class two_d {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = 4;
        int [][]a = new int[s][s];
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a.length ; j++) {
                a[i][j] = in.nextInt();
            }
        }
        int temp = 0;
        int n = in.nextInt();
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a.length ; j++) {
                if(n > a[i][j]){
                    if(temp < a[i][j]){
                        temp = a[i][j];
                    }
                }
            }
        }
        System.out.println(temp);
    }
}
