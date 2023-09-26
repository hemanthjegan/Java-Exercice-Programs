public class thread_properties extends Thread {
    public static void main(String[] args) {
        thread_properties t = new thread_properties();
        thread_properties t1 = new thread_properties();
        System.out.println("The thread name is : "+t.getName());
        System.out.println("The thread name is : "+t1.getName());
        System.out.println("The thread Id is : "+t.getId());
        System.out.println("The thread prority is : "+t.getPriority());
        t.setName("Hemanth");
        System.out.println("After change the thread name is : "+t.getName());
    }
}
