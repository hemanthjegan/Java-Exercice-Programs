//public class largest_no_arr {
//    public static void main(String[] args) {
//        int temp;
//        int arr[] = {11,15,12,14,16};
//        for (int i = 0; i <arr.length ; i++) {
//            for (int j = i+1; j <arr.length ; j++) {
//                if(arr[i]<arr[j]){
//                    temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j]= temp;
//                }
//            }
//        }
//        System.out.println("Maximum element in an array : "+arr[0]);
//    }
//}


public class largest_no_arr {
    public static void main(String[] args) {
        int max = 0, duplicate=0;
        int arr[] = {83, 27, 68, 35, 86, 12, 9,46,27,9, 46, 93, 03, 64};
        for (int i = 0; i < arr.length; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }
        }
        System.out.println("The Maximum element in an array : " +max);
    }
}