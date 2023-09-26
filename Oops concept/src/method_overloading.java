class addition{
    public static int add(int a, int b){

        return a+b;
    }
    public static int add(int a, int b, int c){
        return a*b+c;
    }
}
public class method_overloading {
    public static void main(String[] args) {
        System.out.println(addition.add(5,6));
        System.out.println(addition.add(7,2,6));
    }
}


