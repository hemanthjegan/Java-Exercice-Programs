public class word_reverse {
    public static void main(String[] args) {
        String s = "kabali is back";
        String a[] = s.split(" ");
        for (int i = a.length-1; i >=0 ; i--) {
            System.out.print(a[i]+" ");
        }
    }
}
