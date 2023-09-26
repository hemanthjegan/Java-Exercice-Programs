public class thread_ex extends Thread{    // thread is pre-defined
    public void run(){

        System.out.println("Thread is running...");
    }
    public static void main(String[] args) {
        thread_ex t1 = new thread_ex();
        t1.start();
    }
}


