public class A {
    public final int a;
    
    // 1. Инициализация в конструкторе
    public A() {
        a = 10;
    }
    
    // 2. Инициализация в конструкторе с параметром
    public A(int value) {
        a = value;
    }
    
    // 3. Инициализация в блоке инициализации
    {
        // a = 5; // Можно, но только в одном месте
    }
}

public class Main {
    public static void main(String[] args) {
        A obj1 = new A();       // a = 10
        A obj2 = new A(25);     // a = 25
        
        System.out.println(obj1.a);
        System.out.println(obj2.a);
    }
}