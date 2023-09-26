//import java.util.*;
//
//class employ {
//    String name;
//    int age, experience, salary;
//
//    employ(String a) {
//        name = a;
//        System.out.println("The employee name is : "+name);
//    }
//
//    void attributes(int b, int c, int d) {
//        age = b;
//        experience = c;
//        salary = d;
//        System.out.println("The employee age is "+age);
//        System.out.println("The employee has "+experience+" years experience ");
//        System.out.println("The salary per annum : "+salary);
//    }
//}
//
//public class employee_details {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter how many employee profile you want to create : ");
//        int n = in.nextInt();
//        for (int i = 1; i <n ; i++) {
//            System.out.println("Enter the name of the employee : ");
//            String name = in.next();
//            employ e = new employ(name);
//            System.out.println("Enter the age of the employee : ");
//            int age = in.nextInt();
//            System.out.println("Enter how many experience the employee have : ");
//            int experience = in.nextInt();
//            System.out.println("Enter the salary per annum : ");
//            int salary = in.nextInt();
//            e.attributes(age, experience,salary);
//        }
//
//    }
//}


class employ {
    String name;
    int age, experience, salary;

    employ(String a) {
        name = a;
        System.out.println("The employee name is : "+name);
    }

    void attributes(int b, int c, int d) {
        age = b;
        experience = c;
        salary = d;
        System.out.println("The employee age is "+age);
        System.out.println("The employee has "+experience+" years experience ");
        System.out.println("The salary per annum : "+salary);
        System.out.println("-----------------------------------------------------------");
    }
}

public class employee_details {
    public static void main(String[] args) {
        employ e = new employ("Hemanthraj");
        e.attributes(25,4,845000);
        employ e1 = new employ("Raja");
        e1.attributes(24,2,545000);
        employ e2 = new employ("Rajesh");
        e2.attributes(26,4,645000);
        employ e3 = new employ("Tensing");
        e3.attributes(25,3,45000);
        employ e4 = new employ("Bharathi");
        e4.attributes(23,3,55000);

    }
}
