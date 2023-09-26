public class exception_handling2 {
    public static void main(String[] args) {
        try{
//            int a = 100/0;
//            System.out.println(a);
            int a[] = new int[4];
            a[12] = 34;
            System.out.println(a[12]);
        }
//        catch(NumberFormatException e){
        catch(NumberFormatException e3){
            System.out.println(e3);
        }
        catch(ArrayIndexOutOfBoundsException e4){
            System.out.println(e4);
        }
        catch(ArithmeticException e1){
            System.out.println(e1);
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("-----------");
            System.out.println("end of the exception..");
        }
    }
}