import java.util.*;

public class Bonous_ince_decre {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum=0;
        System.out.println("Enter your salary per month : ");
        int s = in.nextInt();   //salary
        System.out.println("Enetr your experience in year :");
        int y = in.nextInt();
        if(y >= 5){
            sum = s+(s *5/100);
            System.out.println("After bonous increment your salary's : "+sum);
        } else if (y<5) {
            System.out.println("There's no bonous increment becasuse you got "+y+" experience only !!");
        }else{
            System.out.println("Invalid input !!");
        }

    }
}
