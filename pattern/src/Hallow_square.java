import java.util.*;

public class Hallow_square {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i == 1 || i == n || j == 1 || j == n){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println("");
        }
    }
}
