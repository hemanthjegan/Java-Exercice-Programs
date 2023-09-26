public class number_pattern {
    public static void main(String[] args) {
        pattern_1(7);
    }

    public static void pattern_1(int n){

        int count = 1, temp = 0, temp1 = 0;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                if(i%2 == 1){
                    System.out.print(count+" ");
                    count++;
                }else {
//                    for (int k = i+count-1; k >=i ; k--) {
//                        System.out.print(k+" ");
//                        count++;
//                    }
                    for (int k = 1; k <=i ; k++) {
                        temp1 = temp;
                        temp = count;
                        count = temp + i - 1;
                        System.out.print(count+" ");
                        temp--;
                    }
                    break;
                }
            }
            System.out.println();
        }
    }
}
