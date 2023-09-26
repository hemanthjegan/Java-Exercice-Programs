import java.util.Scanner;

public class maximum_1s {
    public static void main(String[] args) {
//        ArrayList <Integer> a = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String s = "10011001111001";
        int max=0;
        for (int i = 0; i <s.length() ; i++) {
            int count = 0;
            if(Integer.parseInt(String.valueOf(i)) == 1){
                count++;
            }
            if(max<count) max = count;
            if(Integer.parseInt(String.valueOf(i)) == 0){
                break;
            }
        }
        System.out.println();

    }
}
