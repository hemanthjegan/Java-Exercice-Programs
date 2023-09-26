import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i=0; i<=a.length-1; i++){
            a[i] = in.nextInt();
        }
        boolean unique = true;
        for(int i=0; i<=a.length-1; i++){
            for(int j =i+1; j<=a.length-1; j++){
                if(i!=j && a[i] == a[j]){
                    unique = false;
                        break;
                }
                else{
                    int res = a[i];
                    System.out.println(res);
                }
            }
        }
    }
}