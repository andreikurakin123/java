package task_1;

public class Person{
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public void greet() {
        System.out.print(String.format("Hello! My name is %s!", this.name));
    }
}
