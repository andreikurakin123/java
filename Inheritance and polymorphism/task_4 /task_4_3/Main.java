class Animal {
    public void makeSound() {
        System.out.println("Животное издает звук");
    }
    
    public void eat(String food) {
        System.out.println("Животное ест " + food);
    }
}

class Dog extends Animal {
    // 1. ПРАВИЛЬНОЕ ПЕРЕОПРЕДЕЛЕНИЕ
    @Override
    public void makeSound() {
        System.out.println("Собака лает: Гав-гав!");
    }
    
    // 2. СЛУЧАЙНАЯ ОПЕЧАТКА В ИМЕНИ МЕТОДА
    @Override  // ← КОМПИЛЯТОР ВЫДАСТ ОШИБКУ ЗДЕСЬ!
    public void makeSoud() {  // Опечатка: "makeSoud" вместо "makeSound"
        System.out.println("Гав-гав!");
    }
    
    // 3. ОШИБКА В ПАРАМЕТРАХ МЕТОДА
    @Override  // ← КОМПИЛЯТОР ВЫДАСТ ОШИБКУ ЗДЕСЬ!
    public void eat(int food) {  // Параметр int вместо String
        System.out.println("Собака ест " + food + " кг корма");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        dog.makeSoud();  // Этот метод существует, но не переопределяет метод родителя
        dog.eat("мясо");
    }
}