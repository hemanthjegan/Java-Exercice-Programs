public class box_pattern_with_numbers {
    public static void main(String[] args) {
        int r = 4;
        int sum = 0;
        for (int i = 1; i <=r ; i++) {
            sum +=2;
        }
        int n = sum-1;
        for (int i = 1; i <= n; i++) {
//            int temp = 1;
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print(r+" ");    // 3
                }else if(i == 2 || i == n-1 || j == 2 || j == n-1) {
                    System.out.print(r-1+" ");
//                }else if(i == 3 || i == n-2 || j == 3 || j == n-2){
//                        System.out.print(n-5+" " );
                }else {
                    for (int k = 3; k <=n ; k++) {
                        if(i == k || i == n-(k-1) || j == k || j == n-(k-1)) {
                            System.out.print(n-(r+k)+2+" ");     // n-(k+4)
                            break;
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}
