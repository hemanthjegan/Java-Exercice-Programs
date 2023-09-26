//import java.util.*;
//public class guess_number {
//    public static void main(String[] args) {
//        Scanner in = new Scanner (System.in);
//        int guess = (int) (Math.random()*100);
//        int n,count=0;
//        do {
//            System.out.println("------Random number is gernerated------");
//            System.out.println("Enter the number between 1 t0 100 : ");
//            n = in.nextInt();
//            count++;
//            if (guess > n) {
//                System.out.println("Too low! Try Again");
//            } else if (guess < n) {
//                System.out.println("Too high! Try Again");
//            } else {
//                System.out.println("Correct! You got it in " + count + " th guesses!");
//            }
//        }while(guess != n);
//    }
//}


import java.util.*;
public class guess_number {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int guess = (int) (Math.random()*100);
        int n,count=0;
        for (int i = 0; i <=count; i++) {
            System.out.println("------Random number is generated------");
            System.out.println("Enter the number between 1 t0 100 : ");
            n = in.nextInt();
            count++;
            if (guess > n) {
                System.out.println("Too low! Try Again");
            } else if (guess < n) {
                System.out.println("Too high! Try Again");
            } else {
                System.out.println("Correct! You got it in " + count + " th guesses!");
                break;
            }
        }
    }
}
