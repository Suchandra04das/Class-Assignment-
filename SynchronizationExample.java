package threaddemo;
//shared resource
class productTable {
    public synchronized static void printProductOfNum(int n) {
        System.out.println("inside this method");
      //  synchronized (this) {
            for (int i = 1; i <= 5; i++) {
                System.out.println(n * i);
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }//end of catch
            }//end of for
       // }//end of synchronized block
        System.out.println("end of method");
    }
}
//1st thread
/*class Thread1 extends Thread
{
     productTable pt;
     public Thread1(productTable pt)
     {
         this.pt=pt;
     }
     public void run()
     {
         pt.printProductOfNum(5);
     }
}
//2nd thread
class Thread2 extends Thread {
    productTable pt;

    public Thread2(productTable pt) {
        this.pt = pt;
    }

    public void run() {
        pt.printProductOfNum(100);
    }
}*/

public class SynchronizationExample {
    public static void main(String[] args) {
        productTable pt=new productTable();
        Thread t1=new Thread()
        {
            public void run()
            {
                pt.printProductOfNum(5);
            }
        };
        Thread t2=new Thread()
        {
            public void run()
            {
                pt.printProductOfNum(1000);
            }

        };
        Thread t3=new Thread()
        {
            public void run()
            {
                pt.printProductOfNum(100);
            }

        };
        Thread t4=new Thread()
        {
            public void run()
            {
                pt.printProductOfNum(1);
            }

        };
        t1.start();
        t2.start();
        t3.start();
        t4.start();



        }
}
