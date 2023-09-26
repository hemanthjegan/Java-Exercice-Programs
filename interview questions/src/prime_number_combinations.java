import java.util.Scanner;

public class prime_number_combinations {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = 18;
    int a[] = new int[n];
    for (int i = 2, k = 0; i <=n ; i++, k++) {
        int count = 0;
        for (int j = 1; j <=i ; j++) {
            if(i%j == 0) count++;
        }
        if(count == 2) {
            a[k] = i;
            System.out.print(i+" ");
        }
    }
//        System.out.println(Arrays.toString(a));
        System.out.println();
//    int a[] = {2,3,5,7,11,13,17};
    for (int i = 0; i <a.length ; i++) {
        for (int j = 1; j <a.length ; j++) {
            if(a[i] + a[j] == n){
                System.out.print(a[i]+" "+a[j]);
                System.out.println();
            }
        }
    }
}

}
