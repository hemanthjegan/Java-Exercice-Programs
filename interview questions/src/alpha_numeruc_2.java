import java.util.Scanner;

public class alpha_numeruc_2 {
    public static void main(String[] args) {
//        Scanner in =new Scanner(System.in);
////        String s = in.next();
//        String s = "Heman123Raja2324jegan879";
//        for (int i = 0; i <s.length() ; i++) {
//            int num = 0, count =0;
//            if(Character.isDigit(s.charAt(i))){
//            char ch = s.charAt(i);
//            if(ch>=48 && ch<=57) {
//                num = Integer.parseInt((num * 10) + String.valueOf(ch));
//                System.out.print(num + " ");
//                count++;
//            }
//            }
//        }


        Scanner in = new Scanner(System.in);
        String s = in.next();
        int max = 0;
        String temp = "0";
        for (int i = 0; i < s.length() ; i++) {
            char ch = s.charAt(i);
            if(Character.isDigit(ch)) temp += ch;
            else {
                int val = Integer.parseInt(temp);
                if(max > val) max = val;
                temp = "0";
            }
        }
        System.out.println(max);
    }
}


// not completed