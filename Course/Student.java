import java.util.ArrayList;
import java.util.List;

public class Student extends Person implements Enrollable{
    private List<Course> courses;

    public Student(String name, int ID) {
        super(name, ID);
        this.courses = new ArrayList<>();
    }

    public List<Course> getCourses() {
        return courses;
    }

    @Override
    public void enroll(Course course) {
        if(!courses.contains(course)){
            courses.add(course);
            course.addStudent(this);
        }
    }

    @Override
    public void drop(Course course) {
        if(courses.contains(course)){
            courses.remove(course);
            course.removeStudent(this);
        }
    }

    @Override
    public String print() {
        return "Student: " + name + " (ID: " + ID + ")";
    }
}
