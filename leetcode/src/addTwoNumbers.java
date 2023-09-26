import java.util.ArrayList;
import java.util.List;

public class addTwoNumbers {
    public static void main(String[] args) {
        List<Integer> li1 = new ArrayList<>();
        List<Integer> li2 = new ArrayList<>();
            li1.add(2);
            li1.add(4);
            li1.add(3);
            li2.add(5);
            li2.add(6);li2.add(4);
        List al = new ArrayList();
        int s1 = 0, s2 =0,sum = 0;
        for (int i = 0; i <li1.size() ; i++) {
           s1 = s1*10 + li1.get(i);
            s2 = s2*10 + li2.get(i);
            sum = s1 + s2;
        }
        while(sum > 0){
            int rem = sum%10;
            al.add(rem);
            sum = sum/10;
        }
        System.out.println(al);
    }
}
