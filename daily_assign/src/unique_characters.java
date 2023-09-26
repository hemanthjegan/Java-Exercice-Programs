public class unique_characters {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("hemanth raj jk");
        boolean flag = true;
        char c=0;
        for (int i = 0; i <s.length() ; i++) {
            for (int j = i+1; j <s.length() ; j++) {
                if(i != j && s.charAt(i) == s.charAt(j)){
                    flag = false;
                    break;
                }
                if(flag = true){
                     c = s.charAt(i);
                }
            }
        }
        System.out.print(c+" ");
    }
}
