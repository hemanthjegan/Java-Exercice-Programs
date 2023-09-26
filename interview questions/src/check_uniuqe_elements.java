import java.util.HashSet;
import java.util.Scanner;

public class check_uniuqe_elements {                       // [112, 300, 786, 345]   o/p : [786, 345]
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<Integer> h = new HashSet<>();
//        int n = in.nextInt();
        int d, s=0;
//        int arr[] = new int[n];
//        for (int i = 0; i <arr.length ; i++) {
//            arr[i] = in.nextInt();
//        }
        int arr[] = {117, 458, 498, 556, 333, 265};
        for (int i = 0; i < arr.length ; i++) {
            int temp = arr[i];
            int count=0;
            while(temp>0){
                d = temp%10;
                temp = temp/10;
                count++;
                h.add(d);
            }
            if(h.size() == count){
                System.out.print(arr[i]+" ");
            }
            h.clear();
        }
    }
}
