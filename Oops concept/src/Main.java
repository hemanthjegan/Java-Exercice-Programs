import java.util.*;
class numbers{
    int n;
    public void even(int num){
        n = num;
//        if(n%2 == 0){
//            System.out.println("The given number is even..");
//        }else{
//            System.out.println("The given number is not even..");
//        }
        System.out.println((n%2 == 0?"The given number is even..":"The given number is not even.."));
    }
}

public class Main {
    public static void main(String[] args) {
    numbers num = new numbers ();
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
        System.out.println("Enter the numbers : ");
        for (int i = 0; i <size ; i++) {
            int n = in.nextInt();
            num.even(n);
        }
    }
}