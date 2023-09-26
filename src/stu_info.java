import java.util.*;
public class stu_info {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[] = new int[100];
        for (int i =1 ; i <a.length; i++) {
            a[i] = i;
                }
        System.out.println("Enter the Roll no from 1 to 100 : ");
        for (int i = 0; i <a.length ; i++) {
            int roll = in.nextInt();
            if(roll < a[50]){
                if(roll <a[26]){
                    System.out.println("Girls from CSE");
                }else{
                    System.out.println("Boys from CSE");
                }
        }
            }
        }
}
