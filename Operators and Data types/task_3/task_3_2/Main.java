class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

public class InstanceofExample {
    public static void main(String[] args) {
        Animal animal = new Dog();
        Animal nullAnimal = null;
        
        // Проверки с реальными объектами
        System.out.println(animal instanceof Animal);  // true
        System.out.println(animal instanceof Dog);     // true  
        System.out.println(animal instanceof Cat);     // false
        
        // Проверка с null
        System.out.println(nullAnimal instanceof Animal);  // false
        System.out.println(nullAnimal instanceof Dog);     // false
        System.out.println(nullAnimal instanceof Object);  // false
    }
}