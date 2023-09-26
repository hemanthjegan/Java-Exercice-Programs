public class pangrams {
    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";      // the string contains all the alphabet....ie, pangrams
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    System.out.print(arr[j]);
                    break;
                }
            }
        }
    }
}
