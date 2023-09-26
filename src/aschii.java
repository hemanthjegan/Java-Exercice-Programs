public class aschii {
    public static void main(String[] args) {
        String s = "shjdv%*&fwdc";
        String temp =" ";
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)<=65 && s.charAt(i)>=90 || s.charAt(i)<=97 && s.charAt(i)>=122 ){
                continue;
            }else{
                temp = temp + s.charAt(i);
            }
        }
        System.out.println(temp);
    }
}


//public class aschii {
//    public static void main(String[] args) {
//        String s = "shjdv%*&fwdc";
//        String temp=" ";
//        for (int i = 0; i <s.length() ; i++) {
//            if(s.charAt(i)>=65 && s.charAt(i)<=90 || s.charAt(i)>=97 && s.charAt(i)<=122 ){
//                temp = temp + s.charAt(i);
//            }
//        }
//        System.out.println(temp);
//    }
//}
