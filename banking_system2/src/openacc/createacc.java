package openacc;

import java.util.Scanner;

public class createacc {
    int pin = 2345;
    long acc_no = 11000202837l;
    String holder_name = "Hemanthraj J";
    public static float current_bal = 10000.00f;
    public void acc() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Pin : ");
        int acc_pin = in.nextInt();
        if (acc_pin == pin) {
            System.out.println("Account number : " + acc_no);
            System.out.println("Account Holder's name : " + holder_name);
            System.out.println("Available Balance : " + current_bal);
        }
        else {
            System.out.println("Enter correct Pin !!");
        }
    }
}

