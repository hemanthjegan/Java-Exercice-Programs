import java.util.Scanner;

//public class anagram {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the first string : ");
//        String str1 = in.next();
//        System.out.println("Enter the second string : ");
//        String str2 = in.next();
////        String str1 = "mom";
////        String str2 = "tom";
//        char[] a = str1.toCharArray();
//        char[] b = str2.toCharArray();
//        Arrays.sort(a);
//        Arrays.sort(b);
//        if(Arrays.equals(a,b)) System.out.println("The given Strings are Anagram");
//        else System.out.println("The given Strings are Not an Anagram");
//    }
//}

public class anagram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first string : ");
        String str1 = in.next();
        System.out.println("Enter the second string : ");
        String str2 = in.next();
        str_anagram(str1, str2);
    }

    public static void str_anagram(String str1, String str2){
        int a = 0;
        int b = 0;
        for (int i = 0; i <str1.length() ; i++) {
            for (int j = 0; j <str2.length() ; j++) {
                a = a + str1.charAt(i);
                b = b + str2.charAt(j);
            }
        }if(a == b) System.out.println("The given Strings are Anagram");
        else System.out.println("The given Strings are Not an Anagram");
    }
}
