package thread.interrupt;

public class InterruptibleClass implements Runnable {
    private boolean loop = false;
    private String name;

    public void setLoop(boolean loop) {
        this.loop = loop;
        Trigger.setTrigger(getName(), loop);
    }

    String getName() {
        return this.name;
    }

    public void run(){
        long startedTime = System.currentTimeMillis();
        long count = 1;
        while(loop) {
            loop = Trigger.checkTrigger(getName());
            /*try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
            System.out.println(name);*/
            if (count != 1000000000) {
                count ++;
                continue;
            }
            count = 0;
            //System.out.println(Thread.currentThread().getName()+" loop count : "+count);
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

            if (Thread.interrupted()) {
                System.out.println(getName()+" interrupted");
            }
        }
        System.out.println(getName()+" looped for : "+(System.currentTimeMillis()-startedTime));
    }

    public void setName(String s) {
        this.name = s;
    }
}
