public class thread_ex3 extends Thread{
    public void run(){
        try{
            Thread.sleep(1000);
            System.out.println("Thread");
        }catch(InterruptedException e){
            throw new RuntimeException("hi thread is interrupted ");
        }
    }
    public static void main(String[] args) {
        thread_ex3 t = new thread_ex3();
        t.start();
        try{
            t.interrupt();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
