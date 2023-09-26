import java.util.*;

public class array_list {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(2);
        a.add(3);
        System.out.println(a);

        ArrayList c = new ArrayList();
        c.add(4);
        c.add("Hemanthraj");
        c.add('H');
        System.out.println(c);

        ArrayList <String> mobile = new ArrayList<String>();
        mobile.add("Vivo");
        mobile.add("Oppo");
        mobile.add("Mi");
        mobile.add("one plus");
        System.out.println(mobile);
        System.out.println("-----------------------------------------------");

        System.out.println(mobile.get(1));
        System.out.println("-----------------------------------------------");

        for (int i = 0; i <mobile.size() ; i++) {
            System.out.println(mobile.get(i));
        }
        System.out.println("-----------------------------------------------");

        for(String m : mobile){
            System.out.println(m);    // enhanced or for each loop
        }
        System.out.println("-----------------------------------------------");

        String ca[] = new String[]{"aadi","benz","renault","bmw"};
        List car = Arrays.asList(ca);
        System.out.println(car);
        String temp = "hemanthraj";
        for(Object cars : car){
            System.out.println(cars);
        }
        System.out.println("-----------------------------------------------");

        for (int i = 0; i <car.size() ; i++) {
            System.out.println(car.get(i));
        }
        System.out.println("-----------------------------------------------");

        if(car.contains("benz")){        // to find the element in the list
            System.out.println("Car available");
        }else {
            System.out.println("Not available");
        }
        System.out.println("-----------------------------------------------");

        String d[] = new String[]{"aadi","benz","renault","bmw","ferrari"};
        List car1 = Arrays.asList(d);
        String e[] = new String[]{"aadi","benz","bmw"};
        List vehicle = Arrays.asList(e);
        if(car1.containsAll(vehicle)) System.out.println("All cars available");
        else System.out.println("Some cars are not available");
        if(vehicle.containsAll(car1)) System.out.println("All cars available");
        else System.out.println("Some cars are not available");
        System.out.println("-----------------------------------------------");

        ArrayList <String> mobiles = new ArrayList<String>();
        mobiles.add("Vivo");
        mobiles.add("Oppo");
        mobiles.add("Mi");
        mobiles.add("one plus");
        System.out.println(mobiles.subList(0,2));  // sub-list
        System.out.println("-----------------------------------------------");

        ArrayList <String> mobiless = new ArrayList<String>();
        mobiless.add("Vivo");
        mobiless.add("Oppo");
        mobiless.add("Apple");
        mobiless.add("Mi");
        mobiless.add("One plus");
        Collections.sort(mobiless);
        System.out.println(mobiless);
        Collections.reverse(mobiless);
        System.out.println(mobiless);
        System.out.println("-----------------------------------------------");

        ArrayList <String> f = new ArrayList<String>();
        f.add("Vivo");
        f.add("Oppo");
        f.add("Mi");
        f.add("one plus");
        System.out.println(f.indexOf("Oppo"));
        int g = f.indexOf("Oppo");
        System.out.println(f.get(g));
        System.out.println(f.indexOf("apple"));    // element not there then it returns -1..
        f.remove("Mi");
        System.out.println(f);
        System.out.println("-----------------------------------------------");

        ArrayList <String> h = new ArrayList<String>();
        h.add("Vivo");
        h.add("Oppo");
        h.add("Mi");
        h.add("one plus");
        System.out.println(h.isEmpty());
        h.clear();
        System.out.println(h.isEmpty());
    }
}
