import java.util.ArrayList;
import java.util.HashSet;

public class count_number_characters {
    public static void main(String[] args) {
        String s = "banana";
        ArrayList<Character> list = new ArrayList<>();
        for(char temp : s.toCharArray()){
            list.add(temp);
        }
        HashSet set = new HashSet();
        set.addAll(list);

        System.out.println(list);
        System.out.println(set);

        for(Object i : set){
            int count = 0;
            for(char j : list){
                if(i.equals(j)){
                   count++;
                }
            }
            System.out.println(i +": "+count);
        }
    }
}
