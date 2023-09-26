import java.util.*;

public class atm_amount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int fivehund = n/500;
        int fivehund1 = n-fivehund*500;
        int hund = fivehund1/100;
        int hund1 = fivehund1-hund*100;
        int fifty = hund1/50;
        int fifty1 = hund1-fifty*50;
        int twenty = fifty1/20;
        int twenty1 = fifty1-twenty*20;
        int ten = twenty1/10;
        int ten1 = twenty1-ten*10;
        int five= ten1/5;
        int five1 = ten1-five*5;
        int two = five1/2;
        int two1 = five1-two*2;
        int one = two1/1;
        System.out.println("Total number of notes: ");
        System.out.println("500"+" : "+fivehund);
        System.out.println("100"+" : "+hund);
        System.out.println("50"+" : "+fifty);
        System.out.println("20"+" : "+twenty);
        System.out.println("10"+" : "+ten);
        System.out.println("5"+" : "+five);
        System.out.println("2"+" : "+two);
        System.out.println("1"+" : "+one);
    }
}
