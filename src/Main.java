public class Main {
    public static void main(String[] args) {

        byte b=(byte)0b00000101;
        System.out.print(b+",");
        b^=0b00001111;

            System.out.println(b);
        }
    }
