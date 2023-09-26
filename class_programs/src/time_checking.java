public class time_checking {
    public static void main(String[] args) {
        long st = System.currentTimeMillis();    // starting point
        StringBuffer s = new StringBuffer("Hemanth");
        for (int i = 0; i <=1000 ; i++) {
            s.append("Raj");
        }
//        System.out.println(s);
        System.out.println("Buffer : "+(System.currentTimeMillis()-st)+" milli second");

         long st1 = System.currentTimeMillis();    // starting point
         StringBuilder s1 = new StringBuilder("Hemanth");
         for (int i = 0; i <=1000 ; i++) {
         s1.append("Raj");
         }
//         System.out.println(s1);
         System.out.println("Builder : "+(System.currentTimeMillis()-st1)+" milli second");
    }
}




