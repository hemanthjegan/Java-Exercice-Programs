public class leave_some_numbers {
    public static void main(String[] args) {
        int n = 30;
        int ini = 1;
        int temp = 3;
//        for (int i = 1; i <n ; i++) {
//            int val = i;
//            for (int j = 1; j <n ; j++) {
//                if(j+temp == val){
//                    temp +=2;
//                    continue;
//                }
//            }
//
//            System.out.print(i+" ");
//        }

        for (int i = 1; i <= n; i++) {
            if(ini - i == temp){
                int new1 = temp +=2;
                ini = temp;
                continue;
            }
            System.out.print(i+" ");
        }
    }
}
