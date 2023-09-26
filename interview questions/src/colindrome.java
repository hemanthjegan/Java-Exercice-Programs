//public class colindrome {
//    public static void main(String[] args) {
//        String str = "abccba";
//        if(str.length()%6 == 0) {
//            int a = str.length()/2 ;
//            String part1="",part2="";
//            for (int i = str.length()-1; i >a-1; i--) {
//                part2 +=str.charAt(i);
//            }
//            for (int i = 0; i < a; i++) {
//                part1 +=str.charAt(i);
//            }
//            System.out.println(part1+" "+part2);
//            System.out.println((part1.equals(part2))?"colindrome":"not a colindrome");
//        }
//    }
//}


public class colindrome {
    public static void main(String[] args) {
        String str = "abccba";
        if(str.length()%6 == 0) {
            StringBuffer s = new StringBuffer(str);
            String a = String.valueOf(s.insert(3, " "));
            System.out.println(a);
            String result = "";
            String b[] = a.split(" ");
            for (int i = b[1].length() - 1; i >= 0; i--) {
                char ch = b[1].charAt(i);
                result += ch;
            }
            System.out.println(result);
            if (result.equals(b[0])) {
                System.out.println("colindrome");
            } else System.out.println("Not an colindrome");
        }else{
            System.out.println("Not an Colindrome");
        }
    }
}