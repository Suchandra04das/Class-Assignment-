package OOPs;
//java bean
class Employee{
    //achieved encapsulation
    private int empId;//instance variable
    private String empName;//instance variable
    private String designation;//instance variable
    //initializing data members
    public Employee(int empId,String empName,String designation)
    { this.empId=empId;
       this.empName= empName;
        this.designation=designation;
        System.out.println("this: "+this);
    }
    //Setter and Getter

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}

public class ThisAndStaticDemo {
    public static void main(String[] args) {
        Employee emp1=new Employee(101,"suchandra","software engineer");
        Employee emp2=new Employee(121,"Mampi","software Engineer");
        System.out.println("Emplyee Id:" +emp1.getEmpId());
        System.out.println("Employee Name:" +emp1.getEmpName());
        System.out.println("Employee Designation:" +emp1.getDesignation());
        System.out.println("Emplyee Id:" +emp2.getEmpId());
        System.out.println("Employee Name:" +emp2.getEmpName());
        System.out.println("Employee Designation:" +emp2.getDesignation());

    }
}
