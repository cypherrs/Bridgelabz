import java.util.ArrayList;
import java.util.List;

class Employee{
    private String employeeName;
    private String empID;

    public Employee(String employeeName,String empID) {
        this.employeeName=employeeName;
        this.empID=empID;
    }

    public String getEmpID() {
        return empID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void displayEmpDetails(){
        System.out.println("Employee name: "+employeeName+" and Id : "+empID);
    }

}

class Department{
    private String deptName;
    private List<Employee> employeeList;

    public Department(String deptName){
        this.deptName=deptName;
        this.employeeList= new ArrayList<>();
    }

    public String getDeptName() {
        return deptName;
    }

    public void addEmployee(String name,String id){
        employeeList.add(new Employee(name,id));
    }

    public void showEmployees(){
        System.out.println("Department: "+deptName);
        for(Employee emp : employeeList){
            System.out.println("-"+ emp.getEmployeeName()+" (ID: "+emp.getEmpID()+" )");
        }
    }

    public void clearEmployees(){
        employeeList.clear();
    }

}

class Company{
    private String companyName;
    private List<Department> departments;

    public Company(String companyName){
        this.companyName=companyName;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department){
        departments.add(department);
    }

    public void showDepartmentDetail(){
        System.out.println("Company : "+companyName+ " has the following department: ");
        for (Department dept : departments){
            dept.showEmployees();
        }
    }

    public void deleteCompany(){
        for (Department dept : departments){
            dept.clearEmployees();
        }
        departments.clear();
        System.out.println("Company "+companyName+" and all its deparments and employees have been deleted.");
    }



}


public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, World!");
        Company myCompany = new Company("TechVerse Inc.");

        Department devDept = new Department("Development");
        Department hrDept = new Department("Human Resources");

        devDept.addEmployee("Rup", "E001");
        devDept.addEmployee("Naman", "E002");

        hrDept.addEmployee("Arpit", "E003");

        myCompany.addDepartment(devDept);
        myCompany.addDepartment(hrDept);

        myCompany.showDepartmentDetail();

        System.out.println("------------------");
        System.out.println("  ");

        // Now delete the company — all departments and employees should go too
        myCompany.deleteCompany();

        // Try showing departments again (will show nothing)
        myCompany.showDepartmentDetail();
    }
}