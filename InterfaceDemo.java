package OOPs.inheritance;
//interface
interface Demo
{
    //by default public,static and final
    int x=10;
    void fun();
    void rain();

}
class child implements Demo
{
    //override
    public void fun()
    {
        System.out.println("enjoying!!");
    }
    public void rain()
    {
        System.out.println("it's raining!!");
    }
}
class sub implements Demo
{
    //override
    public void fun()
    {
        System.out.println("enjoying sub!!");
    }
    public void rain()
    {
        System.out.println("it's raining sub class!!");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        child c1=new child();
        c1.fun();
        c1.rain();
        //upcasting-you can create reference variable of type interface, but can't instantiate
        Demo demo=new sub();
        demo.fun();
        demo.rain();
    }
}
