public class thread_ex5 extends Thread {
    public void   run(){
        for (int i = 0; i <=3; i++) {
            if (Thread.interrupted()){
                System.out.println("Interrupted programming code will run..");
            }else{
                System.out.println("Normal programming code will run");
            }
        }
    }

    public static void main(String[] args) {
        thread_ex5 t = new thread_ex5();
        thread_ex5 t1 = new thread_ex5();
        t.start();
        t.interrupt();
        t1.start();
        t1.interrupt();
    }
}
