import java.util.Scanner;

public class alpha_numeric {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
//        String s = in.next();
        String s = "Heman123";   // hemanth // 12345
        int sum = 0, alpa = 0, num = 0;
        for (int i = 0; i <s.length() ; i++) {
            char ch = s.charAt(i);
            if(Character.isAlphabetic(ch)) alpa++;
            if(Character.isDigit(ch)){
                sum += Integer.parseInt(String.valueOf(ch));     // integer.parse used to terminte the chaacter ascii values
//                sum += Integer.parseInt(ch+" ");            // or
                num++;
            }
        }if(alpa == s.length() || num == s.length()) System.out.println("only alpha or numeric"+s);
        else System.out.println("Alpha numeric sum : "+sum);
    }
}
