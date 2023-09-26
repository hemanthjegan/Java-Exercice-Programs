class gfather{
    int gwealth = 100;
    void one(){

        System.out.println("Total grand father's wealth is : "+ gwealth);
    }
}

class father extends gfather{
    int fwealth = 200;
    void two(){

        System.out.println("Total father's wealth is : "+ (gwealth + fwealth));
    }
}

class son extends father{
    int swealth = 300;
    void three(){
        int value1 = swealth + (gwealth/2 + fwealth/2);
        System.out.println("Total son's father wealth is : "+ value1);
    }
}

class daughter extends father{
    int dwealth = 250;
    void four(){
        int value2 = dwealth + (gwealth/2 + fwealth/2);
        System.out.println("Total grand father wealth is : "+ value2);
    }
}

public class hybrid_inheritance {
    public static void main(String[] args) {
        son s = new son();
        s.one();
        s.two();
        s.three();
        daughter d = new daughter();
        d.four();
    }
}
