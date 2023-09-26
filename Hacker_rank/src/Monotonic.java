import java.util.*;
                                                     // 3 < 4 < 5 < 6 < 7 < 8 < 9 or 3 > 4 > 5 > 6 > 7 > 8 > 9
public class Monotonic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        boolean flag = false;
        for(int i =0; i<a.length; i++){
            a[i] = in.nextInt();
        }
        for(int i =0; i<a.length-1; i++){
            if(a[0] < a[1]){
                if(a[i] < a[i+1]){
                    flag = true;
                }else{
                    flag = false;
                    break;
                }
            }else{
                if(a[i] > a[i+1]){
                    flag = true;
                }else{
                    flag = false;
                    break;
                }
            }
        }
        if(flag == true){
            System.out.print("Monotonic");
        }else if(flag == false){
            System.out.print("Not Monotonic");
        }
    }
}
