public class sum_highest_product {
    public static void main(String[] args) {

        product(7);
    }

    public static void product(int n) {
        int val1, val2, sum1 =0, sum2 =0;
        int count1 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
//                while(i<2 || j<2){
//                     if(i<2){
//                         val1 = i/2;
//                         for (int k = 1; k <=val1; k++) {
//                              count1+=2;
//                                     sum1 = sum1*10 + count1;
//                         }
//
//                     }
                int val = i + j;
                if (val == n) {
                    System.out.println(i + "  " + j);
                    //}

                }
            }

            }
        }
    }
