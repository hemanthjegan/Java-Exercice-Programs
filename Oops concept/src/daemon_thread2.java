public class daemon_thread2 extends Thread {
        public void run(){
            System.out.println("I am killing daemon : "+Thread.currentThread().isDaemon()); // jvm is killing daemon....
            System.out.println("User thread : "+Thread.currentThread().getName());
        }
    public static void main(String[] args) {
        daemon_thread2 d = new daemon_thread2();
        daemon_thread2 d1 = new daemon_thread2();
        daemon_thread2 d2 = new daemon_thread2();
        d.setDaemon(true);
//        d.start();
        d1.start();
//        d2.start();
    }

}
