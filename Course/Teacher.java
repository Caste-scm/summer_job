public class Teacher extends Person{
    public Teacher(String name, int ID) {
        super(name, ID);
    }

    @Override
    public String print() {
        return "Teacher: " + name + " (ID: " + ID + ")";
    }
}
