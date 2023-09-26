import java.util.*;

public class fruit_count {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int amount = in.nextInt();   // 100 rs...
//        for (int i = 1; i <=amount ; i++) {
//            for (int j = 20; j <=amount ; j+=20) {
//                for (int k = 1; k <=amount ; k++) {
//                    int apple = i*5;
//                    int banana = j/20;
//                    int guava = k*1;
//                    if(i+j+k == 100 && (i*5) + (k*1) + (j/20) == 100){
//                        System.out.println("Apple count : "+i+" Banana count : "+j+" Guava count : "+k);
//                        System.out.println("Apple amount : "+apple+" Banana amount : "+banana+" Guava count : "+guava);
//                            System.out.println("Pay "+amount+" rs....");
//                            System.out.println("-----------Thank you for buying-----------");
//                        }
//                    }
//                }
//        }

        int amount = in.nextInt();
        int a = (int) (19*amount)/100;
        int b = (int) (80*amount)/100;
        int g = (int) (1*amount)/100;
        System.out.println("Apple : "+a+"\n"+"Banana : "+b+"\n"+"Guava : "+g);
    }
}
