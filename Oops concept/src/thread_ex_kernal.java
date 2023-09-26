public class thread_ex_kernal extends Thread {        //kernal...
    public void run(){
        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) {
        thread_ex_kernal t = new thread_ex_kernal();
        t.start();
        thread_ex_kernal t1 = new thread_ex_kernal();
        t1.start();
        t.yield();
        t1.yield();
        try{
            System.out.println(Thread.currentThread().getName()+" its in main method");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
