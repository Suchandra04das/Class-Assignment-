package OOPs.polymorphism;
class Employee
{
    int empId;
    String empName,empAdd;
    long phNo;
    double salary;
    String country,city;
    public Employee( int empId, String empName,String empAdd)
    { //parameterized constructor
        this.empId=empId;
        this.empName=empName;
        this.empAdd=empAdd;
    }
    public Employee(int empId, String empName,String empAdd,long phNo,double salary)
    { //parameterized constructor
        this(empId,empName,empAdd);
        this.phNo=phNo;
        this.salary=salary;
    }
    public Employee(int empId, String empName,String empAdd,long phNo,double salary,String city,String country)
    { //parameterized constructor
        this(empId,empName,empAdd,phNo,salary);
        this.city=city;
        this.country=country;
    }
//getter method
    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpAdd() {
        return empAdd;
    }

    public long getPhNo() {
        return phNo;
    }

    public double getSalary() {
        return salary;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }
}

public class ConstructorOverloadingDemo {
    public static void main(String[] args) {
        //object creation for constructor
        Employee employee1=new Employee(101,"Suchandra","Kolkata");
        System.out.println(employee1.getEmpId()+" "+employee1.getEmpName()+" "+employee1.getEmpAdd());
        Employee employee2=new Employee(102,"Chandana","Konnagar",525252,20000);
        System.out.println(employee2.getEmpId()+" "+employee2.getEmpName()+" "+employee2.getEmpAdd()+" "+employee2.getPhNo()+" "+employee2.getSalary());
        Employee employee3=new Employee(103,"Madhu","Uttarpara",858585,25000,"Hooghly","WestBengal");
        System.out.println(employee3.getEmpId()+" "+employee3.getEmpName()+" "+employee3.getEmpAdd()+" "+employee3.getPhNo()+" "+employee3.getSalary()+" "+employee3.getCity()+" "+employee3.getCountry());
    }//end of main method
}
