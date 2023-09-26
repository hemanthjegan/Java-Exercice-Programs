import java.util.*;

public class class_students {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the student Roll number to get the details : ");
        int n = in.nextInt();
        if(n > 1 && n<=64){
            if(n<26){
                System.out.println("His roll number 120UCS0"+n +" He's From CSE department... ");
            }else {
                System.out.println("His roll number 120UCS0" +n +" She's From CSE department... ");
            }
        } else if (n >=65 && n <=100) {
            if(n > 75){
                System.out.println("His roll number 120UIT0"+n+" He's From IT department... ");
            }else{
                System.out.println("His roll number 120UCS0" +n + " She's From IT department... ");
            }
        }else {
            System.out.println("Inavali input !!");
        }
    }
}
