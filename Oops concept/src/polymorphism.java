class rbi_b{
    float a = 2.5f;
    public float disp(){
        return a;
    }
}

class sbi_b extends rbi_b{
    float b = 3.5f;
    public float disp(){
        return b + a;
    }
}

class hdfc_b extends rbi_b{
    float c = 4.5f;
    public float disp(){
        return c + a;
    }
}

class icici_b extends rbi_b{
    float d = 5.5f;
    public float disp(){
        return d + a;
    }
}

public class polymorphism {
    public static void main(String[] args) {
        rbi_b r;
        r = new sbi_b();  // upcasting...
        System.out.println("The parent to child sbi"+r.disp());
        r = new hdfc_b();
        System.out.println("The parent to child hdfc"+r.disp());
        r = new icici_b();
        System.out.println("The parent to child icici"+r.disp());
    }
}
