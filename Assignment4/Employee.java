
public class Employee {
    String name;
    int empId;
    float salary;
    
    public void acceptDetails(String name,int id,float sal){
        this.name = name;
        this.empId = id;
        this.salary = sal;
    }
    public void printDetails() {
    	 System.out.printf(" Name: %s   EmpId:  %d   Salary: %.2f\n",this.name,this.empId,this.salary);
    	
    }

    public void printDetails(String name,int id){
        this.name = name;
        this.empId = id;
        System.out.printf(" Name: %s   EmpId:  %d\n",this.name,this.empId);
    }

    public void printDetails(int id,String name){
        this.empId = id;
        this.name = name;
        System.out.printf(" EmpId: %d   Name:  %s\n",this.empId,this.name);
    }

    public void printDetails(String name,int id,float sal){
        this.name = name;
        this.empId = id;
        this.salary = sal;
        System.out.printf(" Name: %s   EmpId:  %d   Salary: %.2f\n",this.name,this.empId,this.salary);
    }
    public static void main(String[] args) {
        Employee emp = new Employee();
       /*  emp.name = "Aviraj";
        emp.empId = 100;
        emp.salary = 1000.45f;
       // System.out.printf(" Name: %s   EmpId:  %d   Salary: %f",emp.name,emp.empId,emp.salary);
       */
        emp.acceptDetails("Urvisha", 100, 20000f);
        emp.printDetails();
        emp.printDetails("Aviraj",101,500020f);
        emp.printDetails(101,"Urvisha");
    }
    
}

