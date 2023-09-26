import java.util.Arrays;
import java.util.Scanner;

public class String_anagrams {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        if(checkIfAnagram(in.next(), in.next()) == true ) System.out.println("Strings are Anagrams...");
        else System.out.println("Strings are not an Anagrams...");
    }

    public static boolean checkIfAnagram(String a , String b){
        boolean flag = false;
     char [] ch = a.toCharArray();
     for(char c : ch){
         if(b.contains(String.valueOf(c))){
             flag = true;
         }else {
             break;
         }
     }
     return flag;
    }

    public static boolean checkIfAnagram_2(String a, String b){
        boolean flag =  false;
    if(a.length() == b.length()){
        char ch1[] = a.toLowerCase().toCharArray();
        char ch2[] = b.toLowerCase().toCharArray();
        Arrays.sort(ch1); Arrays.sort(ch2);
        if(Arrays.equals(ch1, ch2)){
            flag = true;
        }
    }
        return flag;
    }
}
