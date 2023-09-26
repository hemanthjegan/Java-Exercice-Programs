class Student {
    String name;
    int age;
    String course;
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}
public class StudentInfo {
    public static void main(String[] args) {
        Student ob1 = new Student();
        Student ob2 = new Student();

        ob1.name = "Raja";
        ob1.age = 20;
        ob1.course = "Computer Science";
        
        ob2.name = "Ramu";
        ob2.age = 21;
        ob2.course = "Mathematics";
        
        ob1.displayInfo();
        System.out.println(); 
        ob2.displayInfo();
    }
}
