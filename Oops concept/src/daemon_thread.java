public class daemon_thread extends Thread{
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("Daemon thread is running");
        }else{
            System.out.println("User thresd is running");
        }
    }

    public static void main(String[] args) {
        daemon_thread d = new daemon_thread();
        d.setDaemon(true);   // if we cannot start the user thread will running....
        daemon_thread d1 = new daemon_thread();
        d1.setDaemon(true);
        d1.start();
        daemon_thread d2 = new daemon_thread();
        d2.setDaemon(false);
        d2.start();
    }
}
