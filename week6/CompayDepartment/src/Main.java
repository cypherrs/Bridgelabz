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