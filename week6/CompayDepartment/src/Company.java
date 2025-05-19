import java.util.ArrayList;
import java.util.List;

class Company {
    private String companyName;
    private List<Department> departments;

    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void showDepartmentDetail() {
        System.out.println("Company : " + companyName + " has the following department: ");
        for (Department dept : departments) {
            dept.showEmployees();
        }
    }

    public void deleteCompany() {
        for (Department dept : departments) {
            dept.clearEmployees();
        }
        departments.clear();
        System.out.println("Company " + companyName + " and all its deparments and employees have been deleted.");
    }


}
