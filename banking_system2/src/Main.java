public class Main {
    public static void main(String[] args) {

//        int a=10, b=20;
//        int c = a++*2;
//        int d = --b*2;
//        System.out.println(c +"," + d);
        int a=5, b=6;
        if(a++ == --b)
        {
            System.out.println("5=5");
        }
        else
        {
            System.out.println("NONE");
        }
    }
}