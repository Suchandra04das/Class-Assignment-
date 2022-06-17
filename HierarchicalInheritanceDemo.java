package OOPs.inheritance;
class Bank
{
    public void getLoanInterest()
    {
        System.out.println("Interest rate is 8%");
    }
}//end class
//child 1
class SBI extends Bank
{
    public void accountCreated()
    {
        System.out.println("account created!!");
    }
    public void getLoanInterest()
    {
        System.out.println("simple interest rate is 10%");
    }
}//end child 1
//child 2
class Axis extends Bank
{
    public void accountCreated()
    {
        System.out.println("account created!!");
    }
    public void getLoanInterest()
    {
        System.out.println("simple interest rate is 6%");
    }
}
class HDFC extends Bank
{
        public void accountCreated()
    {
        System.out.println("account created!!");
    }

    //over riding
    public void getLoanInterest()
    {
        System.out.println("simple interest rate is 5.5%");
    }
}
public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
       /* Axis axis=new Axis();
        HDFC hdfc=new HDFC();
        axis.getLoanInterest();
        hdfc.getLoanInterest();*/
        Bank bank;//parent reference
        bank=new HDFC();//child object
        bank.getLoanInterest();//invoke parent reference
        bank=new Axis();//child object
        bank.getLoanInterest();//invoke parent reference
        bank=new SBI();//child object
        bank.getLoanInterest();//invoke parent reference
    }
}
