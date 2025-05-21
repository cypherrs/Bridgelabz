import java.util.*;
abstract class JobRole{
    private String applicationName;

    public JobRole(String name){
        this.applicationName=name;
    }
    public String getApplicationName(){
        return applicationName;
    }
}
class SoftwareEngineer extends JobRole{
    public SoftwareEngineer(String name){
        super(name);
    }
}
class DataScientist extends JobRole{
    public DataScientist(String name){
        super(name);
    }
}
class ProductManager extends JobRole{
    public ProductManager(String name){
        super(name);
    }
}
class Resume<T extends JobRole>{
    private T candidate;
    public Resume(T candidate){
        this.candidate=candidate;
    }
    public T getCandidate(){
        return candidate;
    }
}
class ResumeScreening{
    public static void processResume(List<? extends JobRole> candidates){
        for(JobRole candidate: candidates){
            System.out.println("Processing Resume of: "+candidate.getApplicationName());
        }
    }
}
public class ResumeSystem {
    public static void main(String[] args){
        List<JobRole> applications=new ArrayList<>();
        applications.add(new SoftwareEngineer("boby"));
        applications.add(new SoftwareEngineer("viky"));
        applications.add(new DataScientist("John"));
        applications.add(new ProductManager("Alice"));
        ResumeScreening.processResume(applications);
    }
}
