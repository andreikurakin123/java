// Родительский класс
class Animal {
    // Метод, который будем переопределять
    public String makeSound() {
        return "Животное издает звук";
    }
}

// Дочерний класс
class Cat extends Animal {
    // 1. ПРАВИЛЬНОЕ ПЕРЕОПРЕДЕЛЕНИЕ - тот же тип возвращаемого значения
    @Override
    public String makeSound() {
        return "Кошка мяукает: Мяу!";
    }
}

// Пример с ошибкой - попытка изменить тип возвращаемого значения
class Dog extends Animal {
    // 2. НЕПРАВИЛЬНО - попытка изменить тип возвращаемого значения
    // Этот код НЕ СКОМПИЛИРУЕТСЯ!
    /*
    @Override
    public int makeSound() {  // ОШИБКА: тип int вместо String
        return 5;
    }
    */
    
    // 3. КОВАРИАНТНЫЙ ТИП ВОЗВРАТА - можно сузить тип (String → String)
    // Но нельзя изменить на произвольный тип (String → int)
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        
        System.out.println("Животное: " + animal.makeSound());
        System.out.println("Кошка: " + cat.makeSound());
        
        // Полиморфизм
        Animal myCat = new Cat();
        System.out.println("Полиморфизм: " + myCat.makeSound());
    }
}