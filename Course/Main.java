import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student alice = new Student("Alice",1);
        Student bepi = new Student("Bepi",2);
        Student yuri = new Student("Yuri",3);
        List<Student> students = new ArrayList<>();
        students.add(alice);
        students.add(bepi);
        students.add(yuri);

        Teacher marco = new Teacher("Marco",1);
        Teacher frank = new Teacher("Frank", 2);
        Teacher richard = new Teacher("Richard", 3);
        Teacher paula = new Teacher("Paula", 4);
        Teacher maria = new Teacher("Maria", 5);
        List<Teacher> teachers = new ArrayList<>();
        teachers.add(marco);
        teachers.add(frank);
        teachers.add(richard);
        teachers.add(paula);
        teachers.add(maria);

        Course cs101 = new Course("CS101", "Introduction to Programming");
        Course cs102 = new Course("CS102", "Introduction to Algorithm");
        List<Course> courses = new ArrayList<>();
        courses.add(cs101);
        courses.add(cs102);

        cs101.addTeacher(marco);
        cs101.addTeacher(frank);
        cs101.addTeacher(richard);

        cs102.addTeacher(paula);
        cs102.addTeacher(maria);
        cs102.addTeacher(richard);

        alice.enroll(cs101);
        bepi.enroll(cs101);
        bepi.enroll(cs102);

        for (Student s : students) {
            System.out.println("Student Name: " + s.getName());
            System.out.println("Student ID: " + s.getID());
            System.out.println("Enrolled Courses: " + s.getCourses().size());
            if (s.getCourses().isEmpty()) {
                System.out.println("Courses: {}");
            } else {
                System.out.print("Courses: {");
                for (int i = 0; i < s.getCourses().size(); i++) {
                    System.out.print(s.getCourses().get(i).getCode());
                    if (i < s.getCourses().size() - 1) {
                        System.out.print(",");
                    }
                }
                System.out.println("}");
            }
            System.out.println();
        }
        System.out.println("===== COURSE REPORT =====");
        for (Course c : courses) {
            System.out.println("Course Code: " + c.getCode());
            System.out.println("Course Name: " + c.getName());
            System.out.println("Enrolled Students: " + c.getStudents().size());

            System.out.print("Teacher: {");
            for (int i = 0; i < c.getTeachers().size(); i++) {
                System.out.print(c.getTeachers().get(i).getName());
                if (i < c.getTeachers().size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("}");
            for (Student s : c.getStudents()) {
                System.out.println(" - " + s.getName());
            }
            System.out.println();
        }
    }
}