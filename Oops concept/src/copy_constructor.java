class complex{
    private int real, img;
    public complex(){
        this.real = 2;
        this.img =4;
    }
    public complex(int x, int y){
        this.real = x;
        this.img = y;
    }
    public String word(){

        return "("+real+"+"+img+"i)";
    }
    public int type(){
        int add = real + img ;
        return add;
    }
}


public class copy_constructor {
    public static void main(String[] args) {
        complex o1 = new complex(8,9);
        System.out.println("Imaginary no is: " +o1.word());

        complex o2 = new complex(6,7);
        System.out.println("The addition of two nos is: "+o2.type());

        complex o3 = new complex();
        System.out.println(o3.word());

        complex o4 = new complex();
        System.out.println(o4.type());
    }
}
