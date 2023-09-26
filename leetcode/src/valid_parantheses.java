public class valid_parantheses {
    public static void main(String[] args) {
        String s = "()";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        boolean flag = false;
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i) == '('){
                for (int j = i; j <s.length() ; j++) {
                    if(s.charAt(i)+1 == s.charAt(i+j)){
                        flag = true;
                    }else flag = false;
                }
            }
            for (int j = i; j <s.length() ; j++) {
                if (s.charAt(i) + 2 == s.charAt(i + j)) {
                    flag = true;
                }else flag = false;
            }
        }
        return flag;
    }
}
