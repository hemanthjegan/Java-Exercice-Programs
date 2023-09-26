//Longest Substring Without Repeating Characters


import java.util.HashSet;

public class Longest_substring {
    public static void main(String[] args) {
        String s = "pwwkeww";

        System.out.println(lengthOfLongestSubstring(s));

    }

    public static int lengthOfLongestSubstring(String s) {
//        int count = 0, max = 0;
//        for (int i = 0; i <s.length()-1 ; i++) {
//            if(s.charAt(i) != s.charAt(i+1) ){
//                count++;
//            }else {
//                if(count > max) {
//                    max = count;
//                }
//                count = 0;
//            }
//        }

//        String str ="";
//        int max = 0;
//        for (int i = 0; i <s.length(); i++) {
//            str = s.substring(0,i);
//            HashSet<Character> hs = new HashSet<>();
//            if(s.charAt(s.length()) != s.charAt(s.length()-1)){
//                str += s.charAt(s.length());
//                hs.add(s.charAt(s.length()));
//            }
//            for (int j = 0; j <str.length() ; j++) {
//                hs.add(str.charAt(j));
//            }
//            if(hs.size() == str.length()){
//                if(hs.size() > max){
//                    max = hs.size();
//                }
//            }
//            str = "";
//            hs.clear();
//        }
//        if(max == 0){
//            return 1;
//        }
//        return max;

        int n = s.length();
        HashSet<Character> set = new HashSet<>();
        int maxLen = 0;
        int i = 0, j = 0; // Two pointers

        while (i < n && j < n) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                j++;
                maxLen = Math.max(maxLen, j - i);
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }

        return maxLen;
    }
}
