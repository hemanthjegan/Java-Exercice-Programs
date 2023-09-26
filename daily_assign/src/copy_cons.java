class complex{
    private int a, b, c;
    complex(int x, int y, int z){
        this.a = x;
        this.b = y;
        this.c = z;
    }
    complex(complex c){      // copy constructor --> pass the object and (class name as data type) as parameter in the method
        this.a = c.a;        // In main method, pass the argument as copy object name that is called object constuctor....
        this.b = c.b;
        this.c = c.c;
    }
    int result(){
        return a+b*c;
    }
}

public class copy_cons {
    public static void main(String[] args) {
        complex c1 = new complex(2,4,6);
        System.out.println("The value of a+b*c is : "+c1.result());

        complex c2 = new complex(c1);
        System.out.println("Copy constructor is called : "+c2.result());

        System.out.println((c1.result() == c2.result())?"It is copy constructor":"It is not an copy constructor");
    }
}
