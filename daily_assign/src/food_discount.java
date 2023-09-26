import java.util.*;
public class food_discount {
    public static void main(String[] args) {
//        System.out.println("Select the items which are you eat : ");
//        System.out.println("1.Mutton Biriyani");
//        System.out.println("2.Chicken Biriyani");
//        System.out.println("3.Coke");
//        System.out.println("4.Dry juice ");
//        System.out.println("5.dry_items");
        System.out.println("If you had atleast three items, There's a 'Discount'");
        System.out.println("Chicken Biriyani or Mutton Biriyani is mandatory...");
        Scanner in = new Scanner(System.in);
        System.out.println("");
        System.out.println("If you want 'Mutton Biriyani' you enter true otherwise false : ");
        Boolean mb = in.nextBoolean();
        System.out.println("If you want 'Chicken Biriyani' you enter true otherwise false : ");
        Boolean cb = in.nextBoolean();
        System.out.println("If you want 'Coke' you enter true otherwise false : ");
        Boolean coke = in.nextBoolean();
        System.out.println("If you want 'dry juice' you enter true otherwise false : ");
        Boolean juice = in.nextBoolean();
        System.out.println("If you want 'Dry items' you enter true otherwise false : ");
        Boolean dry = in.nextBoolean();


        if(cb && coke && dry || juice) {
            System.out.println("There's 10% Discount...");
        } else if (cb && coke && dry || juice) {
            System.out.println("There's 20% Discount...");
        }else{
            System.out.println("There is no discount Because you must take minimum three items");
        }
    }
}
