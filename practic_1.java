
class Animal {
    public void makeSound() {
        System.out.println("Животное издает звук");
    }
}

// Соблюдает LSP
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Гав-гав!");
    }
}

// Соблюдает LSP
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Мяу!");
    }
}

// Использование
public class practic_1 {
    public static void animalConcert(Animal animal) {
        animal.makeSound(); // Всегда работает!
    }
    
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        
        animalConcert(dog); // "Гав-гав!"
        animalConcert(cat); // "Мяу!"
    }
}