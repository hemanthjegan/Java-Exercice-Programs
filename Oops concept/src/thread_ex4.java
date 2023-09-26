public class thread_ex4 extends Thread{         // interruption
    public void run(){
        for (int i = 0; i <=10 ; i++) {
            try{
                Thread.sleep(100);
            }catch(Exception e){
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        thread_ex4 t = new thread_ex4();
        t.start();
        t.interrupt();
    }
}
