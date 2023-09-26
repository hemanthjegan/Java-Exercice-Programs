import java.util.Scanner;

public class upper_lower_case {
            public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = "hemanthrajjeganathan";
        StringBuilder s = new StringBuilder(name);
        for (int i = 0; i <2 ; i++){
            if(s.charAt(i)>=97 && s.charAt(i)<=122){
                int replace = s.charAt(i) -32;
                s.setCharAt(i, (char) replace);
            }
        }
        for (int i = 4; i <s.length() ; i+=4){
            int replace = 0, temp = 0;
            if(s.charAt(i)>=97 && s.charAt(i)<=122){
                replace = (int) s.charAt(i) -32;
                s.setCharAt(i, (char) replace);
                temp = i;
                temp += 1;
                replace = (int) s.charAt(temp) -32;
                s.setCharAt(temp, (char) replace);
            }
        }
        System.out.println(s);
    }
}
