package threaddemo;

public class PriorityThread extends Thread{
    public PriorityThread(String name)
    {
        super(name);
    }
    public void run()
    {
        System.out.println("thread is running"+Thread.currentThread());
    }

    public static void main(String[] args) {
        PriorityThread t1=new PriorityThread("T1:");
        PriorityThread t2=new PriorityThread("T2:");
        PriorityThread t3=new PriorityThread("T3:");
        PriorityThread t4=new PriorityThread("T4:");
        t1.setPriority(Thread.MAX_PRIORITY);//10
        t2.setPriority(Thread.MIN_PRIORITY);//1
        t3.setPriority(Thread.NORM_PRIORITY);//5
        t4.setPriority(7);//
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
