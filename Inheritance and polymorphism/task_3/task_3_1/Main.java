// Родительский класс
class Animal {
    String name = "Животное"; // Переменная родительского класса
    
    // Конструктор родительского класса
    Animal() {
        System.out.println("Создано животное");
    }
    
    // Метод родительского класса
    void makeSound() {
        System.out.println("Животное издает звук");
    }
}

// Дочерний класс
class Dog extends Animal {
    String name = "Собака"; // Переменная дочернего класса с тем же именем
    
    // 1. Вызов конструктора родительского класса
    Dog() {
        super(); // Вызов конструктора родительского класса
        System.out.println("Создана собака");
    }
    
    void displayNames() {
        // 2. Доступ к переменной родительского класса
        System.out.println("Имя из родительского класса: " + super.name);
        System.out.println("Имя из дочернего класса: " + this.name);
    }
    
    @Override
    void makeSound() {
        // 3. Вызов метода родительского класса
        super.makeSound(); // Вызываем метод родителя
        System.out.println("Собака лает: Гав-гав!");
    }
}

// Основной класс для демонстрации
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println("\n--- Вызов displayNames() ---");
        dog.displayNames();
        
        System.out.println("\n--- Вызов makeSound() ---");
        dog.makeSound();
    }
}