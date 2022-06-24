package OOPs.inheritance;
interface Person
{
    void display();
}
interface Bankk extends Person

{
    void getInterest();
}
interface Draw extends Person
{
    void drawing();
}
class Students implements Person,Bankk,Draw
{
    int id=101;String name="Suchandra Das";
    public void getInterest(){
        System.out.println("10% interest!");
    }
    public void display(){
        System.out.println("Id: "+this.id+" Name: "+this.name);}
    public void drawing()
    {
        System.out.println("Drawing images");
    }


}

public class InterfaceExample {
    public static void main(String[] args) {
        Students std=new Students();
        std.display();
        std.getInterest();
        std.drawing();
    }
}
