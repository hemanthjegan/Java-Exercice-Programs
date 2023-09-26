//class one{
//    private int a;
//    private void set(){
//        System.out.println("The value of a is : "+a);
//    }
//    public int get(int n){
//        this.a = n;
//        return a;
//    }
//}
//
//
//public class priv_modifier {
//    public static void main(String[] args) {
//       one o = new one();
//        System.out.println(o.get(23));
//    }
//}


class one{
    private int a;
    public void set (int x){
        this.a = x;
    }
    public int get(){
        return a;
    }
}


public class priv_modifier {
    public static void main(String[] args) {
        one o = new one();
        o.set(34);
        System.out.println(o.get());
    }
}