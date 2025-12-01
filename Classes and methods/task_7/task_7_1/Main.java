import java.util.*;

class Box<T> {
    private T value;
    
    public Box(T value) {
        this.value = value;
    }
}

public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>("Hello");
        Box<Integer> intBox = new Box<>(123);
        List<String> stringList = new ArrayList<>();
        
        // Проверка объектов параметризованных классов
        System.out.println(stringBox instanceof Box);          // true
        System.out.println(stringBox instanceof Box<?>);       // true
        
        // Нельзя проверять с конкретным параметром типа
        // System.out.println(stringBox instanceof Box<String>); // Ошибка компиляции
        
        // С коллекциями
        System.out.println(stringList instanceof List);        // true
        System.out.println(stringList instanceof List<?>);     // true
        
        // С наследованием
        if (stringBox instanceof Object) {
            System.out.println("Все объекты - instanceof Object"); // true
        }
    }
}