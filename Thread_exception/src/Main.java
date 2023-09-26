public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        System.out.println('j'+'a');
ovverrid o = new ovverrid();
o.m2();
    }

}
class ovverrid{
    private void m1(){
        System.out.println("superclass");
    }
    public void m2(){
        System.out.println("super class m2");
        m1();
    }
}