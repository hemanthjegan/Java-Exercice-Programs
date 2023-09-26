import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        int n = 5;
//        char ch = 'A';
//        for (int i = 1; i <=n ; i++) {
//            for (int j = 1; j <=i ; j++) {
//                System.out.print(ch+" ");
//                ch++;
//            }
//            System.out.println();
//        }
        ArrayList a = new ArrayList();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        System.out.println(a);
        for (int i = 0; i <3 ; i++) {
            int temp = (int) a.get(a.size()-1);
            a.remove(a.size()-1);
            a.add(0,temp);
        }
        System.out.println(a);
    }
}