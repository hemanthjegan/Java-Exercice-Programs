import java.util.*;

public class prime_no_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int size = in.nextInt();
        int n[] = new int[size];
        System.out.println("Enter the elements in an array : ");
        for (int i = 0; i < n.length; i++) {
            n[i] = in.nextInt();
            boolean flag = true;
            for (int j = 2; j < n[i] ; j++) {
                if(n[i]%j == 0){
                    flag = false;
                      System.out.println(n[i]+" is not an prime number");
                    break;
                }
            }
            if(flag == true){
                System.out.println(n[i]+" is an prime number");
            }
        }
        System.out.println(Arrays.toString(n));

    }
}

//class prime_no {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        boolean flag= true;
//        for (int i = 2; i < n ; i++) {
//            if(n%i == 0){
//                flag = false;
//                break;
//            }
//        }
//        if(flag == true){
//            System.out.println(n);
//        }
//    }
//}

//class prime_no {
//    public static void main(String[] args) {
//        prime_number(13);
//        prime_number(25);
//        prime_number(29);
//        prime_number(100);
//        prime_number(125);
//
//    }
//    static void prime_number(int n){
//        int i =2;
//        boolean prime = true;
//        while(i < n){
//            if(n%i == 0){
//                System.out.println(n+" is not a prime number");
//                prime = false;
//                break;
//            }
//            i++;
// i = i+1;
//        }
//        if(prime == true){
//            System.out.println(n+" is a prime number");
//        }
//    }
//}

