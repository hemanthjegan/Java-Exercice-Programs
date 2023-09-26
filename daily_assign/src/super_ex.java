class student {
    void stu1(){
        System.out.println("I am a student from CSE depart i play well in Athlete...");
    }
    void stu2(){
        System.out.println("I am a student from IT depart i am not interested in sports");
    }
}
class sports_academy extends student{
    void disp(){
        System.out.println("Only interested person can join in sports academy : ");
        System.out.println("----------------------");
        super.stu1();
        super.stu2();
    }
}

public class super_ex {
    public static void main(String[] args) {
    sports_academy s = new sports_academy();
    s.disp();
    }
}
