public class stringss {            // slicing...
    public static void main(String[] args) {
        String s = "raja rani";
        System.out.println(s.substring(2));
        System.out.println(s.substring(4));
        System.out.println(s.substring(0,2));
        System.out.println(s.substring(2,6));
        System.out.println(s.substring(6,8));
        System.out.println(s.substring(7,9));
        String s2 = "    raja rani";
        System.out.println(s2.trim());
        String f = "Hemanth";
        String l = "Raj";
//        String re = f+" "+l;
//        System.out.println(re);
//        System.out.println(re.substring(8)+" "+re.substring(0,7));
        System.out.println("Before swap : "+f+" "+l);
        f = f + l;
        l = f.substring(0,(f.length()-l.length()));
        f = f.substring(l.length());
        System.out.println("After swap : "+f+" "+l);

    }
}
