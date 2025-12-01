public class A {
    public static int a = 1;
    public static int b;

    public static void printVars() {
        System.out.println(a);
        System.out.println(b);
    }
}

public class Main {
    public static void main(String[] args) {
        // Прямой вызов через имя класса
        A.printVars();
        
        // Через объект класса
        A obj = new A();
        obj.printVars();
        
        // Через наследование
        B bObj = new B();
        bObj.printVars();
    }
}

class B extends A {
    // Может вызывать printVars() напрямую
    public void test() {
        printVars();
    }
}