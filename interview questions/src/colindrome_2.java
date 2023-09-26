import java.util.Arrays;

public class colindrome_2 {        // input must be multiple of 6
    public static void main(String[] args) {
        boolean flag = true;
        String str = "abccbahemmehrajjar";
        if(str.length()%6 == 0) {
            StringBuffer s = new StringBuffer(str);
            String a = "";
            for (int i = 3; i < s.length(); i += 4) {
                a = String.valueOf(s.insert(i, " "));
            }
            String b[] = a.split(" ");
            System.out.println(Arrays.toString(b));
            for (int i = 1; i < b.length; i += 2) {
                String result = "";
                for (int j = b[i].length() - 1; j >= 0; j--) {
                    char ch = b[i].charAt(j);
                    result += ch;
                }
                System.out.println(result);
                for (int k = 0; k < b.length; k += 2) {
                    if (result.equals(b[k])) {
                        flag = true;
                    } else {
                        flag = false;
                    }
                }
            }
            if (flag == true) System.out.println("Colindrome");
            else System.out.println("Not an Colindrome");
        }else {
            System.out.println("Not an Colindrome");
        }
    }
}