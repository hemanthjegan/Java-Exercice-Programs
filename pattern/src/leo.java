public class leo {
    public static void main(String[] args) {
        pattern(5);
//        pattern_2(5);
//        pattern_3(5);
//        pattern_5(5);
    }
      static void pattern(int n){  // L
          for(int i=1; i<=n; i++){
              for(int j=1; j<=n; j++){
                  if(j == 1 || i == n ){
                      System.out.print("* ");
                  }else{
                      System.out.print("  ");
                  }
              }
              for (int j = 1; j <=2 ; j++) {
                  System.out.print(" ");
              }
              for (int j = 1; j <=n ; j++) {
                  if(i == 1 || i == n || j == 1 || (n/2)+1 == i){
                      System.out.print("* ");
                  }else {
                      System.out.print("  ");
                  }
              }
              for (int j = 1; j <=2 ; j++) {
                  System.out.print("  ");
              }
              for(int j=1; j<=n; j++){
                if(i == 1 || i == n || j == 1 || j == n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
              System.out.println();
          }
    }

//    static void pattern_2(int n){  // E
//        for (int i = 1; i <=1 ; i++) {
//            for (int j = 1; j <=n ; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for (int i = 1; i <=n-2 ; i++) {
//            for (int j = 1; j <=1 ; j++) {
//                System.out.print("* ");
//            }
//            System.out.println(" ");
//        }
//        for (int i = 1; i <=1 ; i++) {
//            for (int j = 1; j <=n ; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//    }
//
//    static void pattern_3(int n){  // O
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=n; j++){
//                if(i == 1 || i == n || j == 1 || j == n){
//                    System.out.print("* ");
//                }else{
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//    }

}
