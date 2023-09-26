class one1{
    int a =10;
    void method1(){          // it is the Default specifier i can acces with in the class and sub- class but it can't acces on any other packages
                             // or other package classes. solution is to add public on method then we can access on any other packages.....
        System.out.println("The value of a is : "+a);
    }
}

public class default_speci {
    public static void main(String[] args) {
        one1 o = new one1();
        o.method1();
    }
}
