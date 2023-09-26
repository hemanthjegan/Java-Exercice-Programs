import java.util.*;

public class stackDemo {
    public static void main(String[] args) {
        Stack stk = new Stack();
        int a[] = new int[]{1,2,3,4,5,6,7,8};
        for (int i = 0; i <a.length ; i++) {
            stk.add(a[i]);
        }
        System.out.println(stk.pop());
        System.out.println(stk.peek());
        System.out.println(stk);
        System.out.println(stk.search(8));  // if the value is not there return -1
        System.out.println(stk.search(7)); // if the value is there return 1
        System.out.println(stk.elements());
        stk.addElement(4);
        System.out.println(stk);
        System.out.println(stk.empty());
        System.out.println(stk.isEmpty());
    }
}
