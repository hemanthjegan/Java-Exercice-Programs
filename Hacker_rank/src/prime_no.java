public class prime_no {
    public static void main(String[] args) {          // split the given number and print the single prime numbers
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
        int n = 123456789;
        int d =0, temp = 0, rem =0;
           while(n>0){
                d = n%10;
                n = n/10;
                if(d == 1){
                    continue;
                }
               if(d%2 !=0 || d == 2){
                   if(d !=9 ) {
                       temp = (temp*10)+d;
//                       System.out.print(temp + " ");
                   }
               }
           }
        while(temp>0){
            rem = temp%10;
            temp = temp/10;
            System.out.print(rem+" ");
        }
//        System.out.println(temp);
    }
}
