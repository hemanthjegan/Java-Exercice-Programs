public class string_palindrome {
    public static void main(String[] args) {
        String str = "race a car";                     //"A man, a plan, a canal: Panama"
        String s = str.toLowerCase();                  //"`l;`` 1o1 ??;l`"
        String a ="", b= "";
        for(int i = 0; i < s.length(); i++){
            if(s.matches("[a-z A-Z 0-9]")){
                a += s.charAt(i);
            }
        }
            for (int i = a.length() - 1; i >= 0; i--) {
                b += a.charAt(i);
            }
            if (a.equals(b)) {
                System.out.println("palindrome");
            } else {
                System.out.println("Not a palindrome");
            }
    }
}
