class vehicle {
    void car(){

        System.out.println("car is running on road.");
    }
}
class bike extends vehicle{
    void car(){
        System.out.println("Both car and bike are running on road.");
    }
}
public class method_overriding {
    public static void main(String[] args) {
        bike bi = new bike();
        bi.car();
    }
}
