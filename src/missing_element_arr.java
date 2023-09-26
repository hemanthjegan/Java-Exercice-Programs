import java.util.Arrays;
public class missing_element_arr {
    public static void main(String[] args) {
        int temp;
        int arr[] = {11,15,12,14,16};
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]= temp;
                }
            }
//            System.out.println(Arrays.toString(arr));
        }
        System.out.println("Ascending order : "+ Arrays.toString(arr));
        for (int i = 0; i <arr.length ; i++) {
            int diff = arr[i]-arr[i+1];
            if(diff == 1){
                continue;
            }else{
                int result = arr[i+1]+1;
                System.out.println("Missing element in the given array is : "+result);
                break;
            }
        }
    }
}