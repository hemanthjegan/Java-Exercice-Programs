//public class toogle_case {
//   public static void main(String[] args) {
//        StringBuffer s = new StringBuffer("HemanthRaj123");
//        String temp =" ";
//        for (int i = 0; i <s.length() ; i++) {
//            if(Character.isAlphabetic(s.charAt(i))){
//                if(Character.toLowerCase(s.charAt(i)) != s.charAt(i)){
//                    temp += Character.toLowerCase(s.charAt(i));
//                } else if (Character.toUpperCase(s.charAt(i) ) != s.charAt(i)) {
//                    temp +=Character.toUpperCase(s.charAt(i));
//                }
//            }
//        }
//        System.out.println(temp);
//    }
//}

import java.util.Scanner;

public class toogle_case {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        for (int i = 0; i <s.length() ; i++) {
            char c = s.charAt(i);
            if(Character.isUpperCase(c)) System.out.print(Character.toLowerCase(c)+" ");
            else if (Character.isLowerCase(c)) System.out.print(Character.toUpperCase(c)+" ");
        }
    }
}
