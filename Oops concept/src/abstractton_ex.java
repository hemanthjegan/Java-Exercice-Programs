abstract class sport_bike{
    abstract void engine();
    void disp(){
        System.out.println("Abstract class");
    }
}

class light_weight extends sport_bike
{
    void engine(){
        System.out.println("Bike CC up to 150");
    }
}

class mid_weight extends sport_bike
{
    void engine(){
        System.out.println("Bike CC up to 500");
    }
}

class high_weight extends sport_bike
{
    void engine(){
        System.out.println("Bike CC up to 600 to 900");
    }
}
public class abstractton_ex {
    public static void main(String[] args) {
        light_weight l = new light_weight();
        l.engine();
        mid_weight m = new mid_weight();
        m.engine();
        high_weight h = new high_weight();
        h.engine();
    }
}
