public class missing_numbers_0_to_9 {
    public static void main(String[] args) {
        int a[] = {4,67,3,8,7,2,3,23,78,45,23};
        int max = 0;
        for (int i = 0; i <a.length ; i++) {
            if(max < a[i]) {
                max = a[i];
            }
        } System.out.println(max);

        int min = max;
        for (int i = 0; i <a.length ; i++) {
            if(min > a[i]) {
                min = a[i];
            }
        } System.out.println(min);
    }
}