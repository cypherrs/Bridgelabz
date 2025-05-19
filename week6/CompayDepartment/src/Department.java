import java.util.ArrayList;
import java.util.List;

class Department {
    private String deptName;
    private List<Employee> employeeList;

    public Department(String deptName) {
        this.deptName = deptName;
        this.employeeList = new ArrayList<>();
    }

    public String getDeptName() {
        return deptName;
    }

    public void addEmployee(String name, String id) {
        employeeList.add(new Employee(name, id));
    }

    public void showEmployees() {
        System.out.println("Department: " + deptName);
        for (Employee emp : employeeList) {
            System.out.println("-" + emp.getEmployeeName() + " (ID: " + emp.getEmpID() + " )");
        }
    }

    public void clearEmployees() {
        employeeList.clear();
    }

}
