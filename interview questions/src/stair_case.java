public class stair_case {
    public static void main(String[] args) {
        int coin = 3;
//        int sum = 0, last_row = 0, count = 0, row = 0, last_element = 0;
//        int result = 0;
//        for (int i = 1; i <=coin ; i++) {
//            for (int j = 1; j <=i ; j++) {
//                count++;
//                if(count == coin){
//                    if(j == i){
//                        result = i;
//                    }else{
//                        row = i;
//                        result = row - 1;
//                    }
//                    break;
//                }
//            }
//        }
//        int difference = sum - coin;
//        if(coin == 1){
//            result = 1;
//        }
//        System.out.println(result);

        int count = 0, row = 0;
        boolean flag = false;
        for (int i = 1; i <=coin ; i++) {
            for (int j = 1; j <=i ; j++) {
                count++;
                if (count == coin && i == j || count == coin) {
                    row = i;
                    flag = true;
                    break;
                }else if(count == coin ){
                    row = i-1;
                    flag = true;
                    break;
                }
            }
            if(flag == true){
                break;
            }
        }
        System.out.println(row);
    }
}

//class Solution {
//    public int arrangeCoins(int n) {
//        int coin = n;
//        int sum = 0, last_row = 0, count = 0, row = 0, last_element = 0;
//        int result = 0;
//        for (int i = 1; i <=coin ; i++) {
//            sum += i;
//            if(sum == coin || sum >= coin){
//                last_element = i;
//                break;
//            }
//        }
//        for (int i = 1; i <=last_element ; i++) {
//            for (int j = 1; j <=i ; j++) {
//                count++;
//                if(count == coin){
//                    if(j == i){
//                        result = i;
//                    }else{
//                        row = i;
//                        result = row - 1;
//                    }
//
//                    break;
//                }
//            }
//        }
//
//        int difference = sum - coin;
//        if(coin == 1){
//            result = 1;
//        }
//
//        return result;
//    }
//}
