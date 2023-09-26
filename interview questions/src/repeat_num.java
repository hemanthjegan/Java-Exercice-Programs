public class repeat_num {
    public static void main(String[] args) {
        String a = "82455614";
        char ch[] = a.toCharArray();
        for (int i = 0; i <ch.length ; i++) {
            for (int j = i+1; j <ch.length ; j++) {
                if(ch[i] == ch[j]){
                    System.out.println(ch[i]);
                    break;
                }
            }
        }
    }
}
