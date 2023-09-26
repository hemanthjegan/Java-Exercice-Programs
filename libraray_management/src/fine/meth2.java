package fine;

import stuinfo.meth1;

import java.util.Scanner;
public class meth2 {
    int amt,bal;
    String lout;
    String bool1 = "yes";
    String bool2 = "no";
    public void two(){
        Scanner in = new Scanner(System.in);
        System.out.println("-------------------------------------------------------");
        System.out.println("Pay fine amount : ");
        System.out.println("(Yes / No)");
        String yn = in.next();
        if(bool1.equals(yn)){
            System.out.println("Enter amount : ");
            amt = in.nextInt();
            int bal = meth1.f_amt-amt;
            System.out.println("Available fine amount : "+bal);
        }else{
            if (bool2.equals(yn)){
                System.out.println("-------------------------------------------------------");
                System.out.println("If you want to logout your id ?");
                System.out.println("(yes / no)");
                lout = in.next();    // logout
                if(bool1.equals(lout)) {
                    System.out.println("--------------------Your are successfully logged out !!------------------");
                }else {
                    if (bool2.equals(lout)) {
                        System.out.println("You stayed in your id....");
                    }else{
                        System.out.println("Enter correct sentence as it is given above...");
                    }
                }
            }else{
                if (bool2.equals(lout)) {
                    System.out.println("You stayed in your id....");
                }else{
                    System.out.println("Enter correct sentence as it is given above...");
                }
            }
        } System.out.println("");
        System.out.println("-------------------------------------------------------");
    }
}
