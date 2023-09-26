public class find_common_ele_between_two_arr {
    public static void main(String[] args) {
        int a[] = {7,38,34,15,8,32,23,44,24,65};
        int b[] = {35,89,76,4,32,38,7,44,45};
        for (int i = 0; i <a.length ; i++) {
            for (int j = i+1; j <b.length ; j++) {
                if(a[i] == b[j]){
                    System.out.print(a[i]+", ");
                }
            }
        }
    }
}
