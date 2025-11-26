//answer.md
interface Greeter {
    void greet(); // метод без реализации
}

class EnglishGreeter implements Greeter {
    @Override
    public void greet() {
        System.out.println("Hello!");
    }
}

class RussianGreeter implements Greeter {
    @Override
    public void greet() {
        System.out.println("Привет!");
    }
}

public class Main {
    public static void main(String[] args) {
        var greeter1 = new EnglishGreeter(); // var → тип определяется как EnglishGreeter
        var greeter2 = new RussianGreeter(); // var → тип определяется как RussianGreeter

        greetSomeone(greeter1);
        greetSomeone(greeter2);
    }

    // Метод принимает интерфейс — любой класс, реализующий Greeter
    public static void greetSomeone(Greeter greeter) {
        greeter.greet(); 
    }
}
