public class wrapper_to_primitive {
    public static void main(String[] args) {
        int a = 10;
        Integer b = new Integer(56);      // error due to not defined parameter

        Integer d = Integer.valueOf(a);        // primitive to object (wrapper class)
        Integer d1 = a;                        // compile can covert automatically
        System.out.println("Auto boxing "+d+" : "+d1);


        int c = b.intValue();                  // object (wrapper class) to primitive
        int c1 = b;                            // compile can covert automatically
        System.out.println("Auto unboxing "+c+" : "+c1);
    }
}
