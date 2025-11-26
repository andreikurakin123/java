package task_1;

public class Student extends Person {
    public Student(String name) {
        super(name);
    }

    public void greet() {
        super.greet();
        System.out.print("student!");
    }
}