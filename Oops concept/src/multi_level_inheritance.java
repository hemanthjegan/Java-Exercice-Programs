//class grandfather{
//    int gf = 1000;
//    void gf_wealth(){
//
//    }
//}
//class father extends grandfather{
//    int f = 20000;
//    void f_wealth(){
//        int father_wealth = gf + f;
//        System.out.println("Total wealth of father : " + father_wealth);
//    }
//}
//class son extends father{
//    int s = 300000;
//    void s_wealth(){
//       int son_wealth = gf + f + s;
//        System.out.println("Total Wealtb of son : "+son_wealth);
//    }
//}
//
//public class multi_level_inheritance {
//    public static void main(String[] args) {
//        son s = new son();
//        s.s_wealth();
//        s.f_wealth();
//    }
//}

class student{
    String s_name = "Rajesh";
    void stu_name(){

    }
}

class staff extends student{
    String sta_name = "Vani";
    void staff_name(){

    }
}

class college extends staff{
    String c_name = "Mahendra Engineering";
    void display(){
        System.out.println("Hi I am "+s_name+", My staff name is "+sta_name+" and I am belongs to "+c_name+" college..");
    }
}
public class multi_level_inheritance {
    public static void main(String[] args) {
        college c = new college();
        c.display();
    }
}
