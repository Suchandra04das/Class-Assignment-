package OOPs.polymorphism;
class Helper
{
    public void addition(int a)
    {
        System.out.println("addition of one parameter: "+ (10+a));
    }
    public void addition(int a,int b)
    {
        System.out.println("addition of two int parameter: "+ (a+b));
    }
    public void addition(int a,float b)
    {
        System.out.println("addition of int,float parameter: "+ (a+b));
    }
    public void addition(float a)
    {
        System.out.println("addition of float parameter: "+ (20+a));
    }

}

public class MethodOverloadingDemo {
    public static void main(String[] args) {
        Helper helper=new Helper();
        helper.addition(5);
        helper.addition(5,10);
        helper.addition(5,15.1f);
        helper.addition(5.10f);
    }
}
