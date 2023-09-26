import java.util.Scanner;

public class vehicle_count {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.println("Enter total number of wheels : ");
//        int vehicle = in.nextInt();   // 20 vehicles
//        System.out.println("Enter total number of vehicles : ");
//        int wheels = in.nextInt();    // 64 wheels
//        for (int i = 12; i <=wheels ; i++) {
//            for (int j = 1; j <=wheels ; j++) {
//                int car = i*4;
//                int bike = j*2;
//                if(i+j == vehicle && car+bike == wheels){
//                    System.out.println("Car count : "+i);
//                    System.out.println("Bike count : "+j);
//                    System.out.println("Car wheels count : "+car);
//                    System.out.println("Bike wheels count : "+vehicle);
//                }
//            }
//        }
        System.out.println("Enter total number of vehicles : ");
        int veh = in.nextInt();
        System.out.println("Enter total number of wheels : ");
        int wheel = in.nextInt();
        int cars = (wheel-2*veh)/2;
        int bikes = veh-cars;
        System.out.println("cars : "+cars+"\n"+"Bikes : "+bikes);
    }
}
