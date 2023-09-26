public class string_builder_buffer {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("raja");
        s.append("rani");
//        System.out.println(s);
//        s.delete(0,2);
//        System.out.println(s);
//        s.delete(0,5);
//        System.out.println(s);

        String s1 = "Hemanth";
        String s2 = s1.intern();  // restore /fetch /retrieve
        System.out.println(s2);
    }
}
