import java.util.ArrayList;
import java.util.List;

public class Course {
    private String code;
    private String name;
    private List<Teacher> teachers;
    private List<Student> students;

    public Course(String code, String name) {
        this.code = code;
        this.name = name;
        this.teachers = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public List<Student> getStudents() {
        return students;
    }
    public void addStudent(Student student){
        if (!students.contains(student)){
            students.add(student);
        }
    }
    public void removeStudent(Student student){
        if (students.contains(student)){
            students.remove(student);
        }
    }
    public void addTeacher(Teacher teacher){
        if(!teachers.contains(teacher)){
            teachers.add(teacher);
        }
    }
}
