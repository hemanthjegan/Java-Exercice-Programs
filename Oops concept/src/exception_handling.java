public class exception_handling {
    public static void main(String[] args) {
        try{                                  //try block
            int a[] = new int[10];
            a[12] = 19;
            System.out.println(a[12]);
        }
//        catch(NumberFormatException e){
        catch(Exception e){                    // catch block
            System.out.println("Hi how are you !! ");   // user message...
            System.out.println(e); //system provided
            e.printStackTrace();   // to determine which line has error occured...  // combination of two or more
        }
        System.out.println("end of the exception..");
    }
}
