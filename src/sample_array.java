import java.util.Scanner;
public class sample_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int size = in.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements in an array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
            System.out.println(arr[i]);
//            System.out.println(Arrays.toString(arr));
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter which element you want to find");
            int found = in.nextInt();
            if(arr[i] == found){
                System.out.println("Founded");
            }else{
                System.out.println("Not found");
            }
        }
    }
}
