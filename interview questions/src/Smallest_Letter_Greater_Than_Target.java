public class Smallest_Letter_Greater_Than_Target {
    public static void main(String[] args) {
        char ch[] = {'c', 'f', 'j'};
        char target = 'a';
        int min = ch[0];
        for (int i = 0; i <ch.length ; i++) {
            for (int j = i+1; j <ch.length ; j++) {
                if(ch[i] > ch[j]){
                    min = ch[i];
                    ch[i] = ch[j];
                    ch[j] = (char) min;
                }
            }
        }
        char result = 0;
        for (int i = 0; i < ch.length; i++) {
            if(target < ch[i]){
                System.out.println(ch[i]);
                result= ch[i];
                System.out.println(result);
                break;
            }
        }
        if(result == 0){
            System.out.println(ch[0]);
            result = ch[0];
            System.out.println(result);
        }
    }
}
