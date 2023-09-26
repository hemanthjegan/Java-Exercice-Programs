public class odd_even_segreegasion {
    public static void main(String[] args) {
        int a[] = {5, 8,7, 3, 9, 1, 4};
        int temp = 0;
        for(int i =0; i<a.length; i++){
            if(a[i]%2 == 0){
                temp = a[i];
                for(int l =0; l<a.length-1; l++){
//                    for(int j =a.length-1; j>=i; j--){
//                        a[j] = a[j-1];
//                    }
                    for (int j = i; j <a.length-1 ; j++) {
                        a[j] = a[j+1];
                    }
                    a[a.length-1] = temp;
                    break;
                }
            } System.out.print(a[i]+" ");
        }
    }
}
