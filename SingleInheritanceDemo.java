package OOPs.inheritance;
//super/parent/base class
class User{
    public int id;
    public String name;
    public String address;
    public long phno;
   public User(int id,String name,String address,long phno)//create constructor
   {
       super();
       this.id=id;
       this.name=name;
       this.address=address;
       this.phno=phno;
   }
     public void setData(int id,String name,String address,long phno)
     {
         this.id=id;
         this.name=name;
         this.address=address;
         this.phno=phno;
     }
     public void getData()
     {
         System.out.println("Id: "+this.id);
         System.out.println("Name: "+this.name);
         System.out.println("Address: "+this.address);
         System.out.println("Phone No: "+this.phno);
     }
    }
    //sub/child/derived class
class Student extends User
    {
        //own features
        public int rollno;
        public double marks;
        public Student(int id,String name,String address,long phno,int rollno,double marks){
            super(id,name,address,phno);//invoke parent class constructor
            this.rollno=rollno;
            this.marks=marks;
        }
        void display()
        {
            System.out.println("child class");
        }
        public void getData()
        {
            super.getData();
            System.out.println("roll no: "+this.rollno);
            System.out.println("marks: "+this.marks);
        }
    }
public class SingleInheritanceDemo {
    public static void main(String[] args) {
       Student student1 = new Student(101, "suchandra", "sealdah", 85854212,05,55);//object creation
       student1.getData();//invoke method

    }}
