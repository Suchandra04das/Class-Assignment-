package threaddemo;

public class DeadlockCondition {
    public static void main(String[] args) {
        final String resource1="pen";
        final String resource2="paper";
        //thread1:Mona tries to lock resource 1 then resource 2
        Thread Mona=new Thread(){
            public void run()
            {
                synchronized (resource1){
                    System.out.println("Mona locked resource1: pen ");
                    try{
                        Thread.sleep(100);
                    }catch (Exception e){}
                    synchronized (resource2){
                        System.out.println("Mona tries to lock resource2: paper");
                    }
                }
            }
        };
        //thread1:mampi tries to lock resource 1 then resource 2
        Thread Mampi=new Thread(){
            public void run()
            {
                synchronized (resource1){
                    System.out.println("Mampi locked resource1: paper");
                    try{
                        Thread.sleep(100);
                    }catch (Exception e){}
                    synchronized (resource2){
                        System.out.println("Mampi tries to lock resource2: pen");
                    }
                }
            }
        };
        Mona.start();
        Mampi.start();


    }
}
