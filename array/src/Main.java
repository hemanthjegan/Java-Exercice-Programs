import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        int count=0;
        for(int i=0; i<=a.length()-1; i++){
            if(a.charAt(i)>97 && a.charAt(i)<122){
                count++;
            }
        }
        System.out.println(count);
    }
}