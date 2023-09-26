import java.util.*;
                                                           // 2>3>4>5<4<3<2
public class bitonic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int a[] = new int[n];
//        for(int i=0; i<a.length; i++){
//            a[i] = in.nextInt();
//        }
        int a[] = {2,3,4,3,2};
        int center = (a.length / 2);
        boolean flag = false, res = false;
        for (int i = 0; i <center; i++) {
            if (a[i] < a[i + 1]) {
                flag = true;
            }else{
                flag = false;
                break;
            }
        }
        if (flag == true) {
            for (int i = center; i <a.length-1; i++) {
                if (a[i] > a[i + 1]) {
                    res = true;
                }else{
                    res = false;
                    break;
                }
            }
        }
        if(res == true){
            System.out.println("Bitonic");
        }else if (res == false || flag == false) {
            System.out.println("Not Bitonic");
        }
    }
}
