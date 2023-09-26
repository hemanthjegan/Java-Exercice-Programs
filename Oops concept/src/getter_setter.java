import java.util.Scanner;

class get_set{
    int acc_no;
    private String pass;
    public int get(){
        return acc_no;
    }
    public void set(int a){
        this.acc_no = a;
    }

    private String getpass(){
        return pass;
    }
    public void setpass(String pass){
        pass = pass;

    }
}
public class getter_setter {
    public static void main(String[] args) {
        get_set gt = new get_set();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Account number : ");
        int acc_no = in.nextInt();
        System.out.println("Enter password : ");
        String pass = in.next();
        System.out.println("Your Account number : "+acc_no);
        System.out.println("Your Password : "+pass);
        System.out.println("------------Successfilly logged in !!----------------");
        gt.set(acc_no);
        gt.setpass(pass);
    }
}
