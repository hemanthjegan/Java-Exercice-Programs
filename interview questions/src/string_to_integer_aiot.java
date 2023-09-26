import java.util.Scanner;

public class string_to_integer_aiot {
    public int myAiot(String s){
        boolean isNegative = false;
//    StringBuilder s = new StringBuilder(word);
//    int num = 0, digit = 0, rem = 0;
//        char ch = 0;
//        for (int i = 0; i <s.length() ; i++) {
//            if(s.charAt(i) == 32 || s.charAt(i)>=65 && s.charAt(i)<=90 || s.charAt(i)>=97 && s.charAt(i)<=122 || s.charAt(i) == 48){
//                continue;
//            } else if (s.charAt(i)>=49 && s.charAt(i)<=57){
//                num = Integer.parseInt(String.valueOf(s.charAt(i)));
//            rem = num%10;
//            digit = digit*10 +rem;
//            } else if (s.charAt(i) == 43 || s.charAt(i) == 45) {
//                ch = s.charAt(i);
//                System.out.print(ch);
//            }
//        }
        String check="";
        String num= "";
        for (int i = 0; i <s.length() ; i++) {
            check += s.charAt(i);
            if (check.matches("[0-9]")) {
                num += s.charAt(i);
            }if (check.matches("[-]")) {
                isNegative = true;
            }
            check="";
        }
        int result = Integer.parseInt(num);
        if(isNegative){
            result = -result;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = "-Heman677";
        string_to_integer_aiot ob = new string_to_integer_aiot();
        System.out.println(ob.myAiot(s));

    }
}
