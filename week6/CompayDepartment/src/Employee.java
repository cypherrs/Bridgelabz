class Employee {
    private String employeeName;
    private String empID;

    public Employee(String employeeName, String empID) {
        this.employeeName = employeeName;
        this.empID = empID;
    }

    public String getEmpID() {
        return empID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void displayEmpDetails() {
        System.out.println("Employee name: " + employeeName + " and Id : " + empID);
    }

}
