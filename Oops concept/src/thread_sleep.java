public class thread_sleep extends Thread{
    public void run(){
        for (int i = 0; i <=5 ; i++) {
            try{
                Thread.sleep(1500);
            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
//        thread_sleep t = new thread_sleep();
//        t.start();
//        thread_sleep t1 = new thread_sleep();
//        t1.start();
//        thread_sleep t2 = new thread_sleep();
//        t2.start();

        thread_sleep t = new thread_sleep();
        thread_sleep t1 = new thread_sleep();
        thread_sleep t2 = new thread_sleep();
        t.start();
        try{
            t1.join();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        t1.start();

        try{
            t2.join();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        t2.start();
    }
}