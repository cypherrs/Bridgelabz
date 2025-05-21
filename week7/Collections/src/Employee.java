import java.util.*;

public class Employee {
    String name;
    String department;
    Employee(String name,String department){
        this.name=name;
        this.department=department;
    }
    public String getDepartment() {
        return department;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return name;
    }
}
class out{
    public static void main(String[] args){
        List<Employee> employee= Arrays.asList(
                new Employee("Bob","IT"),
                new Employee("John","HR"),
                new Employee("joke","IT"),
                new Employee("Jack","HR"));
        Map<String,List<Employee>> groupdept=new HashMap<>();
        for(Employee emp: employee){
            groupdept.computeIfAbsent(emp.getDepartment(),k ->new ArrayList<>()).add(emp);
        }
        for(Map.Entry<String,List<Employee>> entry:groupdept.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
    }
}
