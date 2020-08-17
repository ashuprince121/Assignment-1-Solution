//Que 3
import java.util.*;
public  class Employee{
    int empId, empSal;
    String empName, empDes, empLocation;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getEmpSalary() {
        return empSal;
    }

    public void setEmpSalary(int empSal) {
        this.empSal = empSal;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpDes() {
        return empDes;
    }

    public void setEmpDes(String empDes) {
        this.empDes = empDes;
    }

    public String getEmpLoc() {
        return empLocation;
    }

    public void setEmpLoc(String empLocation) {
        this.empLocation = empLocation;
    }


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        ArrayList<Employee> l = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            System.out.println(String.format("Employee No : %s", i + 1));
            Employee e = new Employee();
            e.setEmpId(inp.nextInt());
            e.setEmpName(inp.nextLine());
            e.setEmpSalary(inp.nextInt());
            e.setEmpDes(inp.nextLine());
            e.setEmpLoc(inp.nextLine());
        }
        System.out.println("employee Names");
        l.stream().forEach(i -> {
            System.out.println(i.getEmpName());
        });
        System.out.println(" salaries greater than 50 k");
        l.stream().filter(i -> i.getEmpSalary() > 50000).forEach(i -> {
            System.out.println(String.format("Name : %s , Salary : %s", i.getEmpName(), i.getEmpSalary()));
        });
        System.out.println("locations starting with M");
        l.stream().filter(i -> i.getEmpLoc().startsWith("M")).forEach(i -> {
            System.out.println(String.format("Name : %s , Location : %s", i.getEmpName(), i.getEmpLoc()));

        });
        System.out.println("All designations stating with E");
        l.stream().filter(i -> i.getEmpDes().endsWith("E")).forEach(i -> {
            System.out.println(String.format("Name : %s , Designation : %s", i.getEmpName(), i.getEmpDes()));

        });
    }}