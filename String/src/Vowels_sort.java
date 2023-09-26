import java.util.ArrayList;
import java.util.Collections;

public class Vowels_sort {
    public static void main(String[] args) {
        String s ="Hemanth raj"; // leetcode
        ArrayList list = new ArrayList();
        vowels(s, list);
    }

    public static void vowels(String s, ArrayList list){
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i) == 'A' || s.charAt(i) == 'a' || s.charAt(i) == 'E' || s.charAt(i) == 'e' || s.charAt(i) == 'I' || s.charAt(i) == 'i'
                    || s.charAt(i) == 'O' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'U'){
             list.add(s.charAt(i));
            }
        }
        Collections.sort(list);
        System.out.println(list);
    }
}
