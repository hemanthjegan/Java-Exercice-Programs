public class reverse_string {
    public static void main(String[] args) {
        String a= "kabali is back";
        String b ="";
        for (int i = a.length()-1; i >=0 ; i--) {
            b += a.charAt(i);
        }
        System.out.println(b);
    }
}
