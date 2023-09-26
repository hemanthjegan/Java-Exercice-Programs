import java.util.Scanner;

public class number_series4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <n ; i++) {
            while(i>0){
                for (int j = i; j <n ; j++) {
                    int temp=j%i;
                    if(temp==0){
                        System.out.println(i);
                    }
                }
            }
        }
    }
}
