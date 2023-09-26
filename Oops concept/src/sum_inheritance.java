class parent{
    int a=20;
    void meth(){
    }
}
class child extends parent{
    int b = 10;
    void display(){
        int result = a +b;
        System.out.println("The addition of "+a+" + "+b+" : "+result);
    }
}
public class sum_inheritance {
    public static void main(String[] args) {
        child c = new child();
        c.display();
    }
}
