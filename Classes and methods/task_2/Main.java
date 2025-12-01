class Animal {
    // Переопределение
    public void makeSound() {
        System.out.println("Животное издает звук");
    }
    
    // Перегрузка 
    public void eat() {
        System.out.println("Животное ест");
    }
    
    public void eat(String food) {
        System.out.println("Животное ест " + food);
    }
    
    public void eat(String food, int amount) {
        System.out.println("Животное ест " + amount + " порций " + food);
    }
}

class Cat extends Animal {
    // Переопределение метода
    @Override
    public void makeSound() {
        System.out.println("Кот говорит: Мяу!");
    }
    
    // Перегрузка в подклассе
    public void eat(String food, boolean isHungry) {
        if (isHungry) {
            System.out.println("Кот жадно ест " + food);
        } else {
            System.out.println("Кот воротит нос от " + food);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        
        // Переопределение
        animal.makeSound();  // Животное издает звук
        cat.makeSound();     // Кот говорит: Мяу!
        
        // Перегрузка
        cat.eat();                      // Животное ест
        cat.eat("рыбу");                // Животное ест рыбу
        cat.eat("рыбу", 3);             // Животное ест 3 порций рыбу
        cat.eat("рыбу", true);          // Кот жадно ест рыбу
        
        // Полиморфизм
        Animal catAsAnimal = new Cat();
        catAsAnimal.makeSound();        // Кот говорит: Мяу! (переопределение работает)
        catAsAnimal.eat("мясо");        // Животное ест мясо (перегрузка родителя)
    }
}