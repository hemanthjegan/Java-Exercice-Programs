public class count_characters {
    public static void main(String[] args) {
        String s = "banana";
        for (int i = 0; i <s.length() ; i++) {
            int count =0;
            for (int j = 1; j <s.length(); j++) {
                if(s.charAt(i) == s.charAt(j)){
//                    System.out.print(s.charAt(i)+" ");
                    count++;
                }
            }
            System.out.println(s.charAt(i)+" "+count);
        }
    }
}
