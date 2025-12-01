import java.util.*;

class Animal {
    public void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Meow!");
    }
}

public class Main {
    
    // <? extends T> - ЧТЕНИЕ (producer)
    public static void printAnimals(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.sound(); // Можно читать как Animal
        }
        
        // Нельзя добавлять (кроме null)
        // animals.add(new Dog()); // Ошибка компиляции
    }
    
    // <? super T> - ЗАПИСЬ (consumer)  
    public static void addDogs(List<? super Dog> dogs) {
        dogs.add(new Dog()); // Можно добавлять Dog и его подтипы
        
        // Нельзя читать как конкретный тип
        // Dog dog = dogs.get(0); // Ошибка компиляции
    }
    
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        List<Dog> dogs = new ArrayList<>();
        List<Cat> cats = new ArrayList<>();
        
        // <? extends Animal> - принимает Animal и его подтипы
        printAnimals(animals); 
        printAnimals(dogs);    
        printAnimals(cats);    
        
        // <? super Dog> - принимает Dog и его супертипы
        addDogs(animals);      // List<Animal> super Dog
        addDogs(dogs);         // List<Dog> super Dog
        // addDogs(cats);      // List<Cat> не super Dog
        
        // PECS: Producer Extends, Consumer Super
        List<Object> objects = new ArrayList<>();
        addDogs(objects);      // List<Object> super Dog
    }
}