import java.util.*;


public class insert_element {
    public static void main(String[] args) {
        int a[] = {0,1,2,3,4,6,7,8};
        int index = 6;
        int value = 5;
//        for (int i = 0; i <arr.length ; i++) {
//            if(i == index){
//                arr[] = arr[]
//            }
//        }
        for (int i = 0; i <=a.length ; i++) {
            if( i == index-1){
                for (int j = i; j <a.length-1 ; j++) {
                    a[j+1] = a[j];
                }
                a[i] = value;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
