import java.util.Arrays;

public class zero_should_be_last {
    public static void main(String[] args) {
        int[] a = {1,2,3,0,0,4,5,8,0,9,0};
        int last_value = 0;
        for (int i = a.length-1; i >=0 ; i--) {
            if(a[i] != 0 ) {
                last_value = a[i];
                break;
            }
        }
        for (int i = 0; i <a.length ; i++) {
            if(i != 0) {
                if (a[i] == last_value || a[i - 1] == last_value) {
                    break;
                }
            }
            if(i != 0) {
                if (a[i - 1] == 0) {
                    i--;
                }
            }
            if(a[i] == 0){
                for (int j = i; j <a.length-1 ; j++) {
                    a[j] = a[j+1];
                }
                a[a.length-1] = 0;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
