//public class find_block_of_water_free {
//    public static void main(String[] args) {
//        int a[] = {3,0,2,0,4};
//        boolean flag;
//        int max = a[0],  diff;
////        boolean flag = true;
//        for (int i = 0; i < a.length ; i++) {
//            if(a[i] == 0) {
//                continue;
//            }
//            if(max > a[i]){
//                max = a[i];
//                System.out.println(max);
//            }
//        }
//        for (int i = 0; i <a.length ; i++) {
//        }
//    }
//}

import java.util.Arrays;

public class find_block_of_water_free {
    public static void main(String[] args) {
        int a[] = {3,0,4,2,0,4};
//        boolean flag;
        int temp, diff, max=0, sum = 0;
        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j <a.length ; j++) {
                if(a[i]>a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
//                if(a[i] == 0) {
//                    continue;
//                }
            }
        }
        for (int i = 0; i <a.length; i++) {
            if(a[1] == a[i]){
                max = a[1+1];
                break;
             }else{
             max = a[1];
             break;
            }
        }

        System.out.println(Arrays.toString(a));
        System.out.println("Second largest number in the given array : "+a[1]);
        for (int i = 0; i < a.length ; i++) {
            diff = max - a[i];
            if(diff >0) {
                sum += diff;
            }
        }
        System.out.println("Number of empty blocks that can be filled with waterBlocks : "+sum);
    }
}