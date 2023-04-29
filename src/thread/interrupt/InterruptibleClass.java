package thread.interrupt;

public class InterruptibleClass extends Thread {
    private boolean loop = false;
    public void setLoop(boolean loop) {
        this.loop = loop;
    }
    public void run(){
        int count = 1;
        while(loop) {
            System.out.println(Thread.currentThread().getName()+" loop count : "+count++);
            /*try {
                if(this.getName().equals("Thread 1")){
                    Thread.sleep(1000);
                } else {
                    Thread.sleep(2000);
                }
            } catch (InterruptedException e) {
                System.out.println("\nException in "+Thread.currentThread().getName()+"\n");
                e.printStackTrace();
            }*/
        }
    }

}
