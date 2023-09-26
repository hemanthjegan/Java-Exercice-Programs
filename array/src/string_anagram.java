import java.util.Arrays;
import java.util.Scanner;

public class string_anagram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first string : ");
        String str1 = in.next();
        System.out.println("Enter Second String : ");
        String str2 = in.next();
        if(str1.length() == str2.length()){
            char a[] = str1.toLowerCase().toCharArray();
            char b[] = str2.toLowerCase().toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            System.out.println(Arrays.toString(a));
            System.out.println(Arrays.toString(b));
            if(Arrays.equals(a,b)){
                System.out.println("The Given two strings are Anagram");
            }
            else{
                System.out.println("The given strings are not an Anagram");
            }
        }else{
            System.out.println("Enter correct inputs !");
        }
    }
}
