import java.util.*;

public class unique_element_count {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //HashSet a = new HashSet<>();
        TreeSet a = new TreeSet();
        int n = in.nextInt();
        for (int i = 0; i <n ; i++) {
            int val = in.nextInt();
            a.add(val);
        }
        System.out.print(a+" ");

        int count=0;
        for (int i = 0; i <a.size() ; i++) {
            count++;
        }
        System.out.println();
        System.out.println("Length of the given element : "+count);
    }
}


//public class unique_element_count {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        //HashSet a = new HashSet<>();
//        TreeSet a = new TreeSet();
//        int n = in.nextInt();
//        int arr[] = new int[n];
//        for (int i = 0; i < arr.length ; i++) {
//            arr[i] = in.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i <n ; i++) {
//            int val = arr[i];
//            a.add(val);
//        }
//        System.out.print(a+" ");
//        for (int i = 0; i <arr.length ; i++) {
//            for (int j = i+1; j <a.size() ; j++) {
//                for(Object s : a){
//                }
//            }
//        }
//    }
//}


//public class unique_element_count {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        //HashSet a = new HashSet<>();
//        //TreeSet a = new TreeSet();
//        ArrayList <Integer> a = new ArrayList<>();
//        int n = in.nextInt();
//        for (int i = 0; i <n ; i++) {
//            int val = in.nextInt();
//            a.add(val);
//        }
//        TreeSet<Integer> b = new TreeSet<>();
//        b.addAll(a);
//        for(int i : b){
//            int count =0;
//            for(int j : a){
//                if(i == j){
//                    count++;
//                }
//            }if(count == 1) {
//                System.out.print("Unique elements are :"+i +" ");
//            }else{
//                System.out.println("There is no unoque elemnts : -1");
//                break;
//            }
//        }
//    }
//}
