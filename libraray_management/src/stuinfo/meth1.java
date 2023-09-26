package stuinfo;

import java.util.*;
public class meth1 {
    String name = "Hemanthraj";
    int pass = 12345;
    int b_book = 4;   //borrowed books
    int r_book = 1;   //reserved books
    int ret_book = 2;  //return books
    int l_book = 1;   //lost books
    public static int f_amt = 240;  //fine books
    public void one(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Username : ");
        String sname = in.next();
        System.out.println("Enter Password : ");
        int spass = in.nextInt();
        if(sname.equals(name) && spass == pass){
            System.out.println("--------------Successfully logined !!--------------");
            System.out.println("");
            System.out.println("Number of Borrowed books : "+b_book);
            System.out.println("Number of Return books : "+ ret_book);
            System.out.println("Number of Reserved books : "+r_book);
            System.out.println("Number of Lost books : "+l_book);
            System.out.println("Fine amount : "+f_amt);
        }else {
            System.out.println("Enter correct user name or password !!");
        }
    }

}
