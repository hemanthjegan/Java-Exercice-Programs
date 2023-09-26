//public class this_keyword {
//    public void disp(){
//        System.out.println("Hello");
//    }
//    public void show(){
//        System.out.println("hi..");
//        this.disp();
//        disp();
//    }
//    public static void main(String[] args) {
//        this_keyword t = new this_keyword();
//        t.show();
////        this_keyword t1 = new this_keyword();
////        t.show();
//    }
//}


//public class this_keyword{
//    public void add(int a, int b){
//
//        System.out.print("The addition of two numbers : " +(a+b));
//    }
//    public void disp(){
//        this.add(2,5);
//    }
//
//    public static void main(String[] args) {
//        this_keyword t = new this_keyword();
//        t.disp();
//    }
//}


class cons{
        cons(){

            System.out.println("first constrctor....");
        }
       public cons(int x, int y){
            this();  // default this keyword...
           System.out.println("The addition of two number is : "+(x+y));
        }
}

public class this_keyword {
    public static void main(String[] args) {
        cons c = new cons(4,5);
    }
}
