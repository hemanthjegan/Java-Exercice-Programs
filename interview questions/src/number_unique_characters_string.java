public class number_unique_characters_string {
    public static void main(String[] args) {
        String s = "hemanthraj";
        boolean flag = true;
        int count = 0;
        for (int i = 0; i <s.length() ; i++) {
            for (int j = 0; j <s.length() ; j++) {
                if(s.charAt(i) == s.charAt(j) && i != j){
                    flag = true;
                    break;
                }else flag = false;
            }
            if(flag == false){
                count++;
                System.out.println(s.charAt(i)+" ");
            }
        }
        System.out.println("Number of unique elements : "+count);
    }
}
