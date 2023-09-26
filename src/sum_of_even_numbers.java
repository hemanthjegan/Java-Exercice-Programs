//public class sum_of_even_numbers {
////    public void even(){
////
////    }
//    public static void main(String[] args) {
//        int n = 10, sum =0;
//        for (int i = 0; i <=n ; i++) {
//            if(i%2==0){
//                sum = sum+i;
//            }
//        }
//        System.out.println(sum);
//    }
//}


public class sum_of_even_numbers {
    //    public void even(){
//
//    }
    public static void main(String[] args) {
        int n = 10, sum =0;
        for (int i = 0; i <=n ; i+=2) {
                sum = sum+i;
        }
        System.out.println(sum);
    }
}
