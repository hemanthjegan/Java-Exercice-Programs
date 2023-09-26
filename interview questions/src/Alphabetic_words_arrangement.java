public class Alphabetic_words_arrangement {
    public static void main(String[] args) {
        String str = "my name is hemanthraj jeganathan";
        String a[] = str.split(" ");
        String temp = " ";
        String result =" ";
        for (int i = 0; i <a.length ; i++) {
            for (int j = i+1; j <a.length ; j++) {
                if(a[i].charAt(0) > a[j].charAt(0)){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            result += a[i]+" ";
        }
        System.out.println(result);
    }
}
