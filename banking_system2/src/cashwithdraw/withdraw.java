package cashwithdraw;

import openacc.createacc;

import java.util.Scanner;
public class withdraw {
    float with_draw;
    float balance;
    public void disp(){
        System.out.println("Enter withdraw amount : ");
        Scanner in = new Scanner (System.in);
        with_draw = in.nextFloat();
        if(with_draw < createacc.current_bal) {
            balance = createacc.current_bal - with_draw;
                System.out.println("Available Balance after withdrawing : " + balance);
        }
        else {
            System.out.println(" Not enough balance !!");
        }
    }
}
