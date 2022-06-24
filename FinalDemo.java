package OOPs.inheritance;
class DemoFinal
{
    final int num;//define the value in the time of declaration
    final static int n;
    public DemoFinal()
    {

        num=10;
    }
    static
    {
        n=30;
    }
    final void display()
    {
        System.out.println("final method can't override by subclass");
    }
}
class xyz extends DemoFinal
{

}

public class FinalDemo {
    public static void main(String[] args)
    {
        DemoFinal demofinal=new DemoFinal();//object creation
        xyz obj=new xyz();//object creation
        demofinal.display();


    }
}
