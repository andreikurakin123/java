package task_1;

public class Main {
    public static void greet(Person person) {
        person.greet();
        System.out.println();
    }

    public static void main(String[] args) {
        greet(new Person("Andrei"));
        greet(new Student("Kurakin"));
    }
}