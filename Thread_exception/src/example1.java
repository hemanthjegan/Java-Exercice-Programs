import java.util.Scanner;

public class example1 extends Thread{
    public void run(){
        String a = "_____ I N T E R M I S S I O N _____";
        for (int i = 0; i <a.length() ; i++) {
            char ch = a.charAt(i);
            try{
//                if(a.charAt(i) == 95){
//                    Thread.sleep(300);
//                }else Thread.sleep(1000);
                if(a.charAt(i) >=65 && a.charAt(i) <= 90){
                    Thread.sleep(1000);
                }else Thread.sleep(300);
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.print(a.charAt(i));
        }
    }

    public static void main(String[] args) {
        example1 e = new example1();
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.print("\n\n\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t");
        e.start();
    }
}
