public class String_Array {
    public static void main(String[] args) {
        String strings = "abcdaeghaj", a="";
        StringBuffer s = new StringBuffer(strings);
        for (int i = 0; i <s.length() ; i++) {
            for (int j = i+1; j <s.length() ; j++) {
                if(s.charAt(i) == s.charAt(j)){
                     a = String.valueOf(s.insert(j, " "));
                }
            }
        }
        System.out.println(strings);
    }
}
