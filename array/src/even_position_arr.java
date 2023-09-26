public class even_position_arr {
    public static void main(String[] args) {
        int a[] = {34, 5, 7, 24, 65, 12, 2, 24, 98};
        for (int i = 0; i <a.length ; i++) {
            if(i%2==1){
                continue;
            }else{
                System.out.println("The index position of a["+i+"] is : "+a[i]);
            }
        }
    }
}
