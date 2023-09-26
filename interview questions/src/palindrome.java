//public class palindrome {
//    public static void main(String[] args) {
//        String str1 = "bannana";
//        char[] a = str1.toCharArray();
//        int count = 0;
//        for (int i = 1; i <a.length-1 ; i++) {
//            String result = "";
//            if(a[i-1] == a[i+1]){
//                count++;
//                result +=String.valueOf(a[i-1])+a[i]+a[i-1];
//            }
//            if(result == ""){
//                continue;
//            }else System.out.println(result);
//        }
//        System.out.println("Palindrome count in the given string : "+count);
//    }
//}

import java.util.HashSet;

public class palindrome{
    public static void main(String[] args) {
        String str = "banana";
        HashSet arr = new HashSet();
        char[] a = str.toCharArray();
        boolean flag = true;
        int count = 0;
        for (int i = 0; i <a.length ; i++) {
            for (int j = i+1; j <a.length ; j++) {
                String temp ="",result ="", var ="";
                if(a[i] == a[j]){
                    for (int k = i; k <=j ; k++) {
                        temp += a[k];
                    }
//                    System.out.println(temp);
                    for (int k = temp.length()-1; k >=0 ; k--) {
                        result += temp.charAt(k);
                    }
                    if(temp.equals(result)){
                        var += temp;
                        arr.add(var);
                    }
//                    String arr[] = var.split(" ");
//                    for (int k = 0; k <arr.length ; k++) {
//                        for (int l = k+1; l < arr.length ; l++) {
//                            if(arr[k].equals(arr[l])){
//                                System.out.println(a[k]);
//                                count++;
//                            }
//                        }
//                    }
                }
            }
        }
        for(Object s : arr){
            System.out.println(s);
        }
        System.out.println(arr.size());
    }
}