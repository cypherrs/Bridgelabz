import java.util.*;
abstract class CourseType {
    private String title;
    public CourseType(String title){
        this.title=title;
    }
    public String gettitle(){
        return title;
    }
}
class ExamCourse extends CourseType{
    public ExamCourse(String title){
        super(title);
    }
}
class AssignmentCourse extends CourseType{
    public AssignmentCourse(String title){
        super(title);
    }
}
class ResearchCourse extends CourseType{
    public ResearchCourse(String title){
        super(title);
    }
}
class Course<T extends CourseType>{
    private T coursetype;
    public Course(T coursetype){
        this.coursetype=coursetype;
    }
    public T getCoursetype() {
        return coursetype;
    }
}
class CourseUtils{
    public static void printCourse(List<? extends CourseType> courses){
        for(CourseType course:courses){
            System.out.println("Course: "+course.gettitle());
        }
    }
}
class UniversityCourse{
    public static void main(String[] args){
        List<CourseType> cousrelist=new ArrayList<>();
        cousrelist.add(new ExamCourse("Maths"));
        cousrelist.add(new AssignmentCourse("Programming Lab"));
        cousrelist.add(new ResearchCourse("AI Research"));
        CourseUtils.printCourse(cousrelist);
    }
}