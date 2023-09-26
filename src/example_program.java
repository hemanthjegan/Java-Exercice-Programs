import java.util.Scanner;

public class example_program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int ex = in.nextInt();
        int acc = in.nextInt();
        if(a>25 || ex >10 || acc<=2){
            System.out.println("you are eligible");
        }else{
            System.out.println("not eligible");
        }
    }
}
