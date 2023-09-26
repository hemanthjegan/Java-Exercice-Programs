import java.util.ArrayList;
import java.util.List;

public class TestJustification {
    public static void main(String[] args) {
        String[] words ={"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth = 16;

        fullJustify(words, maxWidth);
    }

        public static void fullJustify(String[] words, int maxWidth) {
            List<String> li = new ArrayList<>();
            int size = 0;
            int count = 0;
            boolean flag = false;
            String str = "", temp = "";
            for (int i = 0; i <words.length ; i++) {
                size += words[i].length();
            }

            for (int i = 0; i <words.length ; i++) {
                for (int j = 0; j < words[i].length(); j++) {
                    str += words[i].charAt(j);
                }
                str += " ";
            }
//            str = "This is an example of text justification.";

            for (int i = 0; i <size ; i+=maxWidth) {
                if(i != 0 && str.matches("[a-z | A-Z]") && str.charAt(i+1) == 32  ){
//                    li.add(Arrays.toString(str.split(" ")));
                    if(!flag) {
                        i = (count * maxWidth);
                    }
                    for (int j = i; j >0 ; j++) {
                        flag = true;
                        temp += str.charAt(i);
                    }
                    li.add(temp);
                    count++;
                    temp="";
                    break;
                }else {
                    if(flag) {
                        i = (count * maxWidth);
                    }
                        for (int j = i; j > 0; j--) {
                            if (str.charAt(j) == 32) {
//                            li.add(Arrays.toString(str.split(" ")));
                                for (int k = 0; k < j; k++) {
                                    if(!flag){
                                        flag = true;
                                    }
                                    temp += str.charAt(k);
                                }
                                li.add(temp);
                                count++;
                                temp = "";
                                break;
                            }
                        }
                }
            }
            System.out.println(li);
        }
}
