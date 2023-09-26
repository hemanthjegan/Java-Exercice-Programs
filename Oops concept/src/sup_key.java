//class parent1{           // super keyword is used to access the variables and properties of the parenrt class
//    String name = "Hemanthraj";
//    public void m1(){
//
//    }
//}
//class child1 extends parent1{
//    String name ="H.Raja";
//    public void m2(){
//        System.out.println("The parent name is : "+super.name);    //here using super keyword
//        System.out.println("The child name is : "+name);
//    }
//}
//
//public class sup_key {
//    public static void main(String[] args) {
//        child1 c = new child1();
//        c.m2();
//    }
//}


class parent1{           // super keyword is used to access the variables and properties of the parenrt class
    String name = "Hemanthraj";
    public void m1(){
        System.out.println("The parent name is : "+name);
    }
}
class child1 extends parent1{
    String name ="H.Raja";
    public void m2(){
//        super.m1();
        System.out.println("The child name is : "+name);
        m3(); // default super keyword
    }
    public void m3(){
        super.m1();
        System.out.println("They are live in kovilpatti...");

    }
}

public class sup_key {
    public static void main(String[] args) {
        child1 c = new child1();
        c.m2();
    }
}