public class excel {
    public static void main(String[] args) {
        String s = "AAA";
        alpha_number(s);
//        int result = 0, num = 0, size = 0;
//        for (int i = 0; i < 1; i++) {
//            if (s.length() <= 1) {
//                result = s.charAt(i) - 65 + 1;
//            }
//        }
//        for (int i = 0; i < s.length(); i++) {
//            if (i < s.length() - 1) {
//                size = (s.charAt(i) - 65 + 1) * 26;
//                result += size ;
//            } else if (i == s.length() - 1) {
//                num = s.charAt(s.length() - 1) - 65 + 1;
//                result += num;
//            }
//        }
//        System.out.println(result);
    }

    public static void alpha_number(String s){
        int result = 0, num = 0, size = 0, temp = 1, count = 0, temp2 = 1;
        for (int i = 0; i < 1; i++) {
            if (s.length() <= 1) {
                result = s.charAt(i) - 65 + 1;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1) {
                size = (s.charAt(i) - 65 + 1) * 26;
                if(s.length() > 2){
                    temp *= size ;
                    count++;
                }else {
                    result += size;
                }
            } else if (i == s.length() - 1) {
                num = s.charAt(s.length() - 1) - 65 + 1;
                if(count == 0){
                    temp = 0;
                }else {
                    temp2 = s.charAt(s.length() - 1) - 65 + 1;
                    temp += temp2 * 26;
                }
                result += num + temp;
            }
        }
        System.out.println(result);
    }
}
